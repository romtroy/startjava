package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String origin;
    private float height;
    private int speed;
    
    public Jaeger() {
    }
    
    public Jaeger(String modelName, String origin, float height, int speed) {
        this.modelName = modelName;
        this.origin = origin;
        this.height = height;
        this.speed = speed;
    }
    
    public String getModelName() {
        return modelName; 
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    public String getOrigin() {
        return origin; 
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public float getHeight() {
        return height; 
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public int getSpeed() {
        return speed; 
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean drift() {
        System.out.println("drift!!!");
        return true; 
    }
}