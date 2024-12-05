package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.StudentGroup;

// Отдельный класс с функцией Сортировки по ФИО
public class FIOSortedService {

    public List<Student> getSortedStydentByFIO(StudentGroup studentGroup){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>()); // у списка вызываем метод sort передав в него Компоратор
        return studentList;
    }
}
