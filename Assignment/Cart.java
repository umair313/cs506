
import java.util.ArrayList;

public class Cart extends Product{
    // data members
    private ArrayList<Product> CartItems;

    // default constructor
    public Cart(){
        super();     // Parent class constructor
        CartItems = new ArrayList<Product>();
        
    }
    // Paramiter rize Constructor
    public Cart(String name,float price,int quantity){
        super(name, price, quantity);
    }
    // copy constructor 
    public Cart(Cart c){
        this.CartItems = c.CartItems;
    }
    // Method to ad Items in to CartItems List
    public void addItem(Product productToAdd){
        // loop through all the list if 
        // list is empty loop will not run
        for(int x=0;x<CartItems.size();x++){
            // if product exit then update it
            if(CartItems.get(x).getName() == productToAdd.getName()){
                CartItems.get(x).setQuantity(
                    CartItems.get(x).getQuantity() + productToAdd.getQuantity());
                return;
            }
        }
        // add product in the list if not already exit
        this.CartItems.add(productToAdd);
    }
    //method for removing specific item from Cart
    // will take item name as paramiter
    public int removeItem(String productName){

        //removed indicates nothing removed
        // or item may not exit 
        int removed = 0; 
        for(int x=0;x<CartItems.size();x++){
            // if item exit then remove item from list
            if(CartItems.get(x).getName() == productName){
                
                   CartItems.remove(x);
                   removed = 1; // indicates item removed
            }       
        }
        return removed;
    }
    // method will clear Cart list
    public Boolean emptyCart(){
        if (CartItems.size() == 0){
            return false;
        }
        CartItems.clear();
        return true;
    }
    // return product index
    public int getProductIndex(){
        return CartItems.size();
    }
    // return all the items in the list
    public ArrayList<Product> getItemsList(){
        return CartItems;
    }
}
