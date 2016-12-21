import java.util.Scanner;
import java.io.Console;
public class InputThread extends GameData{
    Scanner in = new Scanner(System.in);
    int count = 1;
    Console console = System.console();
    String input;
    @Override
    public void run(){
        synchronized(InputLock){
            while(getInput()){

            }
            System.out.print("end input2");
        }
    }
    public void printArray(String input[][]){
        System.out.print("\033[H\033[2J");
    	System.out.flush();
        System.out.print("Difficulty Level[1-5]: " );
        System.out.print(level);
        System.out.println();
        System.out.print("POINTS --> " );
        System.out.print(points);
        System.out.println();
        System.out.println("============================================================================================");
		for(int row = 0; row < input.length ; row++){
			for(int column = 0; column < input[row].length ; column++){
				System.out.print(input[row][column] + "   ");
			}
			System.out.println();
		}
        System.out.println("============================================================================================");
	}
    public boolean getInput(){

        // nacheck ko na ung currentDisplay static naman siya so naeedit talaga natry ko na
        // problema lang di niya tinatanggal di ko alam bakit kasi try mo mag write kay currentDisplay gumagana naman

                  char userInput[] = console.readPassword(""); //FOR MASKING user input in terminal
                  String input = new String(userInput); //FOR MASKING
                    currentDisplay[0][0]=input;
                    synchronized(lock){
                        for(int l=currentDisplay.length-1; l>=0;l--){
                            for(int w =currentDisplay[l].length-1;w>=0;w--){
                                if(input.equals(currentDisplay[l][w])){
                                    currentDisplay[l][w]="      ";
                                    points=points+1;
                                }
                            }
                        }
                    printArray(currentDisplay);

                    }
            return Game;






    }

}
