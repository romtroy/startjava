package com.startjava.lesson_2.animal;

public class Wolf {
    private String nick;
    private String gender;
    private String color;
    private float weight;
    private int age;
    
    public Wolf(String nick, String gender, String color, float weight, int age) {
        this.nick = nick;
        this.gender = gender;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }
    
    public void setNick(String nick) {
        this.nick = nick;
    }
    
    public String getNick() {
        return nick;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        }  
        this.age = age;     
    }
    
    public int getAge() {
        return age;
    }
    
    public void move() {
        System.out.println("move");
    }

    public void sit() {
        System.out.println("sits");
    }

    public void run() {
        System.out.println("runs");
    }

    public void howl() {
        System.out.println("Woof!");
    }
    
    public void hunt() {
        System.out.println("hunts");
    }
}