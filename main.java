import java.util.Iterator;

/**
 * Задача 1
 * Создать класс Юзер и перенести в него базовые поля (ФИО)
 * Модифицировать ранее созданный класс СтудентКомпаратор переименовав его в ЮзерКомпаратор
 * Типизировать его Т наследующегося от типа Юзер (Т extends User)
 * Изменить метод Компаре, внеся во входные данные вместо конкретных классов типизацию Т
 * Внести правки места, где использовался предыдущий компаратор
 * 
 * Задача 2
 * Создать интерфейс ЮзерВью
 * Типизировать его Т наследующегося от типа Юзер
 * Создать в нем метод sendOnConsole(List<Student> students) используя типизацию
 * Создать класс СтудентВью реализующий созданный интерфейс
 * 
 * Задача 3
 * Модифицировать класс Контроллер переименовав его в StudentController
 * Создать новый интерфейс UserController
 * Опишите в нем метод create
 * Типизировать его Т наследующегося от типа User
 * В классе СтудентКонтроллер реализуйте интерфейс UserController
 * добавить в методы контроллера вывод в консоль с помощью метода sendOnConsole
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
     //   studentId: 1, firstName: Иван, lastName: Мысовский, middleName: Андреевич
     //   studentId: 2, firstName: Кристина, lastName: Мысовская, middleName: Вячеславовна
     //   studentId: 3, firstName: Артем, lastName: Мысовский, middleName: Иванович

        
    }
}