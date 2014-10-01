package plaf;

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates how to change the look-and-feel
 * @author youkpter
 * 2014年 09月 27日 星期六 09:32:05 CST
 */
public class PlafFrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    JFrame frame = new PlafFrame();
                    frame.setTitle("PlafFrameTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
}
