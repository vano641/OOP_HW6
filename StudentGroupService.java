import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class StudentGroupService {
    
    private StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
// вызываем итератор из ГруппыСтудентов, проходим по студентам        
        Iterator<Student> iterator = studentGroup.iterator();
// перебераем всех студентов, проверяем hasNext() есть ли следующий студент        
        while (iterator.hasNext()) {
// если существует, достаем его из итератора next()            
            Student student = iterator.next();
// сверяем параметры            
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)) {
                iterator.remove();// если совпадает, то удаляем
            }
        }
    }

// метод сортировки студентов по Id
    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());        
        Collections.sort(studentList); 
        return studentList;
    }
// метод сортировки по ФИО
    public List<Student> getSortedStydentByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>()); // у списка вызываем метод sort передав в него Компоратор
        return studentList;
    }

    public void createStudent(Integer studentId, String firstName, String lastName, String middleName) {
        studentGroup.createStudent(studentId, firstName, lastName, middleName);
    }

}
