class queue{
	String [] qArray;
	int front;
	int rear;
	int size;
	
	queue(){
		qArray = new String[5];
		front = 0;
		rear = -1;
		size = 5;
	}
	
	boolean isEmpty(){
		return(rear == -1);
	}
	
	boolean isFull(){
		return (rear == size-1);
	}
	
	void enQueue(String data){
		if (isFull()){
			System.out.println("queue is overflow");
		}
		else{
			qArray[++rear] = data;
		}
	}
	
	void deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else{
			System.out.println(qArray[front]);
			for(int i=0; i<rear; i++){
				qArray[i] = qArray[i+1];
			}
			qArray[rear--] =" ";
		}
	}
	
	void printQueue(){
		for(int i=0; i<=rear; i++){
			System.out.println(qArray[i]);
		}
		System.out.println(" ");
	}
}

class testQueue{
	public static void main(String arg[]){
		queue a = new queue();
		a.enQueue("e1");
		a.enQueue("e2");
		a.enQueue("e3");
		a.printQueue();
		a.enQueue("e4");
		a.enQueue("e5");
		a.printQueue();
		a.enQueue("e6");
		a.deQueue();
		a.deQueue();
		a.deQueue();
		a.printQueue();
		a.printQueue();
	}
}