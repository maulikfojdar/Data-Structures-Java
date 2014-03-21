package trees;

public class Node {
	
	public int iData;
	public double dData;
	public Node leftChild;
	public Node rightChild;
	
	public Node(int id, double dd){
		iData = id;
		dData = dd;
	}
	
	public void displayNode(){
		System.out.print(iData);
	}

}
