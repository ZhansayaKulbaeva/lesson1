/**
 * Задача 1. Инкапсуляция данных (getters/setters + private)
 *
 * <p>Создайте класс {@code User}, содержащий приватные поля {@code name} и {@code age}.
 * Реализуйте геттеры и сеттеры.
 * Добавьте проверку: если возраст меньше 0 или больше 120 — значение игнорируется.
 *
 * <p>Пример использования:
 * <pre>{@code
 * User u = new User();
 * u.setName("Aliya");
 * u.setAge(150); // значение не устанавливается
 * System.out.println(u.getAge()); // 0
 * }</pre>
 */
public class User {
    private String name;
    private int age;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int checkAge() {
        if (age > 0 && age < 120) {
            return age;
        } else {
            return 0;
        }
    }
}
