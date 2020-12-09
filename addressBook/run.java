import javax.swing.*;


public class run {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        Person temp = new Person();
        String input,s;
        int ch;
        while(true){
            input = 
            JOptionPane.showInputDialog(
                        null, 
                        "Enter 1 to Add\n"+
                        "Enter 2 to Search\n" +
                        "Enter 3 to Delete\n"+
                        "Enter 4 to Exit",
                        "Address Book Menu",JOptionPane.INFORMATION_MESSAGE);
                ch = Integer.parseInt(input);
                switch(ch){
                    case 1:
                        
                        String name = JOptionPane.showInputDialog(null, "Enter Name");
                        String add = JOptionPane.showInputDialog(null, "Enter Address");
                        String ph = JOptionPane.showInputDialog(null, "Enter Phone");
                        temp = new Person(name, add, ph);
                        ab.addperson(temp);
                        temp =new Person();
                    break;
                    case 2:
                        s = JOptionPane.showInputDialog(null, "Enter Name");
                        temp = ab.searchPerson(s);
                        if(temp.getName() == null){
                            JOptionPane.showMessageDialog(null, "Not Found",
                             "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            String p= temp.getName() + ","+
                                temp.getAddress() + "," + temp.getPhoneNumber();
                            System.out.println(p);
                        }
                    break;
                    case 3:
                        s = JOptionPane.showInputDialog(null, "Enter Name");
                        ab.deletePerson(s);
                    break;
                    case 4:
                        System.exit(0);
                }//end of switch
        }// end of while loop
    }// main ends


    public void sowmenu(){
        
    }
}// class ends
