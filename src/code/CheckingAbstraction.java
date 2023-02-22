package code;

import model.Form;

public abstract class CheckingAbstraction extends Form {


    private double length;
    private double width;

    @Override
    public double print() {
        return length * width;

    }
}
