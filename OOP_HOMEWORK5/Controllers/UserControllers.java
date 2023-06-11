package OOP_HOMEWORK5.Controllers;

import java.util.List;

import personal.model.Repository;
import personal.model.User;

public class UserControllers {

    private final Repository repository;
    private final Validate validate;

    public UserControllers(Repository repository, Validate validate){
        this.repository = repository;
        this.validate = validate;
    }

    public void saveUser(User user) throws Exception{
        validate.checkNumber(user.getPhone());
        repository.CreateUser(user);
    }

    public void updateUser(User user, Fields field, String param) throws Exception{
        if(field == Fields.TELEPHONE){
            validate.checkNumber(param);
        }
        repository.UpdateUser(user, field, param);
    }

    public User readUser(String userId) throws Exception{
        List<User> users = repository.getAllUsers();
        for(User user: users){
            if(user.getId().equals(userId)){
                return user;
            }
        }

        throw new Exception("Пользователь не найден");
    }

    public List<User> getUsers() throws Exception{
        return repository.getAllUsers();
    }

    public void deleteUser(User user) throws Exception{
        repository.delUser(user);
    }
}

