import java.util.ArrayList;
import java.util.List;

public class TTK_User{
  private String password;
  private String username;
  List<String> userList = new ArrayList<String>();

  public TTK_User(String u, String p){
    username = u;
    password = p;
  }

  public String getUsername(){
    return this.username;
  }

  public String getPassword(){
    return this.username;
  }

  public void setUsername(TTK_User user, String u){
    user.name = u;
  }

  public void setPassword(TTK_User pass, String p){
    user.pass = p;
  }

}
