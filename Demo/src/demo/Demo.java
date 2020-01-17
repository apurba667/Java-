
package demo;
class Record {
    private int age;
    private double cgpa;
    private String name,id;
    private String department;
    private String campus;

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getCampus() {
        return campus;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    
    
}
public class Demo {

    public static void main(String[] args) {
       Record student = new Record();
       student.setAge(20);
       student.setCampus("Main");
       student.setCgpa(3.5);
       student.setDepartment("CSE");
       student.setId("191-15-12499");
       student.setName("Apurba Kumar Roy");
       
       int studentAge=student.getAge();
       String studentCampus=student.getCampus();
       double studentCgpa=student.getCgpa();
       String studentDepartment=student.getDepartment();
       String studentId=student.getId();
       String studentName=student.getName();
       
        System.out.println("Name="+studentName);
        System.out.println("Id="+studentId);
        System.out.println("Age="+studentAge);
        System.out.println("Cgpa="+studentCgpa);
        System.out.println("Campus="+studentCampus);
        System.out.println("Department="+studentDepartment);
       
    }
    
}
