import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.coldsun.homework.models.Course;

public class Main {

    public static void main(String[] args) {

        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .buildSessionFactory()){

            // Создание сессии
            Session session = sessionFactory.getCurrentSession();

            // Начало транзакции
            session.beginTransaction();

            // Создание объекта
            Course course = Course.create();
            session.save(course);
            System.out.println("Object course save successfully");

            // Чтение объекта из базы данных
            Course retrievedCourses = session.get(Course.class, course.getId());
            System.out.println("Object course retrieved successfully");
            System.out.println("Retrieved course object: " + retrievedCourses);

            // Обновление объекта
            retrievedCourses.updateTitle();
            retrievedCourses.updateDuration();
            session.update(retrievedCourses);
            System.out.println("Object course update successfully");

            // Удаление объекта
            session.delete(retrievedCourses);
            System.out.println("Object course delete successfully");


            session.getTransaction().commit();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}