package service;
import java.util.List;

import model.Student;
import model.StudentGroup;
import view.StudentView;

public class StudentController implements UserController<Student>{
    
    private CreateStudentService CSS = new CreateStudentService(); // экземпляр Содание Студента

    private FIOSortedService FIOSS = new FIOSortedService(); // экземпляр Сортировки по ФИО

    private IdSortedService IdSS = new IdSortedService(); // экземпляр сортировки по Id

    private StudentGroup studentGroup = new StudentGroup(); // экземпляр ГруппыСтудентов

    private RemoveStudentByFIOService RSBFIOS = new RemoveStudentByFIOService();

    private final StudentView studentView = new StudentView(); // создадим СтудентВью

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        RSBFIOS.removeStudentByFIO(firstName, lastName, middleName); // вызываем метод передавая в него все параметры
    }

     public List<Student> getSortedStudentList(){
        List<Student> studentList = IdSS.getSortedStudentList(studentGroup);
        studentView.sendOnConsole(studentList);
        return studentList;
     }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = FIOSS.getSortedStydentByFIO(studentGroup);
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    @Override
    public void create(Integer studentId, String firstName, String lastName, String middleName) {
        CSS.createStudent(studentId, firstName, lastName, middleName);
    }
}
