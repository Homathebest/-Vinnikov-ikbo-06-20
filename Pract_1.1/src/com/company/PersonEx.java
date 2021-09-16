package com.company;

public class PersonEx {
    private String name;
    private int age;
    private float height;
    static final int MAX_AGE = 200;
    private static final float MAX_HEIGHT = 3.2F;

    PersonEx() {
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception("Пустая строка");
        } else {
            this.name = name;
        }
    }

    public void setHeight(float height) throws Exception {
        if (height > 3.2F) {
            throw new Exception("Слишком высокий");
        } else {
            this.height = height;
        }
    }

    public void setAge(int age) throws Exception {
        if (age > 200) {
            throw new Exception("Ошибка! Возраст слишком большой! Введите возраст корректно");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }

    public float getHeight() {
        return this.height;
    }

    public int getAge() {
        return this.age;
    }
}