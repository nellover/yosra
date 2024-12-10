package test_tdd1;

public class User {

	public void connect(String login, String pwd) {
		if(login.equals("login")&&pwd.equals("password"))
		{
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
