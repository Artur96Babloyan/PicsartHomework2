package test;

public class Human {
    public String firstName;
    public String lastName;
    public String fullname;
    private int age;
    public String gender;
    public boolean isArmenian;


    public void setFirstName(String n) {
        firstName = n;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String l) {
        firstName = l;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String g) {
        gender = g;
    }

    public String getGender() {
        return gender;
    }

    public void setFullname(String n, String l) {
        fullname = n + "  " + l;
    }

    public String getFullname() {
        return fullname;
    }

    public void setAge(int a) {
        if (a > 0 && a <= 150) {
            age = a;
        } else {
            System.out.println("Invalid age");
        }

    }

    public int getAge() {
        return age;
    }


}
