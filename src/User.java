
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private Status status;
    private String timeStamp;

    public User(String firstName, String lastName, int age, String email, Status status, String timeStamp) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
        this.email = email;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Age must be positive ( >0 )");
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}
