package handle;

import animal.Animal;
import animal.AnimalRandom;
import view.Menu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AnimalAction {
    public Animal match(Scanner scanner, ArrayList<Animal> animal) {
        Animal animals = new Animal();
        Menu menu = new Menu();
        System.out.println("Nhập thông tin Pet của bạn");
        menu.inputYourPet(scanner, animal);
        System.out.println("Thông tin 1 Pet ngẫu nhiên");
        AnimalRandom animalRandom = new AnimalRandom();
        animalRandom.Info(scanner, animal);
        Random random = new Random();
        int i;
        while (true) {
            i = animalRandom.get(random.nextInt(animal.size()));
            if (animal.get(i).getType().equalsIgnoreCase(animals.getType()) && !animal.get(i).getSex().equalsIgnoreCase(animals.getSex())) {
                System.out.println(animal.get(i).toString());
                System.out.println("Bạn có muốn hiện thông tin 1 PET khác: ");
                System.out.println("1. Có");
                System.out.println("2. Không");
                int choice = 0;
                if (choice == 1)
                    continue;
                if (choice == 2)
                    return animal.get(i);
            }
        }
    }
}
