import java.util.Scanner;
class W2_ass5
{ 
  static Scanner console = new Scanner(System.in);
   public static void main(String[] args)
    { 
        String name;
        double weight,height;
        double BMI;
        
        System.out.println("Enter Your name");
        name = console.next();
        
        System.out.println("Enter Your Weight");
        weight = console.nextDouble();
        
        System.out.println("Enter Your Height");
        height = console.nextDouble();
        
        BMI= weight/(height*height);

          if(BMI<18.5)
           System.out.println("Your BMI is"  + " normal");
          else if(BMI >=18.5&&BMI <=22.9)
           System.out.println("Your BMI is" + " Problem");
          else if(BMI >=23.0&&BMI <=24.9)
           System.out.println("Your BMI is" +  " Going to fat");
          else if(BMI >=25.0&&BMI <=29.9)
           System.out.println("Your BMI is" +  " Near fat");
          else
           System.out.println("Your BMI is"  + " Fat");
        
    }
}
      