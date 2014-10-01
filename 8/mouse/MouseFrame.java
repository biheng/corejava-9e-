package mouse;

import javax.swing.*;

/**
 * A frame containing a panel for testing mouse operations
 */
public class MouseFrame extends JFrame
{
    public MouseFrame()
    {
        setSize(300, 200);
        add(new MouseComponent());
        //pack();
    }
}
