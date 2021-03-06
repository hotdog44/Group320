package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WebApp implements EntryPoint {
	private static View currentView;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		View view = new logInView();
		
		
		setView(view);
	}

	/**
	 * Switch to given view.
	 * 
	 * @param view the view to switch to
	 */
	public static void setView(View view) {
		if (currentView != null) {
			// Remove old view
			RootLayoutPanel.get().remove(currentView);
		}
		
		// Add new view
		RootLayoutPanel.get().add(view);
		RootLayoutPanel.get().setWidgetLeftRight(view, 0.0, Unit.PX, 0.0, Unit.PX);
		RootLayoutPanel.get().setWidgetTopBottom(view, 0.0, Unit.PX, 0.0, Unit.PX);
		
		// Activate the view (allowing it to load data if necessary)
		view.activate();
		
		currentView = view;
	}
}
