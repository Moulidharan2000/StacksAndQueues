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
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int peak() {
		
		if(isEmpty()) {
			
			return top.data;
		}
		else {
			System.out.println("Stack is Empty\n");
		}
		return -1;	
	}
	
	public void pop() {
		
		while(top != null) {
			System.out.println("Peak : "+peak()+"\n");
			top = top.next;
			System.out.println("One Item Removed from Stack...\n");
		}
		System.out.println("Now Stack is Empty...\n");
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
		stackoperation.pop();
		stackoperation.printStack();
	}

}
