import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class employe {
     int id;
     double salary, age;
     String name;
     employe(int id, double sal, double age, String name) {
         this.id = id;
         this.salary = salary;
         this.age = age;
         this.name = name;
     }
     public double getSalary() {
         return salary;}
     public String toString() {
         return "employe : " + id + " -" +salary + "-" + age + "-" + name + "\n";
     }
 }
 class sortbysal implements Comparator<employe>
 {
     @Override
     public int compare(employe emp1,employe emp2){
         return(int)(emp1.salary - emp2.salary);
     }
 }
 public class ques4{
     public static void main(String[] args) {
         employe e2=new employe(1,555.3,23.6,"yash");
         employe e1=new employe(2,366.53,33.4,"ash");
         employe e4=new employe(3,323.8,43.2,"jay");
         employe e3=new employe(4,329.5,45.8,"raj");
         List<employe> emp=new ArrayList();
         emp.add(e1);
         emp.add(e2);
         emp.add(e3);
         emp.add(e4);
         Collections.sort(emp, Comparator.comparing(employe::getSalary));
         System.out.println(emp);
         System.out.println("highest salary is"+emp.get(emp.size()-1).salary);
     }
}





















