import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; 
public class StudentGroup implements Iterable<Student>{

    private List<Student> studentList;


    public StudentGroup() {
        this.studentList = initStudents();
    }
    
        public List<Student> initStudents(){
        List<Student> StL = new ArrayList<>();
        StL.add(new Student(1, "Иван", "Мысовский", "Андреевич"));
        StL.add(new Student(2, "Кристина", "Мысовская", "Вячеславовна"));
        StL.add(new Student(3, "Артем", "Мысовский", "Иванович"));
        return StL;
    }

    public void PrintStudentList(){
        for (Student i : studentList) {
            System.out.println(String.format("studentId: %d, firstName: %s, lastName: %s, middleName: %s",
                                         i.getStudentId(), i.getFirstName(), i.getLastName(), i.getMiddleName()));
        }
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this); // метод итератора возвращает итератор
    }

// метод который помещает нового студента в список
    public void createStudent(Integer studentId, String firstName, String lastName, String middleName) {
        studentList.add(new Student(studentId, firstName, lastName, middleName));
    }

    
}