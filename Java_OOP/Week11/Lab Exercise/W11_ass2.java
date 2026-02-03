public class W11_ass2 {

    public static void main(String[] args){
    String[] name = new String[3];
    name[0] = "Ant";
    name[1] = "Bird";
    name[2] = "Cat";

     for(String s: name){          //เอาArrayในObject Name: name เอามาเก็บไว้ใน s ด้วย 
        System.out.println(s);
     }
     /* คล้ายคำสั่งนี้ 
      String output= "";
        for(i=0;i<name.length;i++){
          output += name[i];
        }
          System.out.println(output);
      */
    }
}
