import javax.swing.*;
import java.awt.*;

class run{
    public static void main(String[] args) {

        JFrame myframe= new JFrame("Flow");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setSize(500,500);
        
        JTextField tf = new JTextField(16);
        tf.setText("Text");
        tf.setEditable(false);

        JButton b_one = new JButton("Button ONE");
        JButton b_two = new JButton("Button two");
        JButton b_three = new JButton("Button three");
        JButton b_four = new JButton("Button four");
        JLabel name_label= new JLabel("Enter Name:");
        Container c = myframe.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.add(name_label);
        c.add(tf);
        c.add(b_one);
        c.add(b_two);
        c.add(b_three);
        c.add(b_four);
        myframe.setVisible(true);
    }
}
