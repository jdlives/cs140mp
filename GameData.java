public class GameData {
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
public class showGame extends Game implements Thread {
      public static String[] screenWords;

      public void run(){

            GameData data = new GameData();
            int index = 0;
            string[] wordRepo = data.systemWords;
            while (wordRepo[index] != NULL){
                  screenWords[index] = wordRepo[index];
                  println("\n\n%c\n\n",screenWords[index]);
                  index+=1;
            }
      }

      public static void main(String args[]) throws InterruptedException {
            (new showGame()).start();
            Thread.sleep(1000);

      }
}