// package mp140;
import java.util.*;

public class DisplayThread extends GameData{
    public void run(){
        synchronized(DisplayLock){
            while(shiftDown()){}
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
    public boolean shiftDown(){
        // check if last row is empty
        synchronized (lock) {
        for(int column=0;column<currentDisplay[currentDisplay.length-1].length;column++){
            if(currentDisplay[currentDisplay.length-1][column]!="      "){
                System.out.println("GAME OVER - you suck");
                this.Game=false;
                return false;
            }
        }
        // move the above row to the one below it, start from the second the last row pataas
        System.out.print(currentDisplay.length);
        for (int height=currentDisplay.length-2; height>-1;height-- ) {
            currentDisplay[height+1]=currentDisplay[height];
        }
        String[]temp=generatedLine();
        currentDisplay[0]=temp;
        // clear system

        printArray(currentDisplay);
        }
        try {
            Thread.sleep(1000);//1000 milliseconds is one second.
        }catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return true;
	}

  public String[] generatedLine(){
    List wordsList = Arrays.asList(systemWords); //convert string array to list for use in Collections.shuffle
    List <Integer> indexDisplay = new ArrayList <Integer> ();
    String[] stringDisplay = new String[10];  //declare a string with wordsDisplay list's size
    int index;

    Collections.shuffle(wordsList); //to randomize words without repeating

    for (int k=0; k<10; k++){
      indexDisplay.add(k);
    }

    Collections.shuffle(indexDisplay); //to randomize words without repeating

    for (int j=0; j<level; j++){
      index = indexDisplay.get(j);
      stringDisplay[index] = wordsList.get(j).toString();  //convert list elements to string to enable copying
    }

    for (int i=0; i<10; i++){
      if (stringDisplay[i] == null){
        stringDisplay[i] = "      ";
      }
    }

    return stringDisplay;

  }

  }
