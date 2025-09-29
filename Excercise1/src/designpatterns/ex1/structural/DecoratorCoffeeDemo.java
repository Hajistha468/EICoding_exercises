package designpatterns.ex1.structural;

// Base interface
interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete component
class SimpleCoffee implements Coffee {
    public String getDescription() { return "Simple Coffee"; }
    public double getCost() { return 2.0; }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee c) { decoratedCoffee = c; }
    public String getDescription() { return decoratedCoffee.getDescription(); }
    public double getCost() { return decoratedCoffee.getCost(); }
}

// Concrete decorator
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee c) { super(c); }
    public String getDescription() { return super.getDescription() + ", Milk"; }
    public double getCost() { return super.getCost() + 0.5; }
}

public class DecoratorCoffeeDemo {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());
    }
}
