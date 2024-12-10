package test_tdd1;

import org.junit.jupiter.api.Test;

public class test1 {

	@Test
	public void connecter() {
		User user=new User();
		user.connect("login","passord");
	}
}
