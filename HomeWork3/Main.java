package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("Ivan", 23, 4.1f));
        lst.add(new Student("Petr", 21, 3.5f));
        lst.add(new Student("Nina", 25, 2.0f));
        lst.add(new Student("Vasia", 19, 4.7f));

        // Создаем список студентов типа StudentsGroup
        StudentsGroup sg = new StudentsGroup(lst);
        // СОздаем итератор
        Iterator<Student> it = sg.iterator(); 
        // С помощью итератора выводим список студентов в консоль
        while(it.hasNext()){
            System.out.println(it.next());
        }
        

        System.out.println("------------------------------");

        // Создаем листитератор
        ListIterator<Student> listIt = sg.listIterator();
        // Выводим список студентов слева направо
        while(listIt.hasNext()){
            System.out.println(listIt.nextIndex() + "\n" + listIt.next());
        }

        System.out.println("---------------------------");
        ListIterator<Student> listIt2 = sg.listIterator();

        // Выводим список студентов справа налево
        while(listIt2.hasPrevious()){
            System.out.println(listIt2.previousIndex() + "\n" + listIt2.previous());
        }

        System.out.println("---------------------------");

        Iterator<Student> revIt = sg.reversIterator();
        while(revIt.hasNext()){
            for (int i = sg.getLength() - 1; i >= 0; i--){
                System.out.println(i);
                System.out.println(revIt.next());
            }
            
        }
        // while(revIt.hasNext()){
        //     System.out.println(revIt.getIndex());
        //     System.out.println(revIt.next());            
        // }
        


        
        


    }
}