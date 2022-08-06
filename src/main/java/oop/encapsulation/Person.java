package oop.encapsulation;

public class Person {

    private int age; // defining encapsulation of the age attribute

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {

        if (age > 0) { // As I did here, it is possible to define some logic inside the setters and getters, however, it is not considered a good practice by many.
            this.age = age;
        } else {
            throw new Exception("You cannot define an age that is less or equals 0.");
        }
    }
}
