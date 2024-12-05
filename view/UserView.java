package view;
import java.util.List;

import model.User;

public interface UserView<T extends User> {
// интерфейс в себя может принимать любой объект который наследуется от User
    void sendOnConsole(List<T> list); // шаблон метода
}
