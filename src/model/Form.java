package model;

public abstract class Form {

    abstract double CalculateArea();

    public double print(){
        System.out.println("I am a form");
        return 0;
    }
}
