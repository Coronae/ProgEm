package app;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import test.*;

public class Main extends MIDlet {

	public Main() {

	}

	public void startApp() throws MIDletStateChangeException {
		Ex1.start();
		
		Ex2.openRecord();
		Ex2.writeRecord("Ceci est un nouveau Record");
		Ex2.readRecords();
		Ex2.closeRecord();
		Ex2.deleteRecord();
	}

	public void pauseApp() {

	}

	public void destroyApp(boolean b) {

	}

}