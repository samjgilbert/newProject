package com.sam.newproject.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class NewProject implements EntryPoint {
	//First initialise the sequencePosition variable. This keeps track of where we
	//are in the experiment, controlling the sequential ordering of events.
	static int sequencePosition=0; 
	
	ParticipantInfo p = new ParticipantInfo(958);
	
	public void onModuleLoad() {
		new SequenceHandler();
	}
}
