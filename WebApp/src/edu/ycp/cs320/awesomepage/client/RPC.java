package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.core.shared.GWT;

public class RPC {
	public static final LoginServiceAsync loginService =
			GWT.create(LoginService.class);
}
