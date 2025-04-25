package org.example;

public class Main{

    public static void main(String [] args){

        dog myobj1 = new dog();
        myobj1.eats();
        myobj1.makeSounds();

        humanBeing myobj3 = new humanBeing();
        myobj3.walkType();
        myobj3.bodyType();
        myobj3.eats();

        whales myobj2 = new whales();
        myobj2.habitat();
        myobj2.bodyType();
        myobj2.eats();

        monkey myobj4 = new monkey();
        myobj4.habitat();
        myobj4.bodyType();
        myobj4.eats();

    }

}