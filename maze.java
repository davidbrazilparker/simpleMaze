import java.util.concurrent.ThreadLocalRandom;

public class maze{
	int randomNum = ThreadLocalRandom.current().nextInt(min, max+1);	
	private final String[] colors = {"red","orange","yellow","green","cyan","blue","indigo","violet","purple","magenta","pink", "brown","white","gray","black"};
	private int length;
	private int doors;

	public maze(int lengthParam, int doorsParam){
		this.length = lengthParam;
		this.doors = doorsParam;
	}
	
	public void createMazeTree(){
		mazeNode current = null;
		mazeNode root = new mazeNode(null, this.getRandomUniqueColor());
		current = root;
		
	}
	
	public String getRandomUniqueColor(){
		int index = this.getRandomNumber(colors.size());
		String value = colors.get(index);
		colors.remove(index);
		colors.trimToSize();
		return value;
	}

	public int getRandomNumber(int max){
		return ThreadLocalRandom.current().nextInt(0, max);
	}


}
