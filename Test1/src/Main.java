class Cars {  // Класс Car
    String model;
    int year;
    boolean isDriving;

    public Cars(String m, int y, boolean drive) {  // Конструктор
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
        Cars myCar = new Cars("Toyota", 1985, true);  // Создаём объект
        myCar.drive();  // Вызываем метод
        Moto myMoto = new Moto();
        System.out.println(myMoto.year);
    }
}
