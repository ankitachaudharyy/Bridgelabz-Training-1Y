import java.util.*;

class Student implements Comparable<Student>{
    String name; int marks;
    Student(String n,int m){name=n;marks=m;}
    public int compareTo(Student o){return o.marks-this.marks;}
}

public class CollegeAdmission{
    public static void main(String[] args){
        List<Student> applicants=new ArrayList<>();
        applicants.add(new Student("Aman",90));
        applicants.add(new Student("Riya",85));

        TreeSet<Student> merit=new TreeSet<>(applicants);
        for(Student s:merit) System.out.println(s.name);
    }
}