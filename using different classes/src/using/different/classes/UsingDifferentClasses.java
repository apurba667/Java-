
package using.different.classes;
class Calculator{
    public int a;
    public int b;
    
    public int addition(){
        return a+b;
    }
    public int subtraction(){
        return a-b;
    }
    public double divion(){
        return (double)a/(double)b;
    }
    public int multiplication(){
        return a*b;
    }
}

public class UsingDifferentClasses {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.a=12;
        c1.b=4;
        System.out.println(c1.addition());
        System.out.println(c1.subtraction());
        System.out.println(c1.divion());
        System.out.println(c1.multiplication());
        
    }
    
}
