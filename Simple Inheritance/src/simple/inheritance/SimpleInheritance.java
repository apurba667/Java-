
package simple.inheritance;
class person{
    public String name;
    public int age;
    
    public void print(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}

class student extends person{
    public String studentID;
    public double cgpa;
    
    public void printAll(){
        print();
        System.out.println("Student ID :"+studentID);
        System.out.println("Cgpa :"+cgpa);
    }
}


public class SimpleInheritance {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Apurba";
        s1.age = 20;
        s1.studentID = "191-15-12499";
        s1.cgpa = 3.45;
        
        s1.printAll();
    }
    
}
