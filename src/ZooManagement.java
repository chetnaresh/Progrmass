
abstract class Animal {
    private final String name;
    private int energyLevel;
    private String healthStatus;

    public Animal(String name) {
        this.name = name;
        this.energyLevel = 100;
        this.healthStatus = "Healthy";
    }
    public void eat() {
        energyLevel += 10;
        System.out.println(name + " is eating. Energy increased to " + energyLevel);
    }

    public void sleep() {
        energyLevel += 20;
        System.out.println(name + " is sleeping. Energy increased to " + energyLevel);
    }

    public abstract void makeSound();

    public int getEnergyLevel() {
        return energyLevel;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public String getName() {
        return name;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}


class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars loudly!");
    }
}

class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets with a loud sound!");
    }
}


class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chatters playfully!");
    }
}


public class ZooManagement {
    public static void main(String[] args) {
        // Create animals (using polymorphism)
        Animal lion = new Lion("Simba");
        Animal elephant = new Elephant("Dumbo");
        Animal monkey = new Monkey("George");

        // Animal actions
        lion.eat();
        lion.makeSound();
        lion.sleep();

        System.out.println();

        elephant.eat();
        elephant.makeSound();
        elephant.setHealthStatus("Needs Checkup");
        System.out.println(elephant.getName() + "'s health: " + elephant.getHealthStatus());

        System.out.println();

        monkey.sleep();
        monkey.makeSound();
        monkey.eat();

        System.out.println("\n--- Final Status ---");
        System.out.println(lion.getName() + ": Energy = " + lion.getEnergyLevel() + ", Health = " + lion.getHealthStatus());
        System.out.println(elephant.getName() + ": Energy = " + elephant.getEnergyLevel() + ", Health = " + elephant.getHealthStatus());
        System.out.println(monkey.getName() + ": Energy = " + monkey.getEnergyLevel() + ", Health = " + monkey.getHealthStatus());
    }
}
