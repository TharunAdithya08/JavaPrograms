import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tempConverter
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Window");
        JLabel l1 = new JLabel("Enter the temperature in farenheit:");
        l1.setBounds(10,30,5000,30);
        f.add(l1);
        JTextField tf = new JTextField();
        tf.setBounds(300,30,100,30);
        f.add(tf);
        JButton b = new JButton("Click to convert to celsius!");
        b.setBounds(150,100,250,30);
        f.add(b);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Double input = Double.parseDouble(tf.getText());
                Double celsius = (5.0/9.0)*(input-32.0);
                l1.setText("Farenheit value entered: "+ input +"\tCelsius value: " + celsius);
                // JLabel l2 = new JLabel("Celsius value is : "+celsius);
                // l2.setBounds(60,100,300,40);
                // f.add(l2);
                f.remove(b);
                f.remove(tf);
            }
        });

        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}