package org.example.Builder.entities;

public class Dog {
    private String name; // optional
    private String gender; // cannot change
    private String breed; // cannot change
    private double price;

    public Dog(DogBuilder builder) {
        this.name = builder.getName();
        this.gender = builder.getGender();
        this.breed = builder.getBreed();
        this.price = builder.getPrice();
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        String s = "name :" + this.name + " , ";
        s += "gender :" + this.gender + " , ";
        s += "breed :" + this.breed + " , ";
        s += "price :" + this.price;
        return s;
    }

    public static class DogBuilder{
        private String name; // optional
        private String gender; // cannot change
        private String breed; // cannot change
        private double price;

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name){
            this.name = name;
            return this;
        }

        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed){
            this.breed = breed;
            return this;
        }

        public double getPrice () {
            return price;
        }

        public DogBuilder setPrice(double price){
            this.price = price;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }

    }
}

