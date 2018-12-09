public class TTK_Login {

  private TTK_User user = new TTK_User();  //anropar TTK_User
  user.getUsername();
  user.getPassword();
x
  users check = new users(username, password);

  private boolean verifyUser(String username, String password){

  String Username;
  String Password;

  Password = "username";
  Username = "password";

//  user.getUsername == username;         strue or false?
//  user.getPassword == password;

  if(username.equals("username") && (password.equals("username"))){
  System.out.println("Welcome");
  }
  else {
  System.out.println("Failed to Login");

  }

}
