package view;
import java.util.List;

import model.Student;

public class StudentView implements UserView<Student> {
// реализуем интерфейс
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student i : list) {
            System.out.println(String.format("id:%d - firstName:%s", i.getStudentId(), i.getFirstName())); // выводим в консоль id студента
        }
        System.out.println("");
    }
    
    
}
