/**
 * HomeWorkApp7
 *
 * @author Denis Glumov
 * @version 02.10.2021
 */

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
    //* Оставил для наглядности, как мы переопределяем методы
    //   public void info() {
    //    System.out.println("plate: " + food);
    //}

    public void additive(int a) {
        food += a;
    }

    public int getFood() {
        return food;
    }
}
