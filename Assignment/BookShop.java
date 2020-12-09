import java.util.*;
import javax.swing.JOptionPane;


public class BookShop{
    public Cart myCart;
    public static void main(String[] args) {
        BookShop myShop = new BookShop();
        myShop.showGUI();
    }
    public BookShop(){
        myCart = new Cart();
    }
    public BookShop(BookShop s){
        this.myCart = s.myCart ;
    }

    public void showGUI(){
        String userInput;
            while(true){
                userInput = 
                JOptionPane.showInputDialog(null,
                // information for menu choice
                "Please Enter \n"+
                "1 for \'Add Items in Cart\' \n"+
                "2 for \'Remove an Items from Cart\' \n"+
                "3 for \'Go to Checkout\' \n"+
                "4 for \'Empty the Cart\' \n"+
                "5 for \'Exit the Program\' \n",
                // title
                "BookShop Cart", 
                JOptionPane.INFORMATION_MESSAGE
                );
                
                // if input is valid not empty and not null
                if(checkInput(userInput)){
                    switch(Integer.parseInt(userInput)){
                        case 1:
                            addItem();
                            break;
                        case 2:
                            removeItem();
                            break;
                        case 3:
                            CheckOutCart();
                            break;
                        case 4:
                            removeAll();
                            break;
                        case 5:
                            developerInfo();
                            System.exit(0);
                    }
                }else{
                    if(userInput== null) System.exit(0);
                    JOptionPane.showMessageDialog(null,
                    "Invalid Input",
                     "Alert", JOptionPane.INFORMATION_MESSAGE);

                }

            }// while loop ends

    }// End showGUI
    public void addItem(){
        ArrayList<Product> list = new ArrayList<Product>();
        Product p;
        String inputQuantity;
        Integer quantity;
        String userInput;
            while(true){
                p= new Product();
                userInput = 
            JOptionPane.showInputDialog(null,
            // information for menu choice
            "Please Enter \n"+
            "1 to Add \'Handouts (Rs. 500.0 )\' \n"+
            "2 to Add \'Reference Books (Rs. 500.0)\' \n"+
            "3 to Add \'DVD (Rs. 500.0)\' \n"+
            "4 to Add \'USB (Rs. 2500.0)\' \n"+
            "5 to \'Done Adding\' \n",
            // title
            "Add Item(s) in Cart", 
            JOptionPane.INFORMATION_MESSAGE
            );
             // if input is valid not empty and not null
             if(checkInput(userInput)){
            switch(Integer.parseInt(userInput)){
                
                case 1:
                inputQuantity=
                JOptionPane.showInputDialog(null,
                 "Please specify the Quantity (1 to 10)",
                 "Quantity",
                 JOptionPane.INFORMATION_MESSAGE
                );
                if(checkInput(inputQuantity)){
                    quantity=Integer.parseInt(inputQuantity);
                    
                        System.out.println("input Quantity : " + quantity);
                        if(quantity.intValue() >= 1 && quantity <= 10){
                             p = new Product("Handout",500.5f,quantity);
                            p.setId(1);
                            this.myCart.addItem(p);
                        }else{
                            JOptionPane.showMessageDialog(null,
                            "Invalid Input",
                            "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                    
                }else{
                    if(inputQuantity == null) System.exit(0);
                    JOptionPane.showMessageDialog(null,
                    "Invalid Input",
                     "Alert", JOptionPane.INFORMATION_MESSAGE);

                }

                break;
                case 2:
                    inputQuantity=
                        JOptionPane.showInputDialog(null,
                        "Please specify the Quantity (1 to 10)",
                        "Quantity",
                        JOptionPane.INFORMATION_MESSAGE
                        );
                    if(checkInput(inputQuantity)){
                        quantity=Integer.parseInt(inputQuantity);
                        if(quantity.intValue() >= 1 && quantity <= 10){
                            p.setId(2);
                            p.setName("Reference Book");
                            p.setQuantity(quantity);
                            p.setPrice(500.0f);
                            this.myCart.addItem(p); // changed
                        }else{
                            JOptionPane.showMessageDialog(null,
                            "Invalid Input",
                            "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{
                        if(inputQuantity == null) System.exit(0);
                        JOptionPane.showMessageDialog(null,
                        "Invalid Input",
                         "Alert", JOptionPane.INFORMATION_MESSAGE);
    
                    }
                
                break;
                case 3:
                    inputQuantity=
                    JOptionPane.showInputDialog(null,
                    "Please specify the Quantity (1 to 10)",
                    "Quantity",
                    JOptionPane.INFORMATION_MESSAGE
                    );
                    if(checkInput(inputQuantity)){
                        quantity=Integer.parseInt(inputQuantity);
                        if(quantity.intValue() >= 1 && quantity <= 10){
                            p.setId(3);
                            p.setName("DVD");
                            p.setQuantity(quantity);
                            p.setPrice(500.0f);
                            this.myCart.addItem(p); // changed
                        }else{
                            JOptionPane.showMessageDialog(null,
                            "Invalid Input",
                            "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{
                        if(inputQuantity == null) System.exit(0);
                        JOptionPane.showMessageDialog(null,
                        "Invalid Input",
                         "Alert", JOptionPane.INFORMATION_MESSAGE);
    
                    }

                break;
                case 4:
                    inputQuantity=
                            JOptionPane.showInputDialog(null,
                            "Please specify the Quantity (1 to 10)",
                            "Quantity",
                            JOptionPane.INFORMATION_MESSAGE
                            );
                    if(checkInput(inputQuantity)){
                        quantity=Integer.parseInt(inputQuantity);
                        if(quantity.intValue() >= 1 && quantity <= 10){
                            p.setId(4);
                            p.setName("USB");
                            p.setQuantity(quantity);
                            p.setPrice(2500.0f);
                            this.myCart.addItem(p); // changed
                        }else{
                            JOptionPane.showMessageDialog(null,
                            "Invalid Input",
                            "Alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{
                        if(inputQuantity == null) System.exit(0);
                        JOptionPane.showMessageDialog(null,
                        "Invalid Input",
                         "Alert", JOptionPane.INFORMATION_MESSAGE);
    
                    }

                break;
                case 5:
                    return;

                
                
                

            }// end of switch
        }else{
            if(userInput == null) System.exit(0);
            JOptionPane.showMessageDialog(null,
            "Invalid Input",
             "Alert", JOptionPane.INFORMATION_MESSAGE);

        }
        }// end of while loop

    }
    
    public void removeItem(){


        String userInput;
            // if Cat is alreadY Empty Display message
            if(myCart.getProductIndex() == 0 ){ // changed
                
                JOptionPane.showMessageDialog(null,
                 "(!) Cart is already Empty nothing to remove", "Alert ", JOptionPane.INFORMATION_MESSAGE);
                 return;
            }
            while(true){
                
                userInput = 
                JOptionPane.showInputDialog(null,
                // information for menu choice
                "Please Enter \n"+
                "1 to Remove \'Handouts\' \n"+
                "2 to Remove \'Reference Books\' \n"+
                "3 to Remove \'DVD\' \n"+
                "4 to Remove \'USB\' \n"+
                "5 to Go Back <<",
                // title
                "Remove an Item", 
                JOptionPane.INFORMATION_MESSAGE
                );
                 // if input is valid not empty and not null
                 if(checkInput(userInput)){
                switch(Integer.parseInt(userInput)){
                    case 1:
                        if(this.myCart.removeItem("Handout") == 1){ // changed
                            JOptionPane.showMessageDialog(null,
                                    "Item Removed Successfully",
                                    "Removed", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 2:
                        if(this.myCart.removeItem("Reference Book") == 1){ //changed
                            JOptionPane.showMessageDialog(null,
                                    "Item Removed Successfully",
                                    "Removed", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(this.myCart.removeItem("DVD") == 1){ // changed
                        JOptionPane.showMessageDialog(null,
                                    "Item Removed Successfully",
                                    "Removed", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(this.myCart.removeItem("USB") == 1){ // changed
                        JOptionPane.showMessageDialog(null,
                                    "Item Removed Successfully",
                                    "Removed", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        return;   
                }
            }else{
                if(userInput== null) System.exit(0);
                JOptionPane.showMessageDialog(null,
                "Invalid Input",
                 "Alert", JOptionPane.INFORMATION_MESSAGE);

            }
            }// while loop ends
    }
    public void CheckOutCart(){
        if(this.myCart.getProductIndex() == 0){ 
                
            JOptionPane.showMessageDialog(null,
             "(!) Cart is Empty please add Item to checkout.", "Check Out ?", JOptionPane.INFORMATION_MESSAGE);
             return;
        }

        Float bill = 0.0f;
        String checkOutInfo = "";
        String billInfo = "";

        ArrayList<Product> list = new ArrayList<Product>();
        list = this.myCart.getItemsList();

        for(int i=0;i<list.size();i++){

                checkOutInfo = checkOutInfo + (i+1) + " " +
                list.get(i).getName() +
                ": Rs. " + list.get(i).getPrice() + " X " +
                list.get(i).getQuantity() +
                "       = " + list.get(i).getQuantity() * list.get(i).getPrice()+ "\n" ;
            
                bill = bill + list.get(i).getQuantity() * list.get(i).getPrice();

        }
            billInfo = "No of Items: " + list.size() + " - " + "Total Bill : " + bill;
            System.out.println(checkOutInfo);
            System.out.println(billInfo);
            JOptionPane.showMessageDialog(null,
                checkOutInfo + "\n" +
                billInfo+ " ",
                "Go To CheckOut",JOptionPane.INFORMATION_MESSAGE);
        
    }
    public void removeAll(){
       if(this.myCart.emptyCart()){
        JOptionPane.showMessageDialog(null,
        "All items have been removed Successfully", "Empty The Cart", JOptionPane.INFORMATION_MESSAGE);
       }else{
        JOptionPane.showMessageDialog(null,
        "(!) Cart is already Empty nothing to remove", "Alert", JOptionPane.INFORMATION_MESSAGE);
       }


    }
    public void developerInfo(){
        JOptionPane.showMessageDialog(null,
        "Name : Umair Mehmood (BC180200127)",
         "Developer Info", JOptionPane.INFORMATION_MESSAGE);
    }
    public Boolean checkInput(String input){
            if(input!=null){
                try {
                    Integer isNumber = Integer.parseInt(input);
                } catch (Exception NumberFormatException) {
                   return false;
                }
            }else{
                return false;
            }

        return true;
    }
}
    

