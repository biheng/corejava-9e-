package calculator;

import java.awt.*;
import javax.swing.*;

/* a simple calculator
 * bugs: can't consider operator's priority
 */
public class CalculatorTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    JFrame frame = new JFrame();
                    JPanel calculatorPanel = new CalculatorPanel();
                    frame.add(calculatorPanel);
                    frame.setSize(300, 260);
                    frame.setTitle("CalculatorTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
}
