import java.util.ArrayList;
import java.util.List;

public class TTK_User{
  private String password;
  private String username;
  List<String> userList = new ArrayList<String>();

  public TTK_User(String username, String password){
    this.username = username;
    this.password = password;
  }

  public String getUsername(){
    return username;
  }

  public String getPassword(){
    return password;
  }

}
