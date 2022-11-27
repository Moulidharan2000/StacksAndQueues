package StackandQueue;

public class Queue {

	private Node front, back;
	private int size;
	
	private class Node {
		int data;
		Node next;
	}
	
	public Queue() {
		front = null;
		back = null;
		size = 0;
	}
	
	public boolean Empty() {
		return (size == 0);
	}
	
	public void enqueue(int data) {
		Node oldRear = back;
		back = new Node();
		back.data = data;
		back.next = null;
		
		if(Empty()) {
			front = back;
		}
		else {
			oldRear.next = back;
		}
		size++;
		System.out.println(data + " is Added to the Queue \n");
	}
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		
	}

}
