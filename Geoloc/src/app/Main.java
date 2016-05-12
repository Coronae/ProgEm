package app;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.StringItem;
import javax.microedition.location.Coordinates;
import javax.microedition.location.Criteria;
import javax.microedition.location.Location;
import javax.microedition.location.LocationProvider;
import javax.microedition.midlet.MIDlet;

public class Main extends MIDlet implements CommandListener {
	private Display display;
	private Form form;
	private Command cmdExit, cmdOK;
	private StringItem si;

	public Main() {
		display = Display.getDisplay(this);
		form = new Form("Location Api test");
		cmdExit = new Command("Exit", Command.EXIT, 5);
		cmdOK = new Command("OK", Command.OK, 1);
		si = new StringItem("Geo Location", "Click OK");
		form.append(si);
		form.addCommand(cmdOK);
		form.addCommand(cmdExit);
		form.setCommandListener(this);
	}

	public void startApp() {
		display.setCurrent(form);
	}

	public void pauseApp() {
	}

	public void destroyApp(boolean flag) {
		notifyDestroyed();
	}

	public void commandAction(Command c, Displayable d) {
		if (c == cmdOK) {
			Retriever ret = new Retriever(this);
			ret.start();
		} else if (c == cmdExit) {
			destroyApp(false);
		}
	}

	public void displayString(String string) {
		si.setText(string);
	}
}

class Retriever extends Thread {
	private Main midlet;

	public Retriever(Main midlet) {
		/**
		 * * Constructor * * EFFECTS: Initialise the server and store midlet
		 * information * * @param midlet The main application midlet * @param
		 * server Forecast Server URL *
		 */
		this.midlet = midlet;
	}

	public void run() { /**
						 * * Entry point of the thread * * EFFECTS: call to
						 * connect() method
						 */
		try {
			checkLocation();
		} catch (Exception ex) {
			ex.printStackTrace();
			midlet.displayString(ex.toString());
		}

	}

	public void checkLocation() throws Exception {
		String string;
		Location l;
		LocationProvider lp;
		Coordinates c;
		// Set criteria for selecting a location provider:
		// accurate to 500 meters horizontally
		Criteria cr = new Criteria();
		cr.setHorizontalAccuracy(500);
		// Get an instance of the provider
		lp = LocationProvider.getInstance(cr);
		// Request the location, setting a one-minute timeout
		l = lp.getLocation(60);
		c = l.getQualifiedCoordinates();
		if (c != null) {
			// Use coordinate information
			double lat = c.getLatitude();
			double lon = c.getLongitude();
			string = "\nLatitude : " + lat + "\nLongitude : " + lon;
		} else {
			string = "Location API failed";
		}
		midlet.displayString(string);
	}
	// - See more at: http:
	// mobilepit.com/05/javame-location-api-example-application-with-source-code.html#sthash.yMlmoXwr.dpuf
}
