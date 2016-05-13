package app;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import test.Ex1;
import test.Ex2;

public class Main extends MIDlet {

	// The MIDlet's Display object
	protected Display display;

	// Flag indicating first call of startApp
	protected boolean started;

	public Main() {

	}

	public void startApp() throws MIDletStateChangeException {

		display = Display.getDisplay(this);

		if (!started) {
			Ex1.start();

			Form form = new Form("RMS");
			Ex2.openRecord();
			Ex2.writeRecord("Ceci est un nouveau Record");
			form.append(Ex2.getRecord(1));
			Ex2.readRecords();
			Ex2.writeRecord("Voici un deuxième Record");
			Ex2.writeRecord("Et un troisième, et je vais lire le second");
			Ex2.readOneRecord(2);
			form.append(Ex2.getRecord(2));
			Ex2.readRecords();
			Ex2.closeRecord();
			Ex2.deleteRecord();

			display.setCurrent(form);

			started = true;
		}
	}

	public void pauseApp() {

	}

	public void destroyApp(boolean b) {

	}

}