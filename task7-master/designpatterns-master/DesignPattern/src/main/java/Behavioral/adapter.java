package Behavioral;

interface Bird{
    public void fly();
    public void makeSound();
}

class Parrot implements Bird{
    @Override
    public void fly() {
        System.out.println("Parrot is Singing");
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak...");
    }
}

interface Duck{
    public void squeak();
}

class PlasticDuck implements Duck{
    @Override
    public void squeak() {
        System.out.println("Quack....");
    }
}

class BirdAdapter implements Duck{
    Bird bird;
    public BirdAdapter(){

    }

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}

public class adapter{
    public static void main(String args[]){
        Parrot parrot = new Parrot();
        Duck duck = new PlasticDuck();
        Duck birdAdapter = new BirdAdapter(parrot);

        System.out.println("Parrot");
        parrot.fly();
        parrot.makeSound();

        System.out.println("Duck");
        duck.squeak();

        System.out.println("Bird Adapter");
        birdAdapter.squeak();
    }
}