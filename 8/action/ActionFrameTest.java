package action;

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates the action invoke by button and keystroke
 * @author youkpter
 * 2014年 09月 27日 星期六 14:29:05 CST
 */
public class ActionFrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    JFrame frame = new ActionFrame();
                    frame.setTitle("ActionFrameTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
}
