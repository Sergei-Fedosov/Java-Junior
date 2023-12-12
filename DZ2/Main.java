import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Animal[] animalList = new Animal[]{
                new Cat("барсик", 5, false),
                new Dog("шарик", 3, true),
                new Dog("борис", 2, true),
                new Cat("тимка", 4, false)
        };

        for (Animal animal : animalList) {
            System.out.println(animal.getClass().getSimpleName() + ":");
            System.out.println("Имя: " + animal.name);
            System.out.println("Возраст: " + animal.age);

            Field[] fields =animal.getClass().getDeclaredFields();
            for (Field field : fields){
                field.setAccessible(true); // Разрешаем доступ к закрытому полю
                System.out.println(field.getName() + " : " + field.get(animal));
            }


            System.out.print("Издать звук: ");
            try {
                Method method = animal.getClass().getMethod("makeSounds");
                method.invoke(animal);
            } catch (Exception e) {
                System.out.println(":Животное молчит");
            }

            System.out.println();
        }
    }
}