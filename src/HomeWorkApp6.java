/**
 * HomeWorkApp6
 *
 * @author Denis Glumov
 * @version 26.09.2021
 */

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200, -1);
        Dog dog = new Dog(500, 10);
        Dog dog2 = new Dog(500, 10);

        IAnimal[] animals = {cat, dog, dog2};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println(("Животных было создано: " + cat.getCountOFAnimals()));//вызывается через cat и работает потомучто переменная countOFAnimals статическая, она всегда одна
    }
}
