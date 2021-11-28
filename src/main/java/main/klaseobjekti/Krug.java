
package main.klaseobjekti;


public class Krug {

//PRIMER ZA FINAL
    
    //atributi
    
//    public double poluprecnik;
//    public final double PI = 3.14; //obično se varijabla piše velikim slovom kada je final, jer je sad konstanta
//    
    //konstruktor
    
//    public Krug(double newP){
//        poluprecnik = newP;
//    }  
//    
    //metode
//    
//    public void izracunajPovrsinu() {
//        double p = poluprecnik * poluprecnik * PI;
//        System.out.println("Povrsina kruga je: " + p);
//    }
//    
//    public void izracunajObim(){
//        double o = poluprecnik * 2 * PI;
//        System.out.println("Obim kruga je: " + o);
//    }
    
//PRIMER ZA STATIC
    
    //atributi
    public double poluprecnik;
    public static final double PI = 3.14;
    
    //konstruktor
    public Krug(double p){
        poluprecnik = p;
    }
    
    //metode
    public static void izracunajPovrsinu(double poluprecnik){
        double p = poluprecnik * poluprecnik * PI;
        System.out.println("Povrsina kruga je " + p);
    }
    // U static metodama, ne možemo proslediti varijablu koja nije static, pa smo zato 
    // metodi dodelili parametre - double poluprecnik
    // Static metoda ne zahteva da imamo objekat, pa je možemo pozvati i samo uneti parametre

}
