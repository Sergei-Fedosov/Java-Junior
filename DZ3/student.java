import java.io.Serializable;

public class student implements Serializable {
    private String name;
    private int age;
    private transient double GPA;
    /*
     * Модификатор transient используется, если возникает необходимость сохранить объект (экземпляр) класса (выполнить сериализацию).
     * Использование при описании поля класса модификатора transient исключает указанное поле из сериализации.
     */

    public student(String name, int age, double averageScore) {
        this.name = name;
        this.age = age;
        this.GPA = averageScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return GPA;
    }
}