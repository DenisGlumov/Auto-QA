public class HomeWorkApp5 {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Stepanov Maxim", "QA", "Stepanov@mailbox.com", "892312302", 50000, 20);
        persArray[2] = new Person("Davidov Denis", "PM", "Davidov@mailbox.com", "892312303", 60000, 40);
        persArray[3] = new Person("Titov Egor", "Analyst", "Titov@mailbox.com", "892312304", 70000, 60);
        persArray[4] = new Person("Karpin Valery", "Engineer", "Karpin@mailbox.com", "892312305", 80000, 50);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}
