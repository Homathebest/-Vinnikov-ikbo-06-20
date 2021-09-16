package com.company;

public class Person {

    String name;
    int age;
    float height;
    Gender gender;

    private static final int MAX_AGE = 200;
    private static final float MAX_HEIGHT = 3.2f;

    Person(){}

    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("Ошибка! Введите имя корректно");
        }
        this.name = name;
    }

    public void setHeight(float height){
        if (height > MAX_HEIGHT){
            System.out.println("Ошибка! Рост слишком большой! Введите рост корректно");
        }
        else{
            this.height = height;
        }
    }

    public void setAge(int age){
        if (age > MAX_AGE){
            System.out.println("Ошибка! Возраст слишком большой! Введите возраст корректно");
        }
        else{
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }

    public float getHeight(){
        return height;
    }

    public int getAge(){
        return age;
    }

    public void displayInf(){
        System.out.printf("Name: %s, Age: %d, Height: %.2f", name, age, height);
    }

    public enum Gender{
        MALE(1, "Мужчина"),
        FEMALE(2, "Женщина"),
        OTHER(1024, "Другое");

        private int value;
        private String strvalue;

        Gender(int value, String strgvalue)
        {
            this.value=value;
            this.strvalue = strvalue;
        }
        public int getValue() {
            return value;
        }
        public String getStrvalue() {
            return strvalue;
        }
    }
    public void setGender(Gender gender)
    {
        this.gender = gender;
    }
}