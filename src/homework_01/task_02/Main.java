package homework_01.task_02;
/*
Задание 2+
Вывод на экран элементов List: Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static  void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            myList.add(i);
        }

        System.out.println(myList + " " + myList.size());

        // с помощью итератора можем бегать по нашему списку
        Iterator<Integer> iteratorName = myList.iterator();
        // спрашиваем есть ли следующий элемент в списке, если true, то будет реализовано тело while
        while (iteratorName.hasNext()) {
            // переходим к следующему элементу в списке и его выводим
            Integer temp = iteratorName.next();
            System.out.print(temp + " ");
        }
    }
}
