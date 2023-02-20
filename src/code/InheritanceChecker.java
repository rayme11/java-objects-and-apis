package code;

import model.Employee;
import model.Person;
import model.Rectangle;

public class InheritanceChecker {

    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        person.setName("Ray");
        employee.setName("Karen");
        System.out.println(employee.getName());

        //Overloading methods
        Rectangle rectangle = new Rectangle();

    }
}
