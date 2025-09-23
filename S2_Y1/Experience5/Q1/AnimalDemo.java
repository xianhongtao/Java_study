package Experience5.Q1;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("动物类型: " + dog.type);
        dog.sound();

        System.out.println("动物类型: " + cat.type);
        cat.sound();
    }
}

abstract class Animal {
    public String type;

    public abstract void sound();
}

class Dog extends Animal {
    public Dog() {
        this.type = "狗";
    }

    @Override
    public void sound() {
        System.out.println("汪汪");
    }
}

class Cat extends Animal {
    public Cat() {
        this.type = "猫";
    }

    @Override
    public void sound() {
        System.out.println("喵喵");
    }
}