package localInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of local inner class
 * @author youkpter
 * 2014年 09月 25日 星期四 16:16:47 CST
 */
public class LocalInnerClass
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock();
        clock.start(10000, true);

        //keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock
{
    //don't need private interval and boolean beep

    /**
     * start the clock
     */
    public void start(int interval, final boolean beep)
    {
        class TimePrinter implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                if(beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        }

        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }
}
