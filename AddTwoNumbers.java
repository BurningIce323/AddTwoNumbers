import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddTwoNumbers {

    AddTwoNumbers(){
        JFrame f=new JFrame("Add Two Numbers");
        //submit button
        JButton b=new JButton("Add");
        b.setBounds(200,200,140, 40);
        //enter num1 label
        JLabel label = new JLabel();
        label.setText("Enter First Number :");
        label.setBounds(10, 10, 300, 100);
        //enter num2 label
        JLabel label2 = new JLabel();
        label2.setText("Enter Second Number :");
        label2.setBounds(10, 50, 300, 100);
        //empty label which will show sum after button clicked
        JLabel labelSum = new JLabel();
        labelSum.setBounds(10, 110, 200, 100);
        //textfield to enter num1
        JTextField textfield= new JTextField();
        textfield.setBounds(210, 50, 130, 30);
        //textfield to enter num2
        JTextField textfield2= new JTextField();
        textfield2.setBounds(210, 90, 130, 30);
        //add to frame
        f.add(labelSum);
        f.add(textfield);
        f.add(label);
        f.add(textfield2);
        f.add(label2);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //action listener
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double num1 = Double.parseDouble(textfield.getText());
                double num2 = Double.parseDouble(textfield2.getText());
                double sum = num1 + num2;
                labelSum.setText("Sum: " + sum);
            }
        });
    }


    public static void main(String[] args) {
        new AddTwoNumbers();
    }
}