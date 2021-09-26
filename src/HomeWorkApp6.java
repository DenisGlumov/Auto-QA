/**
 * HomeWorkApp6
 *
 * @author Denis Glumov
 * @version 26.09.2021
 */

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 200, 100);
        Cat cat2 = new Cat("Barsik", 201, 10);

        Dog dog = new Dog("Muchar", 500, 10);
        Dog dog2 = new Dog("Barbos", 501, 11);

        Animal[] animals = {cat, cat2, dog, dog2};
        for (Animal animal : animals) {
            animal.run(animal.len);
            animal.swim(animal.len2);
        }
    }
}
