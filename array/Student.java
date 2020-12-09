public class Student{
    protected String name;
    protected int id;

    public Student(){
        System.out.println("Student constructor called");
        name = null;
        id = 0;
    }

    public Student(String name,int id){
        System.out.println("Student param-constructor called");
        this.name = name;
        this.id = id;
    }
    public void Display(){
        System.out.println(this.name);
        System.out.println(this.id);

    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id= id;
    }


    public String getName(){
        System.out.println("Getting name " + this.name);
        return this.name;
    }
    public int getId(){
        return this.id;
    }
}