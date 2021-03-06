package edu.ycp.cs320.awesomepage.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ycp.cs320.awesomepage.client.SignUpService;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.server.controllers.SignUpController;

public class SignUpServiceImp extends RemoteServiceServlet implements SignUpService {
	@Override
	public User signUp(String username, String password,String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		SignUpController controller = new SignUpController();
		
		User result = controller.signUp(username, password, firstName, lastName, email);
		if (result == null) {
			System.out.println("No new user!!");
		} else {
			System.out.println("Successful!!");
		}
		return null;
	}
}
