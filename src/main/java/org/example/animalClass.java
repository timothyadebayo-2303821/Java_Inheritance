package org.example;
//1. Inheritance Type - Single Inheritance

//Parent Class/Base Class/Super Class
class animalClass{
    void eats(){
        System.out.println("Every animal eats food.");
    }
}

//Child Class/Derived Class/Sub Class
class dog extends animalClass{
    void makeSounds(){
        String animalName = "Dog";
        System.out.println(animalName + " makes a barking sound");
    }
}

//2. Multi-Level Inheritance

class mammals extends animalClass{

    void bodyType(){
        System.out.println("Mammals body can be fury or hairy");
    }

}

class humanBeing extends mammals{
    void walkType(){
        System.out.println("Humans walk with only two legs");
    }
}

//3. Hierarchical Inheritance

class whales extends mammals{

    void habitat(){
        System.out.println("Whales live inside the water");
    }
}

class monkey extends mammals{
    void habitat(){
        System.out.println("Monkeys live on land, usually on the trees");
    }
}

//4. Multiple Inheritance

class herbivores{

    void eats(){
        System.out.println("They eat only plants");
    }
}

class carnivores{

    void eats(){
        System.out.println("They eat only meat(other animals)");
    }
}
