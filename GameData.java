// package mp140;
class GameData extends Thread{
    volatile boolean Game = true;
    static int level=0;
    static int points=0;
    static final Object lock = new Object();
    static final Object InputLock = new Object();
    static final Object DisplayLock = new Object();


    static String[][]  currentDisplay={	{"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                        {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
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
