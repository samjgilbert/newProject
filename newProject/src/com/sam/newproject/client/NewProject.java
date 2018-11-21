package com.sam.newproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class NewProject implements EntryPoint {
	public void onModuleLoad() {
		RootPanel.get().add(new Label("Hello, world."));
	}
}
