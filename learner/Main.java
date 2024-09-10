class Person {
    private String fname;
    private String lname;

    // Getter method for fname
    public String getFname() {
        return fname;
    }

    // Setter method for fname
    public void setFname(String fname) {
        this.fname = fname;
    }

    // Getter method for lname
    public String getLname() {
        return lname;
    }

    // Setter method for lname
    public void setLname(String lname) {
        this.lname = lname;
    }
}

public class Main {
    public static void main(String[] args) {
        Person staff = new Person();
        staff.setFname("Joseph");
        staff.setLname("Musa");

        //use setter for student object

        System.out.println("My name is " + staff.getFname() + " " +staff.getLname());
    }
}