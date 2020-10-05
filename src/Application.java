import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application {
    public static void main(String[] args) throws ParseException {

        User u1 = new User("Vasile", "Petrov", 20, "vasile.petrov@gmail.com", Status.NEW, "9.10.2020");
        User u2 = new User("Adelaida", "Nistor", 22, "adelaida.nistor@gmail.com", Status.INACTIVE, "6.09.2020");
        User u3 = new User("Ada", "Albu", 33, "ada.albu@mail.ru", Status.NEW, "5.9.2020");
        User u4 = new User("Geanina", "Petrescu", 17, "geanina.petrescu@gmail.com", Status.BLOCKED, "12.7.2018");
        User u5 = new User("Fabian", "Manole", 18, "fabian.manole@gmail.com", Status.NEW, "2.12.2019");
        User u6 = new User("Fanel", "Sava", 13, "fanel.sava@gmail.com", Status.NEW, "3.9.2020");
        User u7 = new User("Emanuel", "Puscasu", 29, "emanuel.puscasu@gmail.com", Status.NEW, "10.10.2020");
        User u8 = new User("Edmond", "Leontea", 26, "edmond.leontea@yahoo.fr", Status.ACTIVE, "4.10.2020");
        User u9 = new User("Filip", "Ifrim", 45, "filip.ifrim@gmail.com", Status.ACTIVE, "5.8.2020");
        User u10 = new User("Felix", "Andronache", 56, "felix.andronache@gmail.com", Status.NEW, "3.7.2020");
        User u11 = new User("Gelu", "Lupu", 24, "gelu.lupu@gmail.com", Status.NEW, "8.5.2020");
        User u12 = new User("Haralambie", "Ursu", 32, "haralambie.ursu@gmail.com", Status.NEW, "1.10.2020");
        User u13 = new User("Ilarion", "Voinea", 30, "ilarion.voinea@gmail.com", Status.NEW, "4.8.2020");
        User u14 = new User("Iancu", "Diaconu", 40, "iancu.diaconu@gmail.com", Status.INACTIVE, "24.3.2020");
        User u15 = new User("Luca", "Dobre", 16, "luca.dobre@gmail.com", Status.NEW, "13.12.2019");

        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(u1);
        userArrayList.add(u2);
        userArrayList.add(u3);
        userArrayList.add(u4);
        userArrayList.add(u5);
        userArrayList.add(u6);
        userArrayList.add(u7);
        userArrayList.add(u8);
        userArrayList.add(u9);
        userArrayList.add(u10);
        userArrayList.add(u11);
        userArrayList.add(u12);
        userArrayList.add(u13);
        userArrayList.add(u14);
        userArrayList.add(u15);

        // After changing status for NEW users whose timestamp when they were registered in the system is older than yesterday
        userArrayList = changeStatusForNewUsers(userArrayList);
        for (User user : userArrayList) {
            System.out.println(user);
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");
        // After changing status for INACTIVE users that where registered more than 1 month ago and set their status to BLOCKED
        userArrayList = changeStatusForInactiveUsers(userArrayList);
        for (User user : userArrayList) {
            System.out.println(user);
        }

    }

    private static Date getYesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return cal.getTime();
    }

    private static Date aMonthAgo() {
        Calendar c = new GregorianCalendar();
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        return c.getTime();
    }

    private static ArrayList<User> changeStatusForNewUsers(ArrayList<User> userArrayList) {
        Date yesterday = getYesterday();
        for (User user : userArrayList) {
            if (user.getStatus().toString().equals("NEW") & (user.getTimeStamp().compareTo(yesterday) < 0)) {
                user.setStatus(Status.ACTIVE);
            }
        }
        return userArrayList;
    }

    private static ArrayList<User> changeStatusForInactiveUsers(ArrayList<User> userArrayList) {
        Date aMonthAgo = aMonthAgo();
        for (User user : userArrayList) {
            if (user.getStatus().toString().equals("INACTIVE") & (user.getTimeStamp().compareTo(aMonthAgo) < 0)) {
                user.setStatus(Status.BLOCKED);
            }
        }
        return userArrayList;
    }

}
