package com.stackroute;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: "+ this.name +
                "\nAge: "+ this.age+
                "\nGender: "+ this.gender;
    }
}
