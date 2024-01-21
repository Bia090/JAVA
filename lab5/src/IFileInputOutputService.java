import java.util.List;
public interface IFileInputOutputService {
    List<String> getUsersFromFile();

    void writeUsersFromFile(List<Users> usersList);

}