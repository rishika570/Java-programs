import java.util.Scanner;
public class Student {
    String stu;

Student(String stu){
    this.stu=stu;
}
Student(){
    stu="Unknown";
}
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student obj=new Student();
        Student obj1=new Student(sc.nextLine());
        System.out.println(obj1.stu);
        System.out.println(obj.stu);
    }
}
