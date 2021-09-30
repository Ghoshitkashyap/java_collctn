import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class student{
    int id;
    double marks,age;
    String name;
    student(int id,double marks,double age,String name){
        this.id=id;
        this.marks=marks;
        this.age=age;
        this.name=name;
    }
    public double getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public String toString() {
        return "student:" + id + "-" + marks + "-" + age + "-" + name + "\n";}
    }
    public class ques5{
        public static void main(String[] args) {
            student s1=new student(1,33,21,"jay");
            student s2=new student(4,36,24,"ajay");
            student s3=new student(2,66,27,"ray");
            student s4=new student(6,44,29,"raj");
            List<student>students=new ArrayList<student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        Collections.sort(students,Comparator.comparing(student::getMarks)
                .thenComparing(student::getName));
        System.out.println(students);
        System.out.println("highest mark is"+students.get(student.size()-1).marks);


}
}






























