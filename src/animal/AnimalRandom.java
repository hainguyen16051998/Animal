package animal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AnimalRandom {
    public void Info(Scanner scanner, ArrayList<Animal> animal) {
        Animal animal1 = new Animal("Tom","CHO",1,"Female","cute","CHÓ","10");
        Animal animal2 = new Animal("Bom","CHO",2,"Male","cute","CHÓ","10");
        Animal animal3 = new Animal("Dom","CHO",3,"Female","cute","CHÓ","10");
        Animal animal4 = new Animal("Som","MEO",4,"Male","cute","MÈO","10");
        Animal animal5 = new Animal("Gom","MEO",5,"Female","cute","MÈO","10");
        Animal animal6 = new Animal("Com","MEO",6,"Male","cute","MÈO","10");
        animal.add(animal1);
        animal.add(animal2);
        animal.add(animal3);
        animal.add(animal4);
        animal.add(animal5);
        animal.add(animal6);
    }

}
