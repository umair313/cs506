import java.util.*;
public class Array{
    public static void main(String[] args){
       
        ArrayList<Student> sl = new ArrayList<Student>();
        
        Student ms = new Student("UMAIR",1);
        sl.add(ms);
        ms = new Student("ALI",2);
        sl.add(ms);
        ms.setName("BILAL");
        
        for(int i=0;i<sl.size();i++){
            //System.out.print(sl.get(i));
            ms = (Student) sl.get(i);
            System.out.print(ms);    
        }
       

    }
}