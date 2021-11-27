
package main.klaseobjekti;

// I KORAK - DEFINIŠEMO KLASU STUDENT 
//           DODELJUJEMO ATRIBUTE I/ILI METODE

public class Student {
    
    //atributi
    public String name;
    public String surname;
    public int age;
    
    //metode
    
    //treba da isprinta informacije
    public void introduce(){
        System.out.println ("Ja sam " + name + " " + surname + " i imam " + age + " godina.");
    }
    
    
}
