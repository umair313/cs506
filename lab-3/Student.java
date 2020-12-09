import java.io.*;
import javax.swing.*;

public class Student extends Person{
    private String student_id ;
    private String study_program ;
    public static void main(String[] args) {
        new Student().showMenu();

    }

    public Student(){
        super();
        student_id = null;
        study_program = null;
    }

    public Student(String name,String address,String CNIC,String sid,String sp){
        super(name, address, CNIC);
        this.student_id = sid;
        this.study_program = sp;
    }

    public void setStudentID(String sid){
        this.student_id = sid;
    }
    public void setStudyProgram(String sp){
        this.study_program = sp;
    }
    public String getStudentID(){
        return this.student_id;
    }
    public String getStudentProgram(){
        return this.study_program;
    }
    public void showMenu(){
        String userInput="";
        try {
            while(true){
                userInput = JOptionPane.showInputDialog(null,
                "Press 1 to Add new Student \n" +
                "Press 2 to display all student \n" +
                "Press 3 to ext Program ", "Menu", JOptionPane.INFORMATION_MESSAGE
                );
                switch(Integer.parseInt(userInput)){
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        showStudent();
                    break;
                    case 3:
                    System.exit(0);
                }
            }
        } catch (NumberFormatException invalidInput) {
            if(userInput == "") System.exit(0);
            JOptionPane.showMessageDialog(null,
                "Invalid selection", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addStudent(){
        String allStudentIndo = "";
        String inputName;
        String inputAddress;
        String inputCNIC;
        String inputStudentId;
        String inputStudyProgram;
        Student newStudent ;
        try{
            FileWriter fw = new FileWriter("student.txt",true);
            PrintWriter pw = new PrintWriter(fw);

                        inputName = JOptionPane.showInputDialog(null,
                        "Enter Student Name", "Input",JOptionPane.INFORMATION_MESSAGE
                        );
                        inputAddress = JOptionPane.showInputDialog(null,
                        "Enter Student Address","Input", JOptionPane.INFORMATION_MESSAGE
                        );
                        inputCNIC = JOptionPane.showInputDialog(null,
                        "Enter Student CNIC", "Input",JOptionPane.INFORMATION_MESSAGE
                        );
                        inputStudentId = JOptionPane.showInputDialog(null,
                        "Enter Student ID", "Input",JOptionPane.INFORMATION_MESSAGE
                        );
                        inputStudyProgram = JOptionPane.showInputDialog(null,
                        "Enter Student study Program","Input", JOptionPane.INFORMATION_MESSAGE
                        );
                        newStudent = new Student(inputName, inputAddress, 
                        inputCNIC, inputStudentId, inputStudyProgram);
                        allStudentIndo = 
                            newStudent.getStudentID() + ","+
                            newStudent.getName() + ","+
                            newStudent.getCNIC() + ","+
                            newStudent.getAddress() + ","+
                            newStudent.getStudentProgram();
                        pw.println(allStudentIndo);
                        pw.flush();
                        fw.close();
                        pw.close();

        }catch(NumberFormatException wrongInput){
            JOptionPane.showMessageDialog(null,
                "Invalid input", "Alert", JOptionPane.ERROR_MESSAGE);
        }catch(IOException ioEx){
            System.out.println("IO ex");
        }
    }// end of addStudent

    void showStudent(){
        String tokkens[] = null;
        try {
            String line;
            FileReader fr = new FileReader("Student.txt");
            BufferedReader br = new BufferedReader(fr);
            line = br.readLine();
            tokkens = line.split(",");
            System.out.println(tokkens[0]);
            System.out.println(tokkens[1]);
            System.out.println(tokkens[2]);
            System.out.println(tokkens[3]);
            // while(line != null){
            //     System.out.println(line);
            //     line = br.readLine();
            // }
            br.close();
            fr.close();
        } catch (IOException filenotfound) {
            System.out.println("File not Found");
        }
    }
}