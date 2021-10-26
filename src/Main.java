import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();



    }

    public static void printOlderAnimalsToFile(List<Animal> animals, int minAge, String fileName) {

        try (PrintWriter fileOut = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            for (Animal a : animals) {
                if (a.getAge() >= minAge) {
                    fileOut.println(a.getName());
                }
            }
            System.out.println("Writing to file is complete.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int countAdoptableAnimals(List<Animal> animals) {
        int count = 0;

        for (Animal a : animals) {
            if (a.getStatus().isEligibleForAdoption()) {
                count++;
            }
        }

        return count;
    }

    public static void adoptionUpdates(Map<String, Animal> animalMap, List<String> animalNameList) {

        for (String s : animalNameList) {
            Animal animal = animalMap.get(s);

            if (animal != null) {
                animal.adopt();                     // Assumes this method in Animal class updates adoption status
            }
        }

    }
}
