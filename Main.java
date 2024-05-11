package amusementParkRide;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AmusementParkRide disneyLand = new AmusementParkRide("SpaceMountain", 165);
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Yann", 34, 65, 172));
        people.add(new Person("Johanna", 67, 65, 132));
        people.add(new Person("Alex", 25, 65, 166));
        people.add(new Person("Henri", 56, 54, 143));
        people.add(new Person("Arietta", 56, 54, 200));

        for (Person person: people) {
            disneyLand.isAllowedOn(person);
        }
        System.out.println(disneyLand);
    }
}
