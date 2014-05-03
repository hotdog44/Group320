package edu.ycp.cs320.awesomepage.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.awesomepage.shared.User;

@RemoteServiceRelativePath("userListView")
public interface userListViewService extends RemoteService{
	
	public ArrayList<User> user();
}
