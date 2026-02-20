public class Abstract {
    public static void main(String[] args) {
        Dog bunny = new Dog();

    }
}

abstract class Animal {
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
    void eat(){
        System.out.println("eats everything");
    }
    abstract void walk();
};

class Horse extends Animal {
    Horse(){
        System.out.println("horse constructor is called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
};

class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor is called");
    }
        void changeColor(){
        color = "black";
    }
    void walk(){
        System.out.println("dogs walk on four legs");
    }
}