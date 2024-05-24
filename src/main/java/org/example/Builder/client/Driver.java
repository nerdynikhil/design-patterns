package org.example.Builder.client;

import org.example.Builder.entities.Dog;

public class Driver {
    public static void main(String[] args) {
        Dog dog1 = new Dog.DogBuilder().setName("Bruno")
                .setGender("Male").setBreed("Pug")
                .setPrice(100).build();

        Dog dog2 = new Dog.DogBuilder().setName("Alissa")
                .setGender("Female").setPrice(299).build();

        System.out.println(dog1);
        System.out.println(dog2);
    }
}
