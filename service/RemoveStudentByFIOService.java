package service;

import java.util.Iterator;

import model.Student;
import model.StudentGroup;
public class RemoveStudentByFIOService {
    
    private StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
// вызываем итератор из ГруппыСтудентов, проходим по студентам        
        Iterator<Student> iterator = studentGroup.iterator();
// перебераем всех студентов, проверяем hasNext() есть ли следующий студент        
        while (iterator.hasNext()) {
// если существует, достаем его из итератора next()            
            Student student = iterator.next();
// сверяем параметры            
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)) {
                iterator.remove();// если совпадает, то удаляем
            }
        }
    }




}
