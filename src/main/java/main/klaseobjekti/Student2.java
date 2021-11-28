
package main.klaseobjekti;

public class Student2 {
    
    
    //atributi
    
    public String name;
    public String surname;
    public int age;
    
    
    //konstruktori
    
    public Student2(){
    
    }
    
    public Student2(String name, String surname){
      this.name = name;  
      this.surname = surname;
      // sa this. prosleđeni podaci atributa name i surname u konstruktor
    }
    
    public Student2(String name, String surname, int age){
                
        //this.name = name;
        //this.surname = surname;
        
        this(name, surname);
        // sa this smo pozvali drugi konstruktor u kome su name i surname
        // ako pozivamo drugi konstruktor, on mora biti u prvoj liniji koda
        
        this.age = age;
    
    }
    
    
    //metode
    
    public void introduce(){
        
      // System.out.println("Ja sam " + this.name);
      
      // sa this.name prosleđeni podaci atributa name u metodu
      // validna je varijanta prosleđivanja i ovog atributa bez this. , ali
      // ukoliko u metodi postoji varijabla name ona ima prednost
      
      String name = this.name + this.surname;
      
      System.out.println("Ja sam " + name);
      
    }
}
