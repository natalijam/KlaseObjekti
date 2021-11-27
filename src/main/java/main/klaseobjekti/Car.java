
package main.klaseobjekti;


public class Car {
    public String brand;
    public String model;
    
    // kreiramo konstruktor
    // konstruktor vid metode, nema povratnu vrednost
    // zato što kreira objekat i kao povratnu vrednost vraća taj objekat
    
    public Car(){
    
    }
    
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    //overloading - dva konstruktora različiti parametri
    //ako dodajemo novi konstruktor, defaultni se briše, pa mora ručno da se napiše
}
