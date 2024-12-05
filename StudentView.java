import java.util.List;

public class StudentView implements UserView<Student> {
// реализуем интерфейс
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student i : list) {
            System.out.println(i.getStudentId()); // выводим в консоль id студента
        }
    }
    
    
}
