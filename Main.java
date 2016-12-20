public class Main extends GameData{
    public static void main(String[] args) throws InterruptedException {
         (new InputThread()).start(); //to call and start new thread InputThread
         (new DisplayThread()).start(); //to call and start new thread DisplayThread


    }


}
