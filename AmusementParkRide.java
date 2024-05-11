package amusementParkRide;

import java.util.ArrayList;

public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> people;

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.people = new ArrayList<>();
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            System.out.println(person + " is not allowed on the ride");
            return false;
        }
        this.visitors++;
        this.people.add(person);
        System.out.println(person + " is allowed on the ride");
        return true;
    }


    public String toString() {
        String amusementPark;
        String onTheRide = "";
        String averagePeople;
        String tallest;
        if (this.people.isEmpty()) {
            onTheRide = "\n No one is on the ride";
        }
        else {
            onTheRide = "\n The people on the ride are";
            for (Person person: people) {
                onTheRide = onTheRide +  "\n" + person;
            }
        }

        amusementPark = this.name + ", minimum height requirement: " + this.minimumHeight +
                ", visitors: " + this.visitors;

        averagePeople = "\n The average size of people taking the ride is " + this.average();

        tallest = "\n The tallest person on the ride is " + this.tallestPerson();

        return amusementPark + onTheRide + averagePeople + tallest;
    }

    public void removeEveryOneOnRide() {
        this.people.clear();
    }

    public double average() {
        if (this.people.isEmpty()) {
            return -1;
        }
        double sumOfHeights = 0;
        for (Person person: this.people) {
            sumOfHeights += person.getHeight();
        }
        return (double) sumOfHeights / (double) this.people.size();
    }

    public Person tallestPerson() {
        Person tallest = this.people.get(0);
        for (Person person: this.people) {
            if (person.getHeight() > tallest.getHeight()) {
                tallest = person;
            }
        }
        return tallest;
    }
}