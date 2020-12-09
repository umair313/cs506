import javax.swing.*;
import java.awt.*;
class run{
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Border Layout");
        Container myContainer = myFrame.getContentPane();
        JButton b1,b2,b3,b4,b5;
        myFrame.setSize(200,200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myContainer.setBackground(new Color(0x123456));
        myContainer.setLayout(new BorderLayout());


        b1 = new JButton("Next Slide");
        b2 = new JButton("Previous Slide");
        b3 = new JButton("Back to Slide");
        b4 = new JButton("Last Slide");
        b5 = new JButton("exit");

        myContainer.add(b1,BorderLayout.NORTH);

        myContainer.add(b2,BorderLayout.SOUTH);
        myContainer.add(b4,BorderLayout.EAST);
        myContainer.add(b3,BorderLayout.WEST);
        myContainer.add(b5,BorderLayout.CENTER);

        myFrame.setVisible(true);
    }

}