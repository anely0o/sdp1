import java.util.Random;

public class factoryMethod {
    interface Animal {
        void create();
    }
    class Cat implements Animal {
        public void create() {
            System.out.println("Creating a Cat!meow");
        }
    }
    class Dog implements Animal {
        public void create() {
            System.out.println("Creating a Dog!bark");
        }
    }
    abstract class AnimalFactory {
        abstract Animal createAnimal();

        void operation() {
            Animal animal = createAnimal();
            animal.create();
        }
    }
    class RandomAnimalFactory extends AnimalFactory {

        @Override
        Animal createAnimal() {
           Random random = new Random();
           if (random.nextBoolean()) {
               return new Cat();
           } else {
               return new Dog();
           }
        }
    }


}
