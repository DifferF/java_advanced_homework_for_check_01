package homework_01.task_03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(191, 2003, "BMW", "Red"); // BMW
        Car c2 = new Car(193, 2002, "Opel", "Black");  //  Opel
        Car c3 = new Car(192, 2001, "Mercedes", "White");  // Mercedes
        Car[] c = {c1, c2, c3};
        // осуществил поиск по скорости(если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > моделе -> цвету машины.
        Arrays.sort(c);   // ClassCastException
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
