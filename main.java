import java.util.Iterator;

import model.Student;
import model.StudentGroup;
import service.StudentController;
import service.StudentGroupIterator;

/**
 * ЗАДАЧА:
 * Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
 * Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему
   
   РЕШЕНИЕ:
   1) поместить файлы согластно MVC.
   2) StudentGroupService содержит в себе 4 метода, вынесем их в отдельные классы для соблюдения 1ого принципа
   3) 2ой принцип Открытости/Закрытости. 
у нас есть 2 класса Сортировка по ФИО и Сортировка по Id,
Создадим Интерфейс(SortedService) сортировки и имплементируем его в Оба метода сортировки

 */
public class main {

    public static void main(String[] args) {
        
        StudentGroup StudentList = new StudentGroup(); // Печать списка студентов
      //  StudentList.PrintStudentList();

        StudentGroupIterator studentInfo = new StudentGroupIterator(StudentList);
        Iterator<Student> student = studentInfo;

        while (student.hasNext()) {
            System.out.println(studentInfo.next()); // перебор списка Итератором
        }
     //   studentId: 5, firstName: Иван, lastName: Мысовский, middleName: Андреевич
     //   studentId: 2, firstName: Кристина, lastName: Мысовская, middleName: Вячеславовна
     //   studentId: 3, firstName: Артем, lastName: Мысовский, middleName: Иванович

// Сортировка по id
        StudentController controller = new StudentController(StudentList);
        controller.getSortedStudentList();
/** 
        id:2 - firstName:Кристина
        id:3 - firstName:Артем
        id:5 - firstName:Иван
*/
//Сортировка по ФИО:
        controller.getSortedStudentByFIO();
/**
        id:3 - firstName:Артем
        id:5 - firstName:Иван
        id:2 - firstName:Кристина
*/
        
    }
}