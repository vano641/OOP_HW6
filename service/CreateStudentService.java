package service;

import model.StudentGroup;

// Отдельный класс с функцией Создания Студента
public class CreateStudentService {

    private StudentGroup studentGroup;
    public void createStudent(Integer studentId, String firstName, String lastName, String middleName) {
        studentGroup.createStudent(studentId, firstName, lastName, middleName);
    }
}
