package service;
import model.User;

public interface UserController<T extends User> {
    
    void create(Integer studentId, String firstName, String lastName, String middleName);
}
