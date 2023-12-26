import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "сourses")
public class Course {

    private static final String[] titles = new String[] {"Чистописание","Чтение","Труд","Природоведение","Математика",
            "Музыка, Пение","Изобразительное искусство (Рисование)","Русский язык","Родной язык","Физкультура",
            "Основы религиозных культур и светской этики","Иностранный язык","Граждановедение","Краеведение","История",
            "Литература","Основы безопасности жизнедеятельности (ОБЖ)","Технология","География","Биология","Информатик",
            "Обществознание","Черчение","Алгебра","Геометрия","Физика","Химия","Естествознание","Основы экономики",
            "Правоведение","Философия","Экология","Астрономия","Начальная военная подготовка НВП",
            "Мировая художественная культура МХК","Риторика"};

    private static final Random random = new Random();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "duration")
    private int duration;

    public Course() {

    }
    public Course(int id, String title, int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public static Course create(){
        return new Course(titles[random.nextInt(titles.length)], random.nextInt(1, 50));
    }

    public void updateDuration(){
        duration = random.nextInt(20, 26);
    }

    public void updateTitle(){
        title = titles[random.nextInt(titles.length)];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}