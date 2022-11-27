package StackadnQueue;

public class Stacks {

	Node top;
	Node next;
	
	public class Node {
		int data;
		Node next;
	}
	
	public void Node() {
		this.top = null;
	}
	
	public void push(int num) {
		Node node = new Node();
		node.data = num;
		node.next = top;
		top = node;
	}
	
	public void printStack() {
		Node node = top;
		
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		
		Stacks stackoperation = new Stacks();
		stackoperation.push(70);
		stackoperation.push(30);
		stackoperation.push(56);
		stackoperation.printStack();
	}

}
