package service;

import java.util.List;

import model.Student;
import model.StudentGroup;

// Интерфейс Сортировки
public interface SortedService {

    List<Student> getSort(StudentGroup studentGroup);
}
