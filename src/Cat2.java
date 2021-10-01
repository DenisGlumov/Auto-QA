/**
 * HomeWorkApp7
 *
 * @author Denis Glumov
 * @version 02.10.2021
 */

public class Cat2 {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate p) {
        if (!satiety && p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;

        }
        if (satiety) {
            satiety = true;
        } else {
            satiety = false;
        }

    }

    @Override
    public String toString() {
        return "name: " + name + " appetite: " + appetite + " satiety: " + satiety;
    }

}
