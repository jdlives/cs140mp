public class InputThread extends GameData{
    public void run() {
        final Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            final String line = in.nextLine();
            System.out.println("Input line: " + line);
            if ("end".equalsIgnoreCase(line)) {
                System.out.println("Ending one thread");
                break;
            }
        }
    }
}
