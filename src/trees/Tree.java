package trees;

public class Tree {
	
	private Node root;
	
	public Tree(){
		root = null;
	}
	
	public Node find(int key){
		
		Node current = root;
		
		while(current.iData != key){
			
			if(key < current.iData){
				current = current.leftChild;
			}
			else if(key > current.iData){
				current = current.rightChild;
			}
			return current;
			
		}
	}

}
