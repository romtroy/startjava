package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender;
    String name;
    int height;
    int weight;
    int age;
    
    public Person(String gender, String name, int height, int weight, int age) {
        this.gender = gender;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
    void walk() {
        System.out.println("walk");
    }

    void sit() {
        System.out.println("sit");
    }

    void run() {
        System.out.println("run");
    }

    void talk() {
        System.out.println("talk");
    }

    void learnJava() {
        System.out.println("learn Java");
    }
}
