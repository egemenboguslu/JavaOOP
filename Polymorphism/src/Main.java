class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        return this.getName() + " Animal is speaking...";
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is miaowing.. ";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is barking..";
    }
}

class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is neighing..";
    }
}

public class Main {

    public static void konustur(Animal animal){
        System.out.println(animal.speak());
    }

    public static void main(String[] args) {

        /*Animal animal1 = new Cat("Tekir");
        Animal animal2 = new Dog("Tom");
        Animal animal3 = new Horse("Gülbatur");

        System.out.println(animal1.speak());
        System.out.println(animal2.speak());
        System.out.println(animal3.speak());*/

        konustur(new Cat("Jerry"));
        konustur(new Dog("Tom"));
        konustur(new Horse("Şahbatur"));
    }
}