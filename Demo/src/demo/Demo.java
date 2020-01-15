
package demo;
class Record {
    private int age;
    private double cgpa;
    private String name,id;
    
    public void setAge(int ag)
    {
        age=ag;
    }
    public void getAge()
    {
        return age;
    }
    public void setCGPA(double cg)
    {
        cgpa=cg;
    }
    public double getCGPA()
    {
        return cgpa;
    }
    public void setName(String nme)
    {
        name=nme;
    }
    public String getName()
    {
        return name;
    }
    public void setId(String iD)
    {
        id=iD;
    }
    public String getId()
    {
        return id;
    }
    
}
public class Demo {

    public static void main(String[] args) {
        Record student=new Record();
        student.setId("191-15-12499");
        student.setAge(20);
        student.setCGPA(3.45);
        student.setName("Apurba Roy");
        
        int Age=student.getAge();
        int CGPA=student.getCGPA();
        String Name=student.getName();
        String Id=student.getId();
        
        System.out.println("Name:"+Name);
        System.out.println("Id="+Id);
        System.out.println("Age:"+Age);
        System.out.println("CGPA="+CGPA);
    }
    
}
