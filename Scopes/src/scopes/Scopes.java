
package scopes;

class person{
    public String name = "Apurba Roy";
    public int age = 21;
}

class Student extends person{
    public String studentID ="191-15-12499";
    public double cgpa = 3.55;
    public String name = "Apurba Roy";
    
    public void print(){
        System.out.println(super.name);
        System.out.println(this.age);
        System.out.println(this.cgpa);
        System.out.println(this.studentID);
    }
}
public class Scopes {
    public static void main(String[] args) {
      Student s1= new Student();
      s1.print();
    }
    
}
