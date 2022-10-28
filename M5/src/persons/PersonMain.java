package persons;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Eliot Martin", 21);
        System.out.println(person1.getClass());
        System.out.println(Integer.toHexString(person1.hashCode()));
        System.out.println(person1.toString());
        Person person = new Person("Asterix", 32);
        System.out.println(person.toString());
        Object object = new Object();
        System.out.println(object.toString());
        person1.display();
    }
}
