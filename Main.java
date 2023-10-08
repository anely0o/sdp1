import java.util.Random;

public class Main {
    public static void main(String[] args) {
        factoryMethod factory = new factoryMethod();
        factoryMethod.AnimalFactory animalFactory = factory.new RandomAnimalFactory();
        animalFactory.operation();
    }
}
