package ru.geekbrains.lesson6;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Animal {
    String name;

    public Animal(String cat) {


        class Cat extends Animal {

            Animal animal = new Animal("Cat");

            public Cat(String cat) {
                super(cat);
            }

            class Dog extends Animal {

                Animal animal = new Animal("Dog");

                public Dog(String dog) {
                    super(dog);
                }


            }
        }
    }
}
