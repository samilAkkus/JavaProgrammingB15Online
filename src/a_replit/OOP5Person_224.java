package a_replit;

public class OOP5Person_224 {

    private String firstName;
    private String lastName;
    private int age;

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
        this.age = age;
    }

    @Override
    public String toString() {
        return  this.firstName + " | "+this.lastName+" | "+this.age;
    }

    public OOP5Person_224() {

        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;

    }

    public OOP5Person_224(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
