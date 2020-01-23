package test;

import animals.*;

public class TutorialSteg2 {

    public static void main(String[] args) {
        Animal kurre = new Cat("Kurre");
        Animal vilma = new Dog("Vilma");
        
        kurre.age = 6;
        vilma.age = 3;
        
        kurre.introduceYourself();
        vilma.introduceYourself();
    }
}