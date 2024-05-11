package amusementParkRide;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }



    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }
        Person personCompared = (Person) compared;
        return personCompared.name == this.name
                && personCompared.age == this.age
                && personCompared.weight == this.weight
                && personCompared.height == this.height;
    }

}


// As exercise implement the equals method for
// a Person object that has attributes name,
// height, weight and height.

