package service;
import java.util.Iterator;
import java.util.List;

import model.Student;
import model.StudentGroup;
public class StudentGroupIterator implements Iterator<Student>{

    private int count; // счетчик
    private final List<Student> studentList; // список студентов


    public StudentGroupIterator(StudentGroup studentGroup) {
        this.count = 0;
        this.studentList = studentGroup.getStudentList(); // список студентов берем из ГруппыСтудентов
    }

    @Override
    public boolean hasNext() {
        return count <= studentList.size() - 1; // счетчик меньше списка студентов -1
    }

    @Override
    public Student next() {
// в начале надо проверить есть ли следующий элемент
        if (!hasNext()) { 
            return null; // если не существует следующего элемента
        }
        return studentList.get(count++); // возвращает текущее значение и увеличивает его
    }

    @Override
    public void remove() {
        studentList.remove(count); // 
    }
    
}
