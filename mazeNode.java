import java.util.*;
public class mazeNode{
	
	private mazeNode parent;
	private List<mazeNode> children = new ArrayList<mazeNode>();
	
	public mazeNode(mazeNode parentParam){
		this.parent = parentParam;
	}

	public List<mazeNode> getChildren(){
		return this.children;
	}

	public void addChild(){
		this.children.add(new mazeNode(this));
	}
}
