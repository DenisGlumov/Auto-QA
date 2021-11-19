package Course1;

/**
 * HomeWorkApp7
 *
 * @author Denis Glumov
 * @version 02.10.2021
 */

public class HomeWorkApp7 {
    public static void main(String[] args) {
        Cat2[] cat2s = {new Cat2("Barsik", 5), new Cat2("Sony", 10), new Cat2("Vasy", 15), new Cat2("Murzik", 20)};
        Plate plate = new Plate(55, 45);
        System.out.println(plate);

        for (Cat2 c : cat2s) {
            c.eat(plate);
            System.out.println(c);
        }
        System.out.println(plate);

        plate.add(10);
        System.out.println(plate);

        for (Cat2 c : cat2s) {
            c.eat(plate);
            System.out.println(c);
        }
        System.out.println(plate);
    }
}
