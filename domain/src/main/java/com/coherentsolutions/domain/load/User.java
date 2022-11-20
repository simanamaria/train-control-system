package com.coherentsolutions.domain.load;

import com.coherentsolutions.domain.carriage.CarriageHelper;

import static com.google.common.base.Preconditions.checkArgument;

public abstract class User extends CarriageHelper {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkArgument(age>=0, "Age must be positive");
        checkArgument(age<=125, "Age must be less the 125");
        this.age = age;
    }

    @Override
    public String toString(){
        return  firstName + " "+ lastName + " age: " +  age;
    }
}
