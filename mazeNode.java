import java.util.*;
public class mazeNode{
	
	private String name;
	private mazeNode parent;
	private List<mazeNode> children = new ArrayList<mazeNode>();
	
	public mazeNode(String nameParam, mazeNode parentParam){
		this.parent = parentParam;
		this.name = nameParam;
	}

	public List<mazeNode> getChildren(){
		return this.children;
	}
	
	public void addChild(){
		this.children.add(new mazeNode(this));
	}

	public String getName(){
		return this.name;
	}

	public void setName(String nameParam){
		this.name = nameParam;
	}

	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append("Parent mazeNode name: " + this.parent.getName()+ "\n");
		result.append("Current mazeNode name: " + this.name);
		for(int i = 0; i<this.children.size(); i++){
			result.append("\n" + "Child " + i + "'s name: "  +  this.children.get(i));
		}
	}
}
