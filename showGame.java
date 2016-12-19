import java.util.*;

class GameData extends Thread{
    public static String[] wordDisplay = {"","","","","22"};
    public static String[] systemWords = {"hello"
                                          ,"hey"
                                          ,"noscrub"
                                          ,"ivy"
                                          ,"daniel"
                                          ,"laborada"
                                          ,"jenn"
                                          ,"codia"
                                          ,"trish"
                                          ,"evangelista"
                                          ,"buy"
                                          ,"my"
                                          ,"ps4"
                                          ,"maam"
                                          ,"ivy"
                                          ,"motherfather"
                                          ,"merry"
                                          ,"christmas"
                                          ,"deadline"};


}
public class showGame extends GameData {
      

      public void run(){

            ArrayList <String> screenWords = new ArrayList <String>();

            GameData data = new GameData();
            int index = 0;
            int indexRemove = 0;
            String[] wordRepo = data.systemWords;
            while (wordRepo[index] != null){
                  int bounds = screenWords.size();
                  screenWords.add(wordRepo[index]);
                  System.out.print("\n"+screenWords+"\n\n");
                  
                  if (bounds>3){
                        screenWords.remove(wordRepo[indexRemove]);
                        indexRemove++;
                  }
                  index+=1;
            }
      }

      public static void main(String args[]) throws InterruptedException {
            (new showGame()).start();

      }
}