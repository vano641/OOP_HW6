public class Student extends User implements Comparable<Student>{
    
    private Integer studentId;

    public Student(Integer studentId, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.studentId = studentId;
    }
   
    public Integer getStudentId() {
        return this.studentId;
    }

    @Override
    public String toString() {
        return String.format("studentId: %d, firstName: %s, lastName: %s, middleName: %s",
        studentId, firstName, lastName, middleName);
    }

    @Override
    public int compareTo(Student o) {
// берем у текущего объекта его studentId и вызываем у него метод compareTo
// у второго объекта также studentId
        return this.studentId.compareTo(o.studentId);
    }

}
