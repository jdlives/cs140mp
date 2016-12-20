// package mp140;
public class DisplayThread extends GameData{
    public static void main(String[] args) {
        (new DisplayThread()).start(); //to call and start new thread DisplayThread
    }
    public void run(){
        while(shiftDown()){
            printArray(currentDisplay);
        }


    }
    public void printArray(String input[][]){
        System.out.println("=====================================================================================");
		for(int row = 0; row < input.length ; row++){
			for(int column = 0; column < input[row].length ; column++){
				System.out.print(input[row][column] + "   ");
			}
			System.out.println();
		}
        System.out.println("=====================================================================================");
	}
    public boolean shiftDown(){
        // check if last row is empty
        for(int column=0;column<currentDisplay[currentDisplay.length-1].length;column++){
            if(currentDisplay[currentDisplay.length-1][column]!="      "){
                System.out.println("FALSE");
                return false;
            }
        }
        // move the above row to the one below it, start from the second the last row pataas
        System.out.print(currentDisplay.length);
        for (int height=currentDisplay.length-2; height>-1;height-- ) {
            currentDisplay[height+1]=currentDisplay[height];
        }
        String[]temp={"      ","      ","      ","      ","      ","      ","      ","      ","      ","      "};
        currentDisplay[0]=temp;
        // clear system
    	System.out.print("\033[H\033[2J");
    	System.out.flush();
    	printArray(currentDisplay);
        try {
            Thread.sleep(3000);//1000 milliseconds is one second.
        }catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return true;
	}

}
