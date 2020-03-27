/**
 * basic
 */
import java.util.Scanner;


class one
{
     String name;
     String id;
     String adress;
     int age;
}
 class two extends one{
     Scanner obj = new Scanner(System.in);
    
   two()
   {
       name = "Student : ";
       id="FA19-bsse-";
       adress="House : ";
       age = 0;
   }
    String name2=obj.next();
    String id2=obj.next();
    String adress2=obj.next();
    int age2=obj.nextInt();
    
   public void show()
   {
    System.out.println(name+" "+name2);
    System.out.println(id+""+id2);
    System.out.println(adress+" "+adress2);
    System.out.println(age2+age);
   }

};

 public class basic {
    public static void main(String[] args) {
        two obj = new two();
        obj.show();
    }
}