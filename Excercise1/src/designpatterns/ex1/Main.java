package designpatterns.ex1;

import designpatterns.ex1.behavioral.StrategySortDemo;
import designpatterns.ex1.behavioral.CommandRemoteControlDemo;
import designpatterns.ex1.creational.FactoryAnimalDemo;
import designpatterns.ex1.creational.SingletonConfigDemo;
import designpatterns.ex1.structural.AdapterAudioPlayerDemo;
import designpatterns.ex1.structural.DecoratorCoffeeDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose Design Pattern Demo to Run:");
            System.out.println("1. Strategy Pattern (Behavioral)");
            System.out.println("2. Command Pattern (Behavioral)");
            System.out.println("3. Factory Pattern (Creational)");
            System.out.println("4. Singleton Pattern (Creational)");
            System.out.println("5. Adapter Pattern (Structural)");
            System.out.println("6. Decorator Pattern (Structural)");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {
                case 1:
                    StrategySortDemo.main(null);
                    break;
                case 2:
                    CommandRemoteControlDemo.main(null);
                    break;
                case 3:
                    FactoryAnimalDemo.main(null);
                    break;
                case 4:
                    SingletonConfigDemo.main(null);
                    break;
                case 5:
                    AdapterAudioPlayerDemo.main(null);
                    break;
                case 6:
                    DecoratorCoffeeDemo.main(null);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
