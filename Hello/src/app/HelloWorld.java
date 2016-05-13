package app;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;

public class HelloWorld extends MIDlet {

	// The MIDlet's Display object
	protected Display display;

	// Flag indicating first call of startApp
	protected boolean started;

	protected void startApp() {
		TextField txt1 = new TextField("Name", "Arnold L.", 32, TextField.ANY);
		TextField txt2 = new TextField("Address", "Exemple d'adresse" , 32, TextField.ANY);
		
		if (!started) {
			display = Display.getDisplay(this);

			Form form = new Form("Layout Basique");

			form.append("Hello");
			form.append("World");

			form.append("\nNouvelle Ligne + retour chariot\n");
			form.append("Voici une longue ligne descriptive qui devrait occuper plus d'une ligne.");

			form.append(txt1);
			form.append("\n");
			form.append(txt2);

			display.setCurrent(form);
			
			started = true;
		}
	}

	protected void pauseApp() {
	}

	protected void destroyApp(boolean unconditional) {
	}
}
