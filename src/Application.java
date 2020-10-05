//2) create class Application with main method.
//
//        In this main method you should do the following:
//        - create list of users. To create users - use constructor with all parameters.
//        You can use array or ArrayList(prefferably).
//        Some of the created users should have status as NEW.
//
//        - iterate through the list of users and change status to ACTIVE for NEW users
//        whose timestamp when they were registered in the system is older than yesterday.
//        You can extract this functionality into a separate method
//
//        - BONUS TASK: write a method that will pick up INACTIVE users that where registered more than 1 month ago and set their status to BLOCKED
//
//        All resulting lists you should display in console!

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Application {
    public static void main(String[] args) {
        Date yesterday = getYesterday();
        System.out.println(yesterday);
        User u1 = new User("Vasile","Petrov",20,"vasile.petrov@gmail.com",Status.NEW,new Date(1,10,2020));
        User u2 = new User("Adelaida","Nistor",22,"adelaida.nistor@gmail.com",Status.INACTIVE,new Date(2,10,2020));
        User u3 = new User("Ada","Albu",33,"ada.albu@mail.ru",Status.NEW,new Date(5,9,2020));
        User u4 = new User("Geanina","Petrescu",17,"geanina.petrescu@gmail.com",Status.BLOCKED,new Date(12,07,2018));
        User u5 = new User("Fabian","Manole",18,"fabian.manole@gmail.com",Status.NEW,new Date(2,12,2019));
        User u6 = new User("Fanel","Sava",13,"fanel.sava@gmail.com",Status.NEW,new Date(3,9,2020));
        User u7 = new User("Emanuel","Puscasu",29,"emanuel.puscasu@gmail.com",Status.NEW,new Date(1,10,2020));
        User u8 = new User("Edmond","Leontea",26,"edmond.leontea@yahoo.fr",Status.ACTIVE,new Date(4,10,2020));
        User u9 = new User("Filip","Ifrim",45,"filip.ifrim@gmail.com",Status.ACTIVE,new Date(5,8,2020));
        User u10 = new User("Felix","Andronache",56,"felix.andronache@gmail.com",Status.NEW,new Date(3,7,2020));
        User u11 = new User("Gelu","Lupu",24,"gelu.lupu@gmail.com",Status.NEW,new Date(8,5,2020));
        User u12 = new User("Haralambie","Ursu",32,"haralambie.ursu@gmail.com",Status.NEW,new Date(1,10,2020));
        User u13 = new User("Ilarion","Voinea",30,"ilarion.voinea@gmail.com",Status.NEW,new Date(4,8,2020));
        User u14 = new User("Iancu","Diaconu",40,"iancu.diaconu@gmail.com",Status.INACTIVE,new Date(24,3,2020));
        User u15 = new User("Luca","Dobre",16,"luca.dobre@gmail.com",Status.NEW,new Date(13,12,2019));


    }
    private static Date getYesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String yesterdayString = dateFormat.format(cal.getTime());
        String[] tokens = yesterdayString.split("\\.");
        Date yesterday = new Date(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
        return yesterday;
    }
}
