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

    private List<Student> studentList; // экземпляр Списка тудентов

    private RemoveStudentByFIOService RSBFIOS = new RemoveStudentByFIOService();

    private final StudentView studentView = new StudentView(); // создадим СтудентВью

// инициализируем список студентов:
    public StudentController(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
    }


    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        RSBFIOS.removeStudentByFIO(firstName, lastName, middleName); // вызываем метод передавая в него все параметры
    }

     public List<Student> getSortedStudentList(){
        List<Student> studentList = IdSS.getSort(studentGroup);
        studentView.sendOnConsole(studentList);
        return studentList;
     }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = FIOSS.getSort(studentGroup);
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    @Override
    public void create(Integer studentId, String firstName, String lastName, String middleName) {
        CSS.createStudent(studentId, firstName, lastName, middleName);
    }
}
