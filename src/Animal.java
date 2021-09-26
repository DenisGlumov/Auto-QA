/**
 * HomeWorkApp6
 *
 * @author Denis Glumov
 * @version 26.09.2021
 */

abstract class Animal implements IAnimal {
    protected String name;
    protected int len;
    protected int len2;

    Animal(String name, int len, int len2) {
        this.name = name;
        this.len = len;
        this.len2 = len2;

    }
}
