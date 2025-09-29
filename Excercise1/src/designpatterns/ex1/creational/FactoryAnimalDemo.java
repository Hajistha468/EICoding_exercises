package designpatterns.ex1.creational;

interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() { System.out.println("Woof!"); }
}

class Cat implements Animal {
    public void speak() { System.out.println("Meow!"); }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) return new Dog();
        else if (type.equalsIgnoreCase("cat")) return new Cat();
        throw new IllegalArgumentException("Unknown");
    }
}

public class FactoryAnimalDemo {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.createAnimal("dog");
        a1.speak();
        Animal a2 = AnimalFactory.createAnimal("cat");
        a2.speak();
    }
}
