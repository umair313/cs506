import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleCalculator implements ActionListener{
    JFrame mainWindow;
    JButton plus,mult;
    JLabel first,second,result;
    JTextField firstField,secondField,resultField;

    public void initGui(){

        // setting main window Frame
        this.mainWindow = new JFrame("Calculator");
        this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainWindow.setSize(200,220);
        // setting buttons
        this.plus = new JButton("+");
        plus.setPreferredSize(new Dimension(70,25));
        this.mult = new JButton("*");
        mult.setPreferredSize(new Dimension(70,25));

        // setting Labels
        this.first = new JLabel("First Operand");   
        this.second = new JLabel("Second Operand");   
        this.result = new JLabel("Result");

        // setting Fields
        this.firstField = new JTextField(15);
        this.secondField = new JTextField(15);
        this.resultField = new JTextField(15);

        Container myContainer = mainWindow.getContentPane();
        myContainer.setLayout(new FlowLayout());
        myContainer.add(first);
        myContainer.add(firstField);
        myContainer.add(second);
        myContainer.add(secondField);
        myContainer.add(plus);
        myContainer.add(mult);
        myContainer.add(result);
        myContainer.add(resultField);
        
        plus.addActionListener(this);
        mult.addActionListener(this);
        this.mainWindow.setVisible(true);

        //

    }
    public simpleCalculator(){
        initGui();
    }
    public void actionPerformed(ActionEvent event){
        String operand;
        int num1,num2,result;
        if(event.getSource() == this.plus){
            operand = this.firstField.getText();   
            num1 = Integer.parseInt(operand);
            operand = this.secondField.getText();   
            num2 = Integer.parseInt(operand);
            result = num1+num2;
            this.resultField.setText(""+result);
            this.result.setText("Result : "+ result);

        }else if(event.getSource() == this.mult){
            operand = this.firstField.getText();   
            num1 = Integer.parseInt(operand);
            operand = this.secondField.getText();   
            num2 = Integer.parseInt(operand);
            result = num1*num2;
            this.resultField.setText(""+result);
            this.result.setText("Result : "+ result);

        }
    }// end of event handling

    //main 
    public static void main(String[] args) {
        new simpleCalculator();
    }


}