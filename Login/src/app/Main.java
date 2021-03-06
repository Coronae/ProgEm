package app;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;


	public class Main extends MIDlet implements CommandListener, ItemCommandListener {

	    private boolean midletPaused = false;

	    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">                      
	    private Command exitCommand;
	    private Command okCommand;
	    private Command exitCommand1;
	    private Form form;
	    private StringItem lblUserName;
	    private TextField txtUserName;
	    private StringItem lblPassword;
	    private TextField txtPassword;
	    private StringItem lblBlankSpace;
	    private StringItem cmdOK;
	    private StringItem stringItem;
	    //</editor-fold>                    

	    /**
	     * The main constructor.
	     */
	    public Main() {
	    }

	    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">                       
	    //</editor-fold>                     

	    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">                                           
	    /**
	     * Initilizes the application.
	     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
	     */
	    private void initialize() {                                         
	        // write pre-initialize user code here

	        // write post-initialize user code here
	    }                            
	    //</editor-fold>                          

	    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">                                        
	    /**
	     * Performs an action assigned to the Mobile Device - MIDlet Started point.
	     */
	    public void startMIDlet() {                                      
	        // write pre-action user code here
	        switchDisplayable(null, getForm());                                        
	        // write post-action user code here
	    }                             
	    //</editor-fold>                           

	    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">                                         
	    /**
	     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
	     */
	    public void resumeMIDlet() {                                       
	        // write pre-action user code here

	        // write post-action user code here
	    }                              
	    //</editor-fold>                            

	    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">                                              
	    /**
	     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
	     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
	     * @param nextDisplayable the Displayable to be set
	     */
	    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {                                            
	        // write pre-switch user code here
	        Display display = getDisplay();                                               
	        if (alert == null) {
	            display.setCurrent(nextDisplayable);
	        } else {
	            display.setCurrent(alert, nextDisplayable);
	        }                                             
	        // write post-switch user code here
	    }                                   
	    //</editor-fold>                                 

	    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">                                                 
	    /**
	     * Called by a system to indicated that a command has been invoked on a particular displayable.
	     * @param command the Command that was invoked
	     * @param displayable the Displayable where the command was invoked
	     */
	    public void commandAction(Command command, Displayable displayable) {                                               
	        // write pre-action user code here
	        if (displayable == form) {                                           
	            if (command == exitCommand) {                                         
	                // write pre-action user code here
	                exitMIDlet();                                           
	                // write post-action user code here
	            }                                                  
	        }                                                
	        // write post-action user code here
	    }                               
	    //</editor-fold>                             

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">                                   
	    /**
	     * Returns an initiliazed instance of exitCommand component.
	     * @return the initialized component instance
	     */
	    public Command getExitCommand() {
	        if (exitCommand == null) {                                 
	            // write pre-init user code here
	            exitCommand = new Command("Exit", Command.EXIT, 0);                                   
	            // write post-init user code here
	        }                         
	        return exitCommand;
	    }
	    //</editor-fold>                       

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">                                   
	    /**
	     * Returns an initiliazed instance of form component.
	     * @return the initialized component instance
	     */
	    public Form getForm() {
	        if (form == null) {                                 
	            // write pre-init user code here
	            form = new Form("Welcome", new Item[] { getLblUserName(), getTxtUserName(), getLblPassword(), getTxtPassword(), getLblBlankSpace(), getCmdOK(), getStringItem() });                                    
	            form.addCommand(getExitCommand());
	            form.setCommandListener(this);                                  
	            // write post-init user code here
	        }                         
	        return form;
	    }
	    //</editor-fold>                       
	    //</editor-fold>



	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: lblUserName ">                                   
	    /**
	     * Returns an initiliazed instance of lblUserName component.
	     * @return the initialized component instance
	     */
	    public StringItem getLblUserName() {
	        if (lblUserName == null) {                                 
	            // write pre-init user code here
	            lblUserName = new StringItem("User Name :", "");                                    
	            lblUserName.setLayout(ImageItem.LAYOUT_CENTER);                                  
	            // write post-init user code here
	        }                         
	        return lblUserName;
	    }
	    //</editor-fold>                       

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtUserName ">                                   
	    /**
	     * Returns an initiliazed instance of txtUserName component.
	     * @return the initialized component instance
	     */
	    public TextField getTxtUserName() {
	        if (txtUserName == null) {                                 
	            // write pre-init user code here
	            txtUserName = new TextField("", "", 32, TextField.ANY);                                    
	            txtUserName.setLayout(ImageItem.LAYOUT_CENTER | ImageItem.LAYOUT_NEWLINE_AFTER);                                  
	            // write post-init user code here
	        }                         
	        return txtUserName;
	    }
	    //</editor-fold>                       

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: lblPassword ">                                   
	    /**
	     * Returns an initiliazed instance of lblPassword component.
	     * @return the initialized component instance
	     */
	    public StringItem getLblPassword() {
	        if (lblPassword == null) {                                 
	            // write pre-init user code here
	            lblPassword = new StringItem("Password :", "");                                    
	            lblPassword.setLayout(ImageItem.LAYOUT_CENTER | ImageItem.LAYOUT_NEWLINE_AFTER);                                  
	            // write post-init user code here
	        }                         
	        return lblPassword;
	    }
	    //</editor-fold>                       

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtPassword ">                                   
	    /**
	     * Returns an initiliazed instance of txtPassword component.
	     * @return the initialized component instance
	     */
	    public TextField getTxtPassword() {
	        if (txtPassword == null) {                                 
	            // write pre-init user code here
	            txtPassword = new TextField("", "", 32, TextField.ANY);                                    
	            txtPassword.setLayout(ImageItem.LAYOUT_CENTER | ImageItem.LAYOUT_NEWLINE_AFTER);                                  
	            // write post-init user code here
	        }                         
	        return txtPassword;
	    }
	    //</editor-fold>                       
	    //</editor-fold>

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: lblBlankSpace ">                                   
	    /**
	     * Returns an initiliazed instance of lblBlankSpace component.
	     * @return the initialized component instance
	     */
	    public StringItem getLblBlankSpace() {
	        if (lblBlankSpace == null) {                                 
	            // write pre-init user code here
	            lblBlankSpace = new StringItem("", "");                                   
	            // write post-init user code here
	        }                         
	        return lblBlankSpace;
	    }
	    //</editor-fold>                       

	    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Items ">                                                           
	    /**
	     * Called by a system to indicated that a command has been invoked on a particular item.
	     * @param command the Command that was invoked
	     * @param displayable the Item where the command was invoked
	     */
	    public void commandAction(Command command, Item item) {                                                         
	        // write pre-action user code here
	        if (item == cmdOK) {                                                
	            if (command == okCommand) {                                              
	                // write pre-action user code here

	                // write post-action user code here
	            }                                                
	        } else if (item == stringItem) {
	            if (command == exitCommand1) {                                              
	                // write pre-action user code here
	                exitMIDlet();                                                
	                // write post-action user code here
	            }                                                            
	        }                                                          
	        // write post-action user code here
	    }                                    
	    //</editor-fold>                                  

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">                                   
	    /**
	     * Returns an initiliazed instance of okCommand component.
	     * @return the initialized component instance
	     */
	    public Command getOkCommand() {
	        if (okCommand == null) {                                 
	            // write pre-init user code here
	            okCommand = new Command("Ok", Command.OK, 0);                                   
	            // write post-init user code here
	        }                         
	        return okCommand;
	    }
	    //</editor-fold>                       

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: cmdOK ">                                   
	    /**
	     * Returns an initiliazed instance of cmdOK component.
	     * @return the initialized component instance
	     */
	    public StringItem getCmdOK() {
	        if (cmdOK == null) {                                 
	            // write pre-init user code here
	            cmdOK = new StringItem("Login", "", Item.BUTTON);                                    
	            cmdOK.addCommand(getOkCommand());
	            cmdOK.setItemCommandListener(this);                                  
	            // write post-init user code here
	        }                         
	        return cmdOK;
	    }
	    //</editor-fold>                       

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">                                   
	    /**
	     * Returns an initiliazed instance of stringItem component.
	     * @return the initialized component instance
	     */
	    public StringItem getStringItem() {
	        if (stringItem == null) {                                 
	            // write pre-init user code here
	            stringItem = new StringItem("Cancel", "", Item.BUTTON);                                    
	            stringItem.addCommand(getExitCommand1());
	            stringItem.setItemCommandListener(this);                                  
	            // write post-init user code here
	        }                         
	        return stringItem;
	    }
	    //</editor-fold>                       

	    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">                                   
	    /**
	     * Returns an initiliazed instance of exitCommand1 component.
	     * @return the initialized component instance
	     */
	    public Command getExitCommand1() {
	        if (exitCommand1 == null) {                                 
	            // write pre-init user code here
	            exitCommand1 = new Command("Exit", Command.EXIT, 0);                                   
	            // write post-init user code here
	        }                         
	        return exitCommand1;
	    }
	    //</editor-fold>                       

	    /**
	     * Returns a display instance.
	     * @return the display instance.
	     */
	    public Display getDisplay () {
	        return Display.getDisplay(this);
	    }

	    /**
	     * Exits MIDlet.
	     */
	    public void exitMIDlet() {
	        switchDisplayable (null, null);
	        destroyApp(true);
	        notifyDestroyed();
	    }

	    /**
	     * Called when MIDlet is started.
	     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
	     */
	    public void startApp() {
	        if (midletPaused) {
	            resumeMIDlet ();
	        } else {
	            initialize ();
	            startMIDlet ();
	        }
	        midletPaused = false;
	    }

	    /**
	     * Called when MIDlet is paused.
	     */
	    public void pauseApp() {
	        midletPaused = true;
	    }

	    /**
	     * Called to signal the MIDlet to terminate.
	     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
	     */
	    public void destroyApp(boolean unconditional) {
	    }

	}
