package com.fs.arpg;

import java.util.Hashtable;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class GameMidlet extends MIDlet {
  private aq d;
  
  private Display d = Display.getDisplay(this);
  
  public GameMidlet() {
    ba.d = (Hashtable)this.d;
    ba.d = (Hashtable)this;
    this.d = (Display)new aq();
    ba.d = (Hashtable)this.d;
    aq.b();
  }
  
  public void startApp() {
    this.d.setCurrent((Displayable)this.d);
  }
  
  public void pauseApp() {
    this.d.z();
  }
  
  public void destroyApp(boolean paramBoolean) {}
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\GameMidlet.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */