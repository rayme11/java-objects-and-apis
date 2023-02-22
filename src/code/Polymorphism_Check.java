package code;

import model.Animal;
import model.Cat;
import model.Dog;

public class Polymorphism_Check {

    public static void main(String[] args) {
        //Inheritance Example
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal myDogBola = new Dog();
        myDogBola.makeSound();

        //Polymorphism
        myDogBola = new Cat();
        myDogBola.makeSound();

        //TypCasting Example
        ((Cat)myDogBola).scratch();

        //InstanceOf
        System.out.println(myDogBola instanceof Animal);
        feed(myDogBola);

    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("here it is your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("here it is your cat food");
        }

    }
}
