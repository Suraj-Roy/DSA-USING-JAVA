import java.util.*;
public class CircularQueue {
	int size;
	int front,rear;
	int[] arr;

	CircularQueue(int size){
		this.size=size;
		front=-1;
		rear=-1;
		arr = new int[size];
	}


	boolean IsEmpty(){

		if(front==-1 && rear==-1){
			return true;
		}

		return false;

	}

	boolean IsFull(){

		if(front==0 && rear==size-1){
			return true;
		}
		if(front==rear+1){
			return true;
		}
		return false;

	}


	void enqueue(int element){

		if(IsFull()){
			System.out.println("Queue is full.");
		}
		else{

			if(front==-1){
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=element;
		}

	}

	void dequeue(){

		if(IsEmpty()){
			System.out.println("Queue is empty.");
		}
		else{

			System.out.println(arr[front]+" element is dequeued");
			if(front==rear){
				front=-1;
				rear=-1;
			}
			else{
				front=(front+1)%size;
			}
		}


	}


	void display(){

		if(IsEmpty()){
			System.out.println("Queue is empty.");
		}
		else{

			System.out.println("elements are");

			for (int i=front;i!=rear;i=(i+1)%size ) {
				
				System.out.print(arr[i]+"-->");
			}
			System.out.print(arr[rear]);
			System.out.println();

		}
		
	}




	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("enter size of queue");
		int size = sc.nextInt();
		int x,y;

		CircularQueue obj = new CircularQueue(size);

		while(true){
			System.out.println("Enter choice:");
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.display");
			System.out.println("4.exit\n");

			x=sc.nextInt();

			switch (x) {

			case 1:
				System.out.println("please enter element.");
				y=sc.nextInt();
				obj.enqueue(y);
				break;

			case 2:
				obj.dequeue();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				System.out.println("Exiting the program.");
				System.exit(1);

			default:
				System.out.println("Please enter valid choice.");
			}

		}


	}

	
}