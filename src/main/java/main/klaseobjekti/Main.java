
package main.klaseobjekti;

public class Main {

    
    public static void main(String[] args) {
 
// LEKCIJA KLASE
        
//  II KORAK
// KREIRAMO VARIJABLU TIPA STUDENT
//        Student s1;
//// KREIRAMO NOVI OBJEKAT STUDENT     
//        s1 = new Student();
//        
//// DODELJUJEMO ATRIBUTE NOVOM OBJEKTU
//        s1.age = 18;
//        s1.name = "Marko";
//        s1.surname = "Markovic";
//   PUŠTAMO METODU NOVOM STUDENTU (ispisuje se navedeno iz introduce metode)     
//        s1.introduce();





//  II PRIMER - OBJEKTI LEKCIJA

//        Student s1 = new Student();
//        Student s2 = new Student();
//        
//        s1.name = "Marko";
//        s1.surname = "Markovic";
//        s1.age = 18;
//        
//        s2.name = "Jovan";
//        s2.surname = "Jovanovic";
//        s2.age = 22;
//        
//        //proveravamo da li su isti objekti
//        boolean b1 = s1 == s2;
//        
//        System.out.println(b1);
        
        //nisu isti, čak iako su im iste vrednosti, jer su setovani kao dva različita objekta
        
  
        
        
// LEKCIJA KONSTRUKTOR PRIMER

        Car car1 = new Car();  
// Car() je konstruktor. On služi da nam kreira objekat klase Car. Klasa i konstruktor imaju isti naziv.

        car1.brand = "Renault";
        car1.model = "Clio";
    
        Car car2 = new Car();
    
        car2.brand = "Audi";
        car2.model = "A4";
        
// Car() je defaultni konstruktor - nema parametre. On služi samo da kreira objekat.


// Kreiranje objekata sa konstruktorom koji ima parametre
    Car car3 = new Car("BMW", "520");
    

// LEKCIJA METODE

    Pravougaonik p1 = new Pravougaonik(4, 12);
    Pravougaonik p2 = new Pravougaonik(7, 9);
    
    p1.stampajObim();
    p2.stampajObim();
    
    p1.stampajPovrsinu();
    
    p1.izracunajObim();
    
    //pošto vraća rezultat int, možemo da napravimo novu varijablu sa tom vrednosšću
    
    int obimP1 = p1.izracunajObim();
    System.out.println("Obim objekta p1 je: " + obimP1);
    
    int povrsinaP1 = p1.izracunajPovrsinu();    
    System.out.println("Povrsina objekta p1 je: " + povrsinaP1);
    
    
            
            
    }
    
}
