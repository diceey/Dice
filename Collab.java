import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class DiceHTML extends JApplet {
    //Called when this applet is loaded into the browser.
    public void init() {
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.JSFunctionCallback;
import com.teamdev.jxbrowser.chromium.JSObject;
import com.teamdev.jxbrowser.chromium.JSValue;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;

public class JavaScriptJavaSample {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent event) {
                if (event.isMainFrame()) {
                    Browser browser = event.getBrowser();
                    JSObject window = (JSObject)
                            browser.executeJavaScriptAndReturnValue("window");
                    window.setProperty("MyFunction", new JSFunctionCallback() {
                        @Override
                        public Object invoke(Object... args) {
                            for (Object arg : args) {
                                System.out.println("arg = " + arg);
                            }
                            return "Hello!";
                        }
                    });
                    JSValue returnValue = browser.executeJavaScriptAndReturnValue(
                            "MyFunction('Hello JxBrowser!', 1, 2, 3, true);");
                    System.out.println("return value = " + returnValue);
                }
            }
        });
        browser.loadURL("about:blank");
    }
}
import java.util.*;
Scanner kb = new Scanner(System.in);
boolean flag = true;
while(flag == true)
{
System.out.print("Would you like to the roll the dice (Y/N)");
String choice = kb.nextLine();
if (choice.equalsIgnoreCase("y"))
{
  int dice = (int)(Math.random()*7)
  System.out.println("The number you have rolled is " + dice);
  System.out.println("");
}
else if(!choice.equalsIgnoreCase("n"))
{
  System.out.println("You chose to quit, despacito!");
  flag = false;
}
end if
    }

                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}
