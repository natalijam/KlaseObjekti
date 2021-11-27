
package main.klaseobjekti;


public class Pravougaonik {

// Atributi
    
    public int stranicaA;
    public int stranicaB;

// Konstruktori
    
    public Pravougaonik(int a, int b){
        this.stranicaA = a;
        this.stranicaB = b;
    }
    
// Metode

    // bez povratne vrednosti - void    
    public void stampajObim(){
        int obim = 2 * stranicaA + 2 * stranicaB;
        
        System.out.println("Obim pravougaonika je " + obim);
        
    // metodu možemo koristiti unutar druge metode
    // varijanta 2
    // int obim = izracunajObim();
    }
    
    public void stampajPovrsinu(){
        int povrsina = stranicaA * stranicaB;
        
        System.out.println("Povrsina pravougaonika je " + povrsina);
    }
    
    // sa povratnom vrednošću
    public int izracunajObim(){
        int obim = 2 * stranicaA + 2 * stranicaB;
        
    //kada u metodi želimo da vratimo vrednost, koristimo reč RETURN    
        return obim;
    }
    
    public int izracunajPovrsinu(){
        int povrsina = stranicaA * stranicaB;
        
        return povrsina;
    }
    
    
}
