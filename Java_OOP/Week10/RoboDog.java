public class RoboDog implements Dog,Robot{
    boolean onoff, cal;
    private String name;

    public RoboDog(String n,boolean oo,boolean ca){
        name = n;
        onoff = oo;
        cal = ca;
      System.out.println("RoboDog's name is" + name);
    }

    public void bark(){
    System.out.println("RoboDog can Bark");
    }

    public void run(){
        System.out.println("RoboDog can Run");
    }
    
    public void calculator(){
        if(cal==true)
        System.out.println("RoboDog can Calculate");
        else
        System.out.println("RoboDog can not Calculate");
    }

    public void statusOnOff(){
        if(onoff==true)
        System.out.println("RoboDog is Available");
        else
        System.out.println("RoboDog is Unavailable");
    }
}
