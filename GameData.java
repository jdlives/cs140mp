// package mp140;
class GameData extends Thread{
    int wpm;
    String[][]  currentDisplay={	{"      ","  e    ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","  e    ","      ","      ","      ","q      ","      ","      ","      "},
                                    {"      ","      ","   q   ","      ","      ","      ","      ","      ","  w    ","      "},
                                    {"      "," e     ","      ","      ","      ","      ","      ","      ","    e  ","      "},
                                    {"      ","    e  ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","   f   ","      ","      ","      ","      ","      ","      "},
                                    {"      "," f     ","      ","      ","      ","  f    ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","      ","   f   ","      ","    f  ","      ","      "},
                                    {"      ","      ","   f   ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","    f  ","      ","      ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","    f  ","    f  ","      ","      ","      ","      ","      ","      "},
                                    {"      ","      ","      ","      ","     f ","   f   ","      ","      ","      ","      "},
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

    public String[] returnSW(){
        return this.systemWords;
    }
}
