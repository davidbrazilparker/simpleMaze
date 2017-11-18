import java.util.Scanner;

public class mainmethod{
	public static void main(String args[]){
		maze foo = new maze(2, 2);
		foo.printCurrentRoom();
		Scanner input = new Scanner(System.in);
		while(!foo.checkMove(input.nextLine())){
			continue;
		}
		System.out.println("~~~Winner!~~~");
	}
}
