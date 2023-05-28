
package remote;
import java.util.Scanner;

public class Remote {
    
    protected int Volume;
    protected int Channel;
    final protected int MAXIMUM_VOLUME = 20;
    final protected int MAXIMUM_CHANNEL = 199;
    final protected int DEFAULT_VOLUME =2;
    final protected int DEFAULT_CHANNEL =5;
    final protected int MINIMUM_VOLUME = 0;
    final protected int MINIMUM_CHANNE = 1;
    
    public Remote(){
    Volume = DEFAULT_VOLUME;
    Channel = DEFAULT_CHANNEL;
    }
    
    public Remote(int ch , int vol){
        Volume = ch;
        Channel = ch;
    }
   public void VolumeUp(){
       if(Volume < MAXIMUM_VOLUME)
           Volume++;
    }
   public void VolumeDown(){
   if(Volume > MINIMUM_VOLUME)
       Volume -- ;
   }
  public void ChannelUp(){
      if(Channel < MAXIMUM_VOLUME)
          Channel++;
      
  }
  
  public void ChannelDown (){
   if (Channel > MINIMUM_CHANNE) 
       Channel--;
  }
  public void display(){
      
      System.out.println("\n---------------------------------------");
      System.out.println("Channel:  " + Channel);
       System.out.println("Volume:  " + Volume);
      System.out.println("---------------------------------------");
      
      
  }
  public void menu(){
  Scanner input = new Scanner(System.in);
  String Choice;
  System.out.println (" POWER ON");
  display();
   do{
       System.out.println("Channel up : +");
       System.out.println("Channel down : -");
       System.out.println("Volume up : ++");
       System.out.println("Volume donw : --");
       System.out.println("Power off : 0");  
       System.out.print("Chaoice :   ");
       Choice = input.next();
       if(Choice.equals("+"))ChannelUp();
       else if (Choice.equals("-")) ChannelDown();
       else if (Choice.equals("++")) VolumeUp();
       else if (Choice.equals("--")) VolumeDown();
       display();
   }while(!Choice.equals("0"));
   System.out.println("Power Off");
  }
    public static void main(String[] args) {
       
        
        Remote remot = new Remote();
        
        remot.menu();
    }
}

