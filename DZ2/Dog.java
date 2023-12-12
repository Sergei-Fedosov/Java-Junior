public class Dog extends Animal{
    public Boolean trained;

    public  Dog(String name, int age, Boolean trained) {
        super(name,age);
        this.trained = trained;
    }
    public  Dog(String name, int age) {
        super(name,age);
    }
    public void makeSounds() {
        System.out.println("Гав-Гав");
    }
}