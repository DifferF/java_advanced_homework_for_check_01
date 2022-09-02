package homework_01.task_03;

/*
Задание 3+
В папке с примерами, ex_004_comparable.
Дописать логику, чтобы метод compareTo()
осуществил поиск по скорости(если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > моделе -> цвету машины.
 */

public class Car implements Comparable<Car> { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.speed + " | " + this.price +" | "+ this.model + " | " + this.color  ;
    }

    // Сортируем по скорости -> цене - > модели -> цвету машины.
    @Override
    public int compareTo(Car o) {
        int tempSpeed  = this.speed - o.speed;

            if (tempSpeed == 0) {
                int tempPrice = this.price - o.price;

            if (tempPrice == 0){
                int tempModel = this.model.compareTo(o.model);

                if (tempModel == 0){
                    return this.color.compareTo(o.color);

                } else {
                    return tempModel;
                }
            } else {
                return tempPrice;
            }
        } else {
            return tempSpeed;
        }
    }
}