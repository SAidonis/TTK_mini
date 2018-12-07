public class TTK_Create {

	public static TTK_User Create(String username, String password) {

		for(TTK_User user : TTK_UserStorage.userList){
			if(user.getUsername().equals(username));
			return null;
		}

		TTK_User user = new TTK_User(username, password);
		TTK_UserStorage.userList.add(user);
		return user;
	  }

}
