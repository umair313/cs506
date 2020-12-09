import javax.swing.*;


import java.awt.*;
class run{
    public static void main(String[] args) {
        JFrame myFrame=  new JFrame("Grid Layour");
        myFrame.setSize(500,500);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myContainer = myFrame.getContentPane();


        myContainer.setLayout(new GridLayout(3,3));
        myContainer.setBackground(new Color(0xd35400));
        myContainer.add(new JButton("1").setBackground(new Color(1,1,1)));
        // myContainer.add(new JButton("2"));
        // myContainer.add(new JButton("3"));
        // myContainer.add(new JButton("4"));
        // myContainer.add(new JButton("5"));
        // myContainer.add(new JButton("6"));
        // myContainer.add(new JButton("7"));
        // myContainer.add(new JButton("8"));
        // myContainer.add(new JButton("9"));
        myFrame.setVisible(true);
        
        
    }
}