// package mp140;
class GameData extends Thread{
    int wpm;
    final Object lock = new Object();
    static String[][]  currentDisplay={	{"      ","  e    ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","  j    "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","   t   ","      "},
                                    {"      ","      ","      ","   d   ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","    t  ","      ","      ","      "},
                                    {"      ","      ","    d  ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","     g ","      "},
                                    {"      ","      ","      ","      ","      ","   w   ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "}
                                };
    final String[] systemWords =         {"hello"
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

    public String[][] returncD(){
        synchronized (lock) {
            return currentDisplay;
        }
    }
    public void modcD(String [][] temp){
        synchronized (lock) {
            currentDisplay=temp;
        }
    }
}
