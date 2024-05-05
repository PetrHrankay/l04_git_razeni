import cz.engeto.ja.Computer;
import cz.engeto.ja.ComputerComparator;
import cz.engeto.ja.ComputerManager;

import java.util.*;
          
public class Main {

    //Pokus
    public static void main(String[] args) {
        List<Computer> defaultList = new ArrayList<>();
        defaultList.add(
                new Computer("Dell", 2019, 15000));
        ComputerManager manager = new ComputerManager(defaultList);

        defaultList.add(
                new Computer("Dell", 2018, 12000));

        System.out.println(manager.getCountOfDellComputers());
        manager.getComputers().forEach(System.out::println);
    }


    private static void pokus() {

    }

    private static void jinaMetoda() {
              // ...
    }
    public static void mainSortTest() {

        List<Computer> computers = new ArrayList<>();

        Computer computer1 = new Computer("Dell", 2019, 15000);
        Computer computer2 = new Computer("HP", 2018, 12000);
        Computer computerX = new Computer("HP", 2018, 12000);
        Computer computerY = new Computer("HP", 2018, 11000);
        Computer computerZ = new Computer("HP", 2018, 13000);
        Computer computer3 = new Computer("Lenovo", 2017, 10000);

        computers.addAll(List.of(computer1, computer2, computer3, computerX, computerY, computerZ));

//        computers.add(computer1);
//        computers.add(computer2);
//        computers.add(computerX);
//        computers.add(computerY);
//        computers.add(computerZ);

        for (Computer computer : computers) {
            System.out.println(computer.getDescription() + " " + computer.getYearOfProduction() + " " + computer.getPrice());
        }

        computers.sort(Comparator.comparing(Computer::getYearOfProduction));

        System.out.println("\nSorted by year of production\n");
        computers.forEach(System.out::println);

        Collections.sort(computers, Comparator.comparing(Computer::getPrice).reversed());

        System.out.println("\nSorted by price reversed\n");
        computers.forEach(System.out::println);

        Collections.sort(computers);
        System.out.println("\nSorted by description:\n");
        computers.forEach(System.out::println);

        computers.sort(new ComputerComparator());
        System.out.println("\nSorted by my own comparator:\n");
        computers.forEach(System.out::println);

    }
}