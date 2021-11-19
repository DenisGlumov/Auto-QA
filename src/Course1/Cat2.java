package Course1;

/**
 * HomeWorkApp7
 *
 * @author Denis Glumov
 * @version 02.10.2021
 */

public class Cat2 {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }
/**
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
 */

    void eat (Plate plate){
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "name: " + name + " appetite: " + appetite + " satiety: " + fullness;
    }

}
