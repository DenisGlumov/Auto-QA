/**
 * HomeWorkApp6
 *
 * @author Denis Glumov
 * @version 26.09.2021
 */

class Dog extends Animal {
    Dog(String name, int len, int len2) {
        super(name, len, len2);
    }

    public void run(int len) {
        if (len > 500) {
            System.out.println(name + " не может столько пробежать");
        } else {
            System.out.println(name + " пробежал " + len + " м");
        }
    }

    public void swim(int len2) {
        if (len2 > 10) {
            System.out.println(name + " не может столько проплыть");
        } else {
            System.out.println(name + " проплыл " + len2 + " м");
        }
    }

}
