package windowsClosing;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * This program put up a confirm dialog when user close the windows
 * @author youkpter
 * 2014年 09月 27日 星期六 09:58:17 CST
 */
public class WindowsClosing
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    JFrame frame = new WindowsFrame();
                    frame.setTitle("Test windows close");
                    frame.setVisible(true);

                    frame.addWindowListener(new WindowAdapter()
                        {
                            public void windowClosing(WindowEvent e)
                            {
                                int option = JOptionPane.showConfirmDialog(null, "Do you really want to close the windows?",
                                    "Test windows close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                if(option == JOptionPane.YES_OPTION)
                                    System.exit(0);
                                else //I don't have idea how to deal with NO_OPTION, so terminate the program too
                                System.exit(0);
                            }
                        });
                }
            });
    }
}

class WindowsFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public WindowsFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
