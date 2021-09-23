/**
 * HomeWorkApp5
 *
 * @author Denis Glumov
 * @version 23.09.2021
 */

class Person {
    private String fio;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    Person(String fio, String position, String email, String number, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return fio + ", " + position + ", " + email + ", " + number + ", " + salary + ", " + age;
    }
}
