
package methodoverloading;
class Car{
    private String model;
    private double fuelCapacity;
    private String numberplate;
    private int horsepower;
    
    public void SetValues(String m, double f, String np, int hp){
        model=m;
        fuelCapacity=f;
        numberplate=np;
        horsepower=hp;
   }
    
    public void PriintInfo(){
        System.out.println("Model : " + model);
        System.out.println("Fuel Capacity : " + fuelCapacity);
        System.out.println("Horse Power : "+horsepower);
        System.out.println("Number plate No : "+numberplate);
        System.out.println("\n");
        
    }
}
public class Methodoverloading {

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.SetValues("Toyota", 140, "Dhaka - 1000" , 120);
        toyota.PriintInfo();
        
        Car tesla = new Car();
        tesla.SetValues("Tesla", 150, "Dhaka - 1240", 136);
        tesla.PriintInfo();
    }
    
}
