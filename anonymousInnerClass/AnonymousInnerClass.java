package anonymousInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates anonymous inner class
 * @author youkpter
 * 2014年 09月 25日 星期四 17:01:15 CST
 */
public class AnonymousInnerClass
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        //keep program running util user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}


/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock
{
    /**
     * Starts the clock.
     * @param interval the interval between messages (in milliseconds)
     * @param beep true if the clock should beep
     */
    public void start(int interval, final boolean beep)
    {
        ActionListener listener = new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    Date now = new Date();
                    System.out.println("At the tone, the time is " + now);
                    if(beep)  Toolkit.getDefaultToolkit().beep();
                }
            };
        Timer t = new Timer(interval, listener);
        t.start();
    }
}
