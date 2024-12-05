import java.util.List;

public class StudentController implements UserController<Student>{
    
    private final StudentGroupService studentGroupService = new StudentGroupService(); // экземпляр сервиса

    private final StudentView studentView = new StudentView(); // создадим СтудентВью

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName); // вызываем метод передавая в него все параметры
    }

     public List<Student> getSortedStudentList(){
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
     }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = studentGroupService.getSortedStydentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    @Override
    public void create(Integer studentId, String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(studentId, firstName, lastName, middleName);
    }
}
