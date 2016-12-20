public class InputThread extends GameData{
    Scanner in = new Scanner(System.in);
    int count = 1;
    Console console = System.console();
    @Override
    public void run(){
    while(true){
        char userInput[] = console.readPassword(""); //mask user input in terminal
        // userInput = in.nextLine();
        // System.out.println("Hey: " + userInput);
        System.out.print(String.format("\033[%dA",count)); // Move up
        System.out.print("\033[2K"); // Erase line content
    }
    }
}
