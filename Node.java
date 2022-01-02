public class Node{
	private String dato;
	private Node left;
	private Node right;

	public Node(String dato){
		this.dato = dato;	
		this.left = null;
		this.left = null;
	}

	public String getDato(){
		return dato;
	}

	public void setDato(String dato){
		this.dato = dato;
	}

	public void setLeft(Node left){
		this.left = left;
	}

	public void setRight(Node right){
		this.right = right;
	}

	public Node getLeft(){
		return left;
	}
	public Node getRight(){
		return right;
	}
}