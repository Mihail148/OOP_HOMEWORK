package OOP_HOMEWORK5;

import OOP_HOMEWORK5.Controllers.UserControllers;
import OOP_HOMEWORK5.Model.FileOperation;
import OOP_HOMEWORK5.Model.FileOperationImplemets;
import OOP_HOMEWORK5.Model.Repository;
import OOP_HOMEWORK5.Model.RepositoryFile;
import OOP_HOMEWORK5.Utilities.Validate;
import OOP_HOMEWORK5.Views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImplemets("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserControllers controller = new UserControllers(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}
