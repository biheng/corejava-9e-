package sizedFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author youkpter
 * 2014年 09月 25日 星期四 20:43:12 CST
 */
public class SizedFrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        JFrame frame = new SizedFrame();
                        frame.setTitle("SizedFrame");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setVisible(true);
                    }
                });
    }
}

class SizedFrame extends JFrame
{
    public SizedFrame()
    {
        //get screen dimensions

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        //set frame width, height and let platform pck screen location
        
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        //set frame icon
        
        Image img = new ImageIcon("/home/youkpter/Pictures/what.jpg").getImage();
        setIconImage(img);
    }
}
