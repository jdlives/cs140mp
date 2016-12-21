import java.util.Scanner;
import java.io.Console;
public class InputThread extends GameData{
    Scanner in = new Scanner(System.in);
    int count = 1;
    Console console = System.console();
    String input;
    @Override
    public void run(){
        getInput();
    }
    public void printArray(String input[][]){
        System.out.print("\033[H\033[2J");
    	System.out.flush();
        System.out.println("=====================================================================================");
		for(int row = 0; row < input.length ; row++){
			for(int column = 0; column < input[row].length ; column++){
				System.out.print(input[row][column] + "   ");
			}
			System.out.println();
		}
        System.out.println("=====================================================================================");
	}
    public void getInput(){



        while(true){

            input = in.nextLine();
            synchronized(lock){
                for(int l=currentDisplay.length-1; l>=0;l--){
                    for(int w =currentDisplay[l].length-1;w>=0;w--){
                        if(input.equals(currentDisplay[l][w])){
                            currentDisplay[l][w]="      ";
                        }
                    }
                }
            printArray(currentDisplay);

            }

        }





    }

}
