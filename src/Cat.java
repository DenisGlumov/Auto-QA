/**
 * HomeWorkApp6
 *
 * @author Denis Glumov
 * @version 26.09.2021
 */

class Cat extends Animal {
    Cat(String name, int len, int len2) {
        super(name, len, len2);
    }

    public void run(int len) {
        if (len > 200) {
            System.out.println(name + " не может столько пробежать");
        } else {
            System.out.println(name + " пробежал " + len + " м");
        }
    }

    public void swim(int len2) {
        System.out.println(name + " не умеет плавать");
    }

}
