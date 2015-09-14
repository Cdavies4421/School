package school;
import java.util.ArrayList;

public class Person {
    
    //These track the instances of Person
//    public static int numPeople = 10;
//    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    
    enum Gender {
        Male, Female // The two genders of the Gender type
    }
    private Gender gender;
    private String name;
    private int weight;
    
    public static Person addPerson(String _name, Gender _gender, int _weight){
        Person temp = new Person(_name, _gender, _weight);
//        people[currentPeopleIndex++] = temp;
        people.add(temp);//ArrayList command
        return(temp);
    }
    
    //Default constructor.
    public Person(){
        name = "Nohbdy";
        gender = Gender.Female;
        weight = 100;
    }
    //More specific constructor.
    public Person(String _Name, Gender _Gender,int _Weight){
        gender = _Gender;
        name = _Name;
        weight = _Weight;
    }
    
    //set and get methods for gender
    public void setGender(Gender _gender){
        gender = _gender;
    }
    public Gender getGender(){
        return(gender);
    }
    
    //set and get methods for name
    public void setName(String _name){
        name = _name;
    }
    public String getName(){
        return(name);
    }
    
    //set and get methods for weight.
    public void setWeight(int _weight){
        weight = _weight;
    }
    public int getWeight(){
        return(weight);
    }
    
    public static void printNames(){
        System.out.println("====Roster====");
//        for(int i = 0; i < people.length; i++)
//        {
//            if(people[i] != null)
//            {
//                System.out.println(people[i].getName());
//            }
//        }
//        for(int i = 0; i < people.size(); i++)
//        {
//            System.out.println(people.get(i).getName());
//        }
        
        for(Person temp : people){  //for each loop
            System.out.println(temp.getName());
        }
    }
    
    public static void printNames(Gender gender){
        System.out.println("====" + gender + " Roster====");
        for(Person temp : people) //for each loop
        {  
            if(temp.getGender() == gender)
            {
                System.out.println(temp.getName());
            }
        }
    }
    
    public String toString(){
        return(name + " " + gender + " " + weight);
    }
}
