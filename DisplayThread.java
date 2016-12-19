// package mp140;
public class DisplayThread extends GameData{
    public static void main (String[] args){
    	DisplayThread test = new DisplayThread();
    	test.start();
	}
    public void run(){
        printSet();
    }
    public void printArray(String input[][]){
		for(int row = 0; row < input.length ; row++){
			for(int column = 0; column < input[row].length ; column++){
				System.out.print(input[row][column] + "   ");
			}
			System.out.println();
		}
	}
    public void printSet(){
		String temp[][]={	{"      ","      ","      ","      ","      "},
					{"      ","      ","      ","      ","      "},
					{"      ","      ","      ","      ","      "},
					{"      ","      ","      ","      ","      "},
					{"      ","      ","      ","      ","      "}
				};
		//place words in proper position
		for (int i=0; i<currentDisplay.length; i++){
			temp[currentPosition[0][i]][currentPosition[1][i]] = currentDisplay[i];

		}
		System.out.print("\033[H\033[2J");  //clear system first
		System.out.flush();
		printArray(temp);
	}

}
// class GameData extends Thread{
//     static String[] currentDisplay = {"yo","one","two","three","22"};
//     static int[][] currentPosition = {{0,1,2,2,4}, /*y-coordinate*/
//                                          {0,1,2,3,4,}}; /*x-coordinate*/
//     protected final String[] systemWords = {"hello"
//                                           ,"hey"
//                                           ,"noscrub"
//                                           ,"ivy"
//                                           ,"daniel"
//                                           ,"laborada"
//                                           ,"jenn"
//                                           ,"codia"
//                                           ,"trish"
//                                           ,"evangelista"
//                                           ,"buy"
//                                           ,"my"
//                                           ,"ps4"
//                                           ,"maam"
//                                           ,"ivy"
//                                           ,"motherfather"
//                                           ,"merry"
//                                           ,"christmas"
//                                           ,"deadline"};
// }
