package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Student;
import model.StudentGroup;

public class IdSortedService {

    // метод сортировки студентов по Id
    public List<Student> getSortedStudentList(StudentGroup studentGroup){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());        
        Collections.sort(studentList); 
        return studentList;
    }
}
