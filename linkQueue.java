class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class linkQueue{
	Node front = null;
	Node rear = null;
	
	boolean isEmpty(){
		return(rear == null);
	}
	
	void enQueue(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			front = rear = newNode;
		}
		else{
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	
	void display(){
		Node temp = front;
		if (temp == null){
			System.out.println("Queue is empty");
		}
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	
	public static void main(String arg[]){
		linkQueue a = new linkQueue();
		a.enQueue(10);
		a.enQueue(5);
		a.enQueue(1);
		a.display();
	}
}