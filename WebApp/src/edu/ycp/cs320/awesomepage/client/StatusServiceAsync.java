package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;

public interface StatusServiceAsync {

	void postStatus(User user, String status, AsyncCallback<String> callback);

	void getStatusesForUser(User user, AsyncCallback<String> callback);

}
