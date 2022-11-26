import animal.Animal;
import animal.AnimalRandom;
import handle.AnimalAction;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        AnimalAction action = new AnimalAction();
        action.match(scanner, animals);
        System.out.println(action.toString());


    }
}
