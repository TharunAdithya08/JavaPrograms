import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sumOfDigitsSwing
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("SUM OF IND. DIGITS");
        JLabel l1 = new JLabel("Enter the number:");
        l1.setBounds(30,30,250,40);
        f.add(l1);
        JTextField tf = new JTextField();
        tf.setBounds(300,30,100,40);
        f.add(tf);
        JButton b = new JButton("Calculate");
        b.setBounds(150,90,200,40);
        f.add(b);
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int num = Integer.parseInt(tf.getText());
                int sum = 0;
                while(num!=0)
                {
                    sum += (num % 10);
                    num /= 10;
                }
                l1.setText("Sum of the digits is: "+sum);
                f.remove(tf);
                f.remove(b);

            }
        });

    }
}
