
// Created by BC180200127
// Product class

public class Product{
    // Data members of Product class
    private int id;
    private String name;
    private float price;
    private int quantity;

    // default Constructor
    public Product(){
        this.id = 0;
        this.name = null;
        this.price= 0.0f;
        this.quantity=0;
    }
    // paramiterize Constructor

    public Product(String name,
                    float price,int quantity){

                    
                    this.name = name;
                    this.price = price;
                    this.quantity = quantity;

    }

    // copy constrcutor 
    public Product(Product productToCopy){

                    this.id = productToCopy.id;
                    this.name = productToCopy.name;
                    this.price = productToCopy.price;
                    this.quantity = productToCopy.quantity;
    }
    // public setter Functions

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // public getter function

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public float getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }
}// end of Product class