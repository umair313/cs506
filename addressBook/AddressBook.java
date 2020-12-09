import java.util.ArrayList;

public class AddressBook{
    ArrayList<Person> list;

    //constructor 

    public AddressBook(){
        list = new ArrayList<Person>();
    }

    public int getSize(){
        return list.size();
    }    
    public void addperson(Person p){
        list.add(p);
    }
    public Person searchPerson(String name){
        Person temp = new Person();
        for(int x=0;x<list.size();x++){
            if (name.equals(list.get(x).getName()) ){
                temp =  (Person)list.get(x);
            }
        }
    return temp;
    }
    public void deletePerson(String name){
        for(int x=0;x<list.size();x++){
            if(name.equals(list.get(x).getName())){
                list.remove(x);
            }
        }
    }
}