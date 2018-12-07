public class TTK_Create {

	public static TTK_User Create(String username, String password) {

		for(TTK_User user : User.userList){
			if(user.getUsername().equals(username)); //Checks if the user exist
			return null;
		}

		TTK_User user = new TTK_User(username, password);
		User.userList.add(user); //Adding nwe user
		return user;
	  }

}
