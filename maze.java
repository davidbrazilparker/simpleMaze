import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class maze{
	private ArrayList<String> colors = new ArrayList<String>(Arrays.asList("red","orange","yellow","green","cyan","blue","indigo","violet","purple","magenta","pink", "brown","white","gray","black"));
	private int length;
	private int doors;
	private mazeNode start;

	public maze(int lengthParam, int doorsParam){
		this.length = lengthParam;
		this.doors = doorsParam;
		this.start = createMazeTree();
	}
	
	public mazeNode createMazeTree(){
		mazeNode current = null;
		mazeNode root = new mazeNode(this.getRandomUniqueColor(), null);
		current = root;
		while(colors.size() > 0){
			this.createChildren(current);
			current = this.getLeafNode(root);
		}
		return root;	
	}
	
	private void createChildren(mazeNode nodeParam){
		for(int i = 0; i<this.getDoors(); i++){
			mazeNode someChild = new mazeNode(this.getRandomUniqueColor(), nodeParam);
			nodeParam.addChild(someChild);
		}	
	}

	private mazeNode getLeafNode(mazeNode startPoint){
		mazeNode current = startPoint;
		while(current.hasChildren()){
			current = current.getChildren().get(getRandomNumber(2));	
		}
		return current;
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

	public int getDoors(){
		return this.doors;
	}


}
