import java.util.*;

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
                  String wordRepo2 = screenWords.toString().replace("[","").replace("]","").replace(","," ");
                  System.out.print("\n"+wordRepo2+"\n\n");

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
