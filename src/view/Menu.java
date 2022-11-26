package view;

import animal.Animal;
import constant.Sex;
import constant.Type;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void inputYourPet(Scanner scanner, ArrayList<Animal> animals) {
        System.out.print("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Mời nhập giống: ");
        String species = scanner.nextLine();
        System.out.print("Mời nhập  tuổi: ");
        Integer age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập giới tính: ");
        System.out.println("1. Đực");
        System.out.println("2. Cái");
        System.out.print("Mời chọn: ");
        Integer choice1;
        String sex = null;
        try {
            do {
                choice1 = Integer.parseInt(scanner.nextLine());
                if (choice1 == 1 || choice1 == 2)
                    break;
                System.out.println("Chọn sai, mời chọn lại: ");
            } while (true);
            switch (choice1) {
                case 1:
                    sex = Sex.Male.value;
                    break;
                case 2:
                    sex = Sex.Female.value;
                    break;
            }
        } catch (Exception e) {
            System.out.println("Nhập sai, nhập lại: ");
        }

        System.out.println("Mời nhập mô tả: ");
        String description = scanner.nextLine();
        System.out.println("Mời nhập TYPE: ");
        System.out.println("1. Chó");
        System.out.println("2. Mèo");
        System.out.print("Mời chọn: ");
        Integer choice2;
        String type = null;
        try {
            do {
                choice2 = Integer.parseInt(scanner.nextLine());
                if (choice2 == 1 || choice2 == 2)
                    break;
                System.out.println("Chọn sai, mời chọn lại: ");
            } while (true);
            switch (choice2) {
                case 1:
                    type = Type.DOG.value;
                    break;
                case 2:
                    type = Type.CAT.value;
                    break;
            }
        } catch (Exception e) {
            System.out.println("Nhập sai, nhập lại: ");
        }
        System.out.println("Mời nhập ảnh: ");
        String images = scanner.nextLine();
        Animal animal = new Animal(name, species, age, sex, description, type, images);
        animals.add(animal);
        System.out.println(animals.toString());
    }
}