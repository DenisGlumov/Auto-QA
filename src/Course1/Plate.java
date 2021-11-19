package Course1;

/**
 * HomeWorkApp7
 *
 * @author Denis Glumov
 * @version 02.10.2021
 */

public class Plate {
    private int food;
    private int volume;

    public Plate(int volume, int food) {
        this.food = food;
        this.volume = volume;
    }

    boolean decreaseFood(int portion) {
        if (food<portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
    //* Оставил для наглядности, как мы переопределяем методы
    //   public void info() {
    //    System.out.println("plate: " + food);
    //}

    public void add(int food) {
        if (this.food + food <= volume ) {
            this.food +=food;
        }
    }

    //public int getFood() {
    //    return food;
   // }
}
