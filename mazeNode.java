import java.util.*;
public class mazeNode{
	
	private String name;
	private mazeNode parent;
	private List<mazeNode> children;
	
	public mazeNode(String nameParam, mazeNode parentParam){
		this.name = nameParam;
		this.parent = parentParam;
		this.children = new ArrayList<mazeNode>();
	}

	public List<mazeNode> getChildren(){
		return this.children;
	}
	
	public boolean hasChildren(){
		return (this.getChildren().size() > 0) ? true : false;
	}

	public void addChild(mazeNode childParam){
		this.getChildren().add(childParam);
	}

	public String getName(){
		return this.name;
	}

	public void setName(String nameParam){
		this.name = nameParam;
	}
	
	public mazeNode getParent(){
		return this.parent;
	}

	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append("\nCurrent mazeNode name: " + this.getName());
		for(int i = 0; i<this.children.size(); i++){
			result.append("\n" + "Child " + i + "'s name: "  +  this.children.get(i).getName());
		}
		return result.toString();
	}
}
