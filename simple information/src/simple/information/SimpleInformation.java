
package simple.information;
class person {
    public String name;
    public int age;
    public int BirthYear;
}
public class SimpleInformation {

    public static void main(String[] args) {
        person p1 = new person();
        p1.name = "Apurba";
        p1.age = 20;
        p1.BirthYear = 2000;
        System.out.println("The Age of " + p1.name +"is " + p1.age+" Birth year "+p1.BirthYear);
    }
    
}
