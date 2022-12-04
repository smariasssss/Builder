public class Main {

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person person = personBuilder
                .name("Alex")
                .surname("Petrov")
                .age(45)
                .build();
        System.out.println(person.toString());
        person.setAddress("Saint Petersburg");
        Person son = person.newChildBuilder()
                .name("Grigory")
                .build();

        System.out.println(person + " has a son: " + son);

    }
}
