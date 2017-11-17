import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class maze{
	private final String top = "+---------/Back\\---------+\n";
	private final String filler = "|                        |\n";
	private final String bottom = "+----\\1/----------\\2/----+\n";

	private ArrayList<String> colors = new ArrayList<String>(Arrays.asList("red","orange","yellow","green","cyan","blue","indigo","violet","purple","magenta","pink", "brown","white","gray","black"));
	private int length;
	private int doors;
	private mazeNode currentNode;

	public maze(int lengthParam, int doorsParam){
		this.length = lengthParam;
		this.doors = doorsParam;
		this.currentNode = createMazeTree();
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

	public mazeNode getCurrentNode(){
		return this.currentNode;
	}

	public void setCurrentNode(mazeNode nodeParam){
		this.currentNode = nodeParam;
	}

	public mazeNode getChild(int i){
		List<mazeNode> children = this.getCurrentNode().getChildren();
		if(children.size()>0){
			mazeNode child = children.get(i);
			this.setCurrentNode(child);
			return child;
		}
		return this.getCurrentNode();
	}

	public mazeNode getParentNode(){
		mazeNode parent = this.getCurrentNode().getParent();
		if(parent != null){
			this.setCurrentNode(parent);
			return parent;
		}
		return this.getCurrentNode();
	}

	public void printNode(){
		System.out.println(this.getCurrentNode().toString());
	}

	public void printCurrentRoom(){
		StringBuilder room = new StringBuilder();
		String roomName = this.getCurrentNode().getName();
		room.append(top);
		room.append(filler);
		room.append("|");
		int spacesTotal = 23 - roomName.length();
		int spacesLeft = (spacesTotal/2)+1;
		int spacesRight = (spacesTotal/2)+(spacesTotal%2);
		for(int i = 0; i<spacesLeft; i++){
			room.append(" ");
		}
		room.append(roomName);
		for(int i = 0; i<spacesRight; i++){
			room.append(" ");
		}
		room.append("|\n");
		room.append(filler);
		room.append(bottom);
		System.out.println(room.toString());
	}

}
