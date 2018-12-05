import java.util.Scanner;

public class TTK_Main{
  public static TTK_User createOrLogin(){
    Scanner scan = new Scanner(System.in);

    while(true) {
      String choice = "";
      System.out.println("Hello! What do you want to do? \n1. Log in \n2. Create user");

      while(true) {
        choice = scan.nextLine();
        if(choice.equals("1") || choice.equals("2"));
          break;
      }

      String username = "", password = "";
      System.out.println("Enter username: ");
      username = scan.nextLine();

      System.out.println("Enter password: ");
      password = scan.nextLine();

      TTK_User user;
      switch(choice){
        case "1":
          user = Login.tryLogin(username, password);

          if(user == null){
            System.out.println("Failed to login!");
            continue;
          }
        case "2":
          user = Create.tryCreate(username, password);

          if(user == null){
            System.out.println("Failed to create user!");
            continue;
          }
          return user;
        default:
          return null;
      }
    } //while
  } //createOrLogin

  public static void welcomeMessage(TTK_User user){
    System.out.println("Welcome " + user.getUsername() + "!");

  }

  public static TTK_User Logout(TTK_User user){
    Scanner scan = new scanner(System.in);

      while(true){
        System.out.println("Do you want to logout? Y/N");
        String choice = scan.nextLine();

        switch(choice){
          case "Y";
            System.out.println("You are now logged out from the system.");
            return null;

          case "N";
            System.out.println("You are still logged on to the system.");
            return user;

          default;
            System.out.println("Invalid choice!");
            continue;
        }
      } //while
  } //Logout

  public static void main(String[] args){
    TTK_User currentUser = null;

    while(true){

      if(currentUser == null){
        currentUser = createOrLogin();
      }

      welcomeMessage(currentUser);

      currentUser = Logout(currentUser);

      if(currentUser == null){
        System.out.println("This user has been logged out!");

      }else{
        System.out.println("This user is still logged in!");
      }

      while(true){
        System.out.println("Do you want to terminate the program (and lose all your users)? Y/N");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        if (choice.equals("Y")) {
          return;

        } else if(choice.equals("N")){
          break;

        } else {
          System.out.println("Invalid choice!");
      }
    }
  } //main
} //class
