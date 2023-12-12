public class Cat extends Animal {
    public Boolean presenceWool;

    public  Cat(String name, int age, Boolean presenceWool) {
        super(name,age);
        this.presenceWool = presenceWool;
    }
    public void makeSounds() {

        System.out.println("Мяу-Мяу");

    }
    @Override
    public String toString() {
        return "Cat{" +
                "presenceWool=" + presenceWool +
                '}';
    }
}