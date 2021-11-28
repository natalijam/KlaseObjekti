
package main.klaseobjekti;

public class Main {

    
    public static void main(String[] args) {

 
        
// LEKCIJA KLASE (Student klasa)
 
 
// KREIRAMO VARIJABLU TIPA STUDENT
//        Student s1;
// KREIRAMO NOVI OBJEKAT STUDENT     
//        s1 = new Student();
//        
// DODELJUJEMO ATRIBUTE NOVOM OBJEKTU
//        s1.age = 18;
//        s1.name = "Marko";
//        s1.surname = "Markovic";
// PUŠTAMO METODU NOVOM STUDENTU (ispisuje se navedeno iz introduce metode)     
//        s1.introduce();



//   LEKCIJA OBJEKTI  (Student klasa)

 
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
        
  
        
        
// LEKCIJA KONSTRUKTOR (Car klasa)


//        Car car1 = new Car();

// Car() je konstruktor. On služi da nam kreira objekat klase Car. Klasa i konstruktor imaju isti naziv.
//
//        car1.brand = "Renault";
//        car1.model = "Clio";
//    
//        Car car2 = new Car();
//    
//        car2.brand = "Audi";
//        car2.model = "A4";
//        
//Car() je defaultni konstruktor - nema parametre. On služi samo da kreira objekat.
//
//
// Kreiranje objekata sa konstruktorom koji ima parametre
//        Car car3 = new Car("BMW", "520");




//   LEKCIJA METODE (Pravougaonik klasa)
//

//    Pravougaonik p1 = new Pravougaonik(4, 12);
//    Pravougaonik p2 = new Pravougaonik(7, 9);
//    
//    p1.stampajObim();
//    p2.stampajObim();
//    
//    p1.stampajPovrsinu();
//    
//    p1.izracunajObim();
//    
// pošto vraća rezultat int, možemo da napravimo novu varijablu sa tom vrednosšću
//    
//    int obimP1 = p1.izracunajObim();
//    System.out.println("Obim objekta p1 je: " + obimP1);
//    
//    int povrsinaP1 = p1.izracunajPovrsinu();    
//    System.out.println("Povrsina objekta p1 je: " + povrsinaP1);
 

    
    // FINAL  (Krug klasa)
    
    
//    Krug k1 = new Krug(2.3);
//    
//    Krug k2 = new Krug(5.0);
//    
//    k1.izracunajObim();
//    k2.izracunajPovrsinu();
 


    // STATIC  (Krug klasa)
    
    
//    Krug k1 = new Krug(9.0);    
//    Krug k2 = new Krug(5.0);
    
    //oba objekta sada imaju po dva atributa u svojoj memoriji, ali kada dodelimo static za PI,
    // onda oni čuvaju po jedan atribut, a atribut PI je sada zajednički i izdvojen u memoriji
    
    double pi = Krug.PI;
    // kada je static field, ne mora da ima objekat da bi mogao da se pozove
    
    Krug.izracunajPovrsinu(3.0);
    // metoda ne mora da ima objekat da bi bila pozvana
    // dodelili smo vrednost prosleđenom parametru 3.0, ili možemo bilo koju drugu
    
    }
    
}
