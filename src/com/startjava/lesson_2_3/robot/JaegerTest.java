package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
                
        jaegerOne.setModelName("Apex");
        jaegerOne.setHeight(88f);
        jaegerOne.setSpeed(5);
        
        System.out.println("modelName: " + jaegerOne.getModelName() + "; " + 
                "origin: " + jaegerOne.getOrigin() + "; " +
                "height: " + jaegerOne.getHeight() + "; " +
                "speed: " + jaegerOne.getSpeed());
        
        Jaeger jaegerTwo = new Jaeger("Acid Geisha", "Japan", 55.4f, 4);
        System.out.println("modelName: " + jaegerTwo.getModelName() + "; " +
                "origin: " + jaegerTwo.getOrigin() + "; " +
                "height: " + jaegerTwo.getHeight() + "; " +
                "speed: " + jaegerTwo.getSpeed());
        
        jaegerOne.drift();
    }
}
