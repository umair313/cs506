public class Person{
    private String name;
    private String address;
    private String CNIC;

    public Person(){
        name = null;
        address = null;
        CNIC = null;
    }
    public Person(String name,String address,String CNIC){
        this.name = name;
        this.address = address;
        this.CNIC = CNIC;
    }



    public void setName(String n){
        this.name = n;
    }
    public void setAddress(String add){
        this.address = add;
    }
    public void setCNIC(String cnic){
        this.CNIC = cnic;

    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCNIC(){
        return this.CNIC;
    }
}