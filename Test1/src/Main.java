class Car {  // Класс Car
    String model;
    int year;
    boolean isDriving;

    public Car(String m, int y, boolean drive) {  // Конструктор
        model = m;
        year = y;
        isDriving = drive;
    }

    void drive() {  // Метод
        System.out.println(model + " is driving.");
        System.out.println(year);
        System.out.println(isDriving);
    }
}

public class Main {  // Главный класс с методом main
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 1985, true);  // Создаём объект
        myCar.drive();  // Вызываем метод
    }
}
