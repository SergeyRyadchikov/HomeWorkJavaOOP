package HomeWork5;

import java.util.List;

import HomeWork5.date.Student;

public class AttandanceView { // View

    public void printResult(List<Student> lst) {
        for (Object elem : lst) {
            System.out.println(elem);
        }
    }
    
}
