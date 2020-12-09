import javax.swing.*;
import java.awt.*;

class Calculator{
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Calculator");
        Container myContainer = myFrame.getContentPane();
        JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
        JButton bPlus,bMinus,bDevide,bMult,bPoint,bClear,bEqual;
        JTextField tf ;
        JLabel nameLabel;
        JPanel pButton;
        myFrame.setSize(200,200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myContainer.setBackground(new Color(0x123456));
        myContainer.setForeground(Color.white);
        myContainer.setLayout(new BorderLayout());

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bDevide = new JButton("/");
        bMult = new JButton("*");
        bEqual = new JButton("=");
        bClear = new JButton("C");
        bPoint = new JButton(".");
        tf=new JTextField();
        nameLabel = new JLabel("My Calculator");
        nameLabel.setForeground(Color.white);

        pButton = new JPanel(new GridLayout(5,4));
        pButton.add(b1);
        pButton.add(b2);
        pButton.add(b3);
        pButton.add(bClear);
        pButton.add(b4);
        pButton.add(b5);
        pButton.add(b6);
        pButton.add(bMult);
        pButton.add(b7);
        pButton.add(b8);
        pButton.add(b9);
        pButton.add(bMinus);
        pButton.add(b0);
        pButton.add(bPoint);
        pButton.add(bPlus);
        pButton.add(bDevide);
        pButton.add(bEqual);


        myContainer.add(tf,BorderLayout.NORTH);
        myContainer.add(pButton,BorderLayout.CENTER);
        myContainer.add(nameLabel,BorderLayout.SOUTH);


        myFrame.setVisible(true);
    }

}