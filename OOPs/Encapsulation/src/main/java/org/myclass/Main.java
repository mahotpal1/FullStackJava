package org.myclass;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Vishal", 25, "Male");
        //p1.age = -5; this is incorrect, so we made the property as private.
        p1.setName("Harsh");
        p1.setAge(14);
        System.out.println(p1);
    }
}
