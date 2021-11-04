import java.io.*;
import java.util.*;

public abstract class Animal implements Comparable<Animal> {

    private String name;
    private int age;
    private Exercisable exercise;
    private AnimalStatus status;

    public static final AnimalAgeComparator ANIMAL_AGE_COMPARATOR = new AnimalAgeComparator();

    public Animal(String name, int age, Exercisable exercise, AnimalStatus status) {
        this.name = name;
        this.exercise = exercise;
        this.age = age;
        this.status = status;
    }

    public AnimalStatus getStatus() {
        return status;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public Exercisable getExercise() {
        return exercise;
    }

    public void setExercise(Exercisable exercise) {
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal other = (Animal) obj;
            return name.equalsIgnoreCase(other.getName()) && age == other.getAge();
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Animal obj) {
        if (name.compareTo(obj.getName()) != 0) {
            return name.compareTo(obj.getName());
        } else {
            return (Integer.compare(age, obj.getAge()));
        }
    }

    public void exercise() {
        exercise.exercise();
    }

    public void adopt() {
        System.out.println("Adoption status has been updated.");
    }

    public static class AnimalAgeComparator implements Comparator<Animal> {

        public int compare(Animal a1, Animal a2) {
            return (Integer.compare(a1.getAge(), a2.getAge()));
        }
    }

}
