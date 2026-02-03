import java.util.Scanner;
class W2_ass4
{ 
  static Scanner console = new Scanner(System.in);
   public static void main(String[] args)
    { 
        String name;
        int age;
        
        System.out.println("Enter Your name");
        name = console.next();
        
        System.out.println("Enter Your age");
        age = console.nextInt();
          if(age<15)
           System.out.println("Hi!" + "baby" + name);
          else
           System.out.println("Hi!" + "teenage" + name);
        
    }
}
      