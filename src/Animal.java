/**
 * HomeWorkApp6
 *
 * @author Denis Glumov
 * @version 26.09.2021
 */

abstract class Animal implements IAnimal {
    private int runLimit;
    private int swimLimit;
    private String className;
    private static int countOFAnimals;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOFAnimals++;
    }

    public int getCountOFAnimals() {
        return countOFAnimals;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " не может пробежать " + distance;
        } else {
                return className + " пробежал " + distance;
            }
    }

    public String swim (int distance) {
        if (distance > swimLimit) {
            return className + " не может проплыть " + distance;
        } else {
            return className + " проплыл " + distance;
        }
    }

    @Override
    public String toString() {
        return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }


}
