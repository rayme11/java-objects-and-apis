package model;

public class Employee extends Person{

    public Employee(){
        super("My new name");
        System.out.println("This is in the child class constructor");
    }
    private String employeeId;
    private String title;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
