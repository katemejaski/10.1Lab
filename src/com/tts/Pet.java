package com.tts;
//1. Create a Pet Class with the following instance variables:
//
//        name (PRIVATE)
//        age (PRIVATE)
//        location (PRIVATE)
//        type (PRIVATE)
//        two constructors empty all attributes
//        Code to be able to access the following (Get Methods):
//        name, age, type
//        Code to be able to change (Set Methods):
//        name, age, location
//        2. Create a Custom Class (anything you want - car, phone, holiday, etc.).

public class Pet {
        private String name;
        private int age;
        private String location;
        private String type;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
            return type;
        }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }


        public Pet() {

        }

        public Pet(String name, int age, String location, String type) {
            this.setName(name);
            this.setAge(age);
            this.setLocation(location);

        }

}


