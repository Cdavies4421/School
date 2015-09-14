package school;

public class School 
{


    public static void main(String[] args) 
    {
       Person carol = Person.addPerson("Carol", Person.Gender.Female, 115);
       Person alice = Person.addPerson("Alice", Person.Gender.Female, 125);
       Person edward = Person.addPerson("Edward", Person.Gender.Male, 180);
       Person alphonse = Person.addPerson("Alphonse", Person.Gender.Male, 160);
       carol.setName("Sara"); // These are just variables
       Person.printNames();
       System.out.println("\n");
       Person.printNames(Person.Gender.Female);
       System.out.println("\n");
       Person.printNames(Person.Gender.Male);
       System.out.println("\n" + edward);
    }
}
