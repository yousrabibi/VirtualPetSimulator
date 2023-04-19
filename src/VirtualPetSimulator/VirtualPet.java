package VirtualPetSimulator;

public class VirtualPet {
    private String name;
    private int age;
    private  PetNeeds petNeeds;

    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = age;
        this.petNeeds = new PetNeeds();
    }
    public void feed() {
        int amountToDecrease = (int) (Math.random() * 11) + 10; // generate a random number between 10 and 20
        petNeeds.decreaseHunger(amountToDecrease);
    }
    public void drink() {
        int amountToDecrease = (int) (Math.random() * 11) + 10; // generate a random number between 10 and 20
        petNeeds.decreaseThirst(amountToDecrease);
    }
    public void play() {
        int amountToIncrease = (int) (Math.random() * 11) + 10; // generate a random number between 10 and 20
        petNeeds.increaseHappiness(amountToIncrease);
    }
    public boolean isSick() {
        return petNeeds.getHunger() >= 100 || petNeeds.getThirst() >= 100;
    }
    public boolean isSad() {
        return petNeeds.getHappiness() <= 0;
    }
    public void printStatus() {
        System.out.println(name + " is " + age + " years old.");
        System.out.println("Hunger level: " + petNeeds.getHunger() + "/100");
        System.out.println("Thirst level: " + petNeeds.getThirst() + "/100");
        System.out.println("Happiness level: " + petNeeds.getHappiness() + "/100\n");
    }
    public int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PetNeeds getPetNeeds() {
        return petNeeds;
    }


}
