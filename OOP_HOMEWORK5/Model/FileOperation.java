package OOP_HOMEWORK5.Model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();
    
    void saveAllLines(List<String> lines);
}
