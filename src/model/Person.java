package model;

public class Person {

    public Person(){
        System.out.println("This is called before anything else from the child class - default constructor");
    }

    public Person(String name){
        System.out.println("This is called before anything else from the child class - second constructor");
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    private String gender;


}


