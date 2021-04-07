package test;

public class Human {
    private String firstName;
    private String lastName;
    private String fullname;
    private int age;
    private String gender;
    private boolean isArmenian;


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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String firstName , String lastName ) {
        this.fullname = firstName + "  " +  lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }
}
