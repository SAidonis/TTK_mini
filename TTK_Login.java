import java.util.ArrayList;
import java.util.List;

public class TTK_Login {
  public static TTK_User tryLogin(String username, String password){

    for(TTK_User user : TTK_UserStorage.userList){
      if(user.getUsername().equals(username) && user.getPassword().equals(password));
      return user;
    }
    return null;
  }
}
