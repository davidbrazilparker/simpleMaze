import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class mainmethod{
	public static void main(String args[]){
		maze foo = new maze(2, 2);
		foo.printCurrentRoom();
		Scanner input = new Scanner(System.in);
		gameTimer timerObject = new gameTimer();
		while(!foo.checkMove(input.nextLine())){
			continue;
		}
		String timeString = timerObject.completionTime();
		System.out.println("~~~Winner!~~~");
		System.out.println("Maze completed in: " + timeString);
	}
}
