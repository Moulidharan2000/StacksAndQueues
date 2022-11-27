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
	
	public int dequeue() {
		int data = front.data;
		front = front.next;
		if(Empty()) {
			back = null;
		}
		size--;
		System.out.println(data+" Removed from the Queue");
		return data;
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
		queue.dequeue();
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(70);
		queue.dequeue();
		
		System.out.println("\nQueue is Empty");
		
	}

}
