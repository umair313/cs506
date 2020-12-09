public class Person{
    private String name;
    private String address;
    private String phoneNumber;

    public Person(){
        this.name = null;
        this.address = null;
        this.phoneNumber = null;
    }
    public Person(String name,String address,String ph){
        this.name = name;
        this.address = address;
        this.phoneNumber =ph;
    }
    public Person(Person p){
        this.name = p.name;
        this.address = p.address;
        this.phoneNumber =p.phoneNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String Add){
        this.address = Add;
    }
    public void setPhone(String ph){
        this.phoneNumber = ph;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

}