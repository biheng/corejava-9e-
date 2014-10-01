package checkbox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxFrame extends JFrame
{
    private JLabel label;
    private JPanel buttonPanel;
    private JCheckBox boldBox;
    private JCheckBox italicBox;

    public CheckBoxFrame()
    {
        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        boldBox = new JCheckBox("Bold");
        italicBox = new JCheckBox("Italic");
        buttonPanel = new JPanel();

        add(label, BorderLayout.NORTH);

        ActionListener listener = new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    int mode = 0;
                    if(boldBox.isSelected())
                        mode += Font.BOLD;
                    if(italicBox.isSelected())
                        mode += Font.ITALIC;
                    label.setFont(new Font("Serif", mode, 15));
                }
            };

        boldBox.addActionListener(listener);
        italicBox.addActionListener(listener);
        buttonPanel.add(boldBox);
        buttonPanel.add(italicBox);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(500, 200);
    }
}
