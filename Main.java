import java.util.Scanner;

public class Main extends GameData{
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
             (new Main()).start(); //to call and start new thread InputThread
             (new InputThread()).start(); //to call and start new thread InputThread
             (new DisplayThread()).start(); //to call and start new thread DisplayThread
             




    }
    public void run(){
        synchronized (InputLock){
            synchronized(DisplayLock){
                System.out.println("How good are you? [1-5]");
                System.out.print("Answer");
                level=in.nextInt();
            }
        }



    }


}
