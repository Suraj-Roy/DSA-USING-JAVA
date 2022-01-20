import java.util.*;
public class LinkedList{


	class Node{

		int val;
		Node next;

		Node(){

		}

		Node(int data){
			val=data;
			next=null;
		}
	}

	Node head;


	void InsertAtBegning(int data){

		Node new_node = new Node(data);

		new_node.next=head;
		head=new_node;
	}


	void InsertAtEnd(int data){
		Node cur=head;

		while(cur.next!=null){
			cur=cur.next;
		}
       
        Node new_node = new Node(data);

        cur.next=new_node;

	}


	void delete(int element){

		Node cur=head,prev=null;
		int found=0;

		while (cur!=null){

			
			if(cur.val==element){
				found =1;
				cur=cur.next;
				break;
			}
			prev = cur;
			cur=cur.next;

		}

		if(found==1){

			if(prev==null ){
				head=cur;
			}
			else{
				prev.next=cur;
			}
		
		}
		else{
			System.out.println("Element Not Found.");
		}
	}

	void ReverseDisplay(Node head){
         
         if(head==null)
         	return;

         ReverseDisplay(head.next);
         System.out.print(head.val+"-->");

	}

	void Reverse(){
		Node cur = head;

		ReverseDisplay(cur);
	}


	void display(){

		Node cur=head;
		

		while(cur!=null){
			System.out.print(cur.val+"-->");
			cur=cur.next;
		}
		System.out.println();

	}


	public static void main(String[] args) {
		
		System.out.println("Enter choice:");
		Scanner sc = new Scanner(System.in);
		LinkedList obj = new LinkedList();
		int x,n;
		

		while(true){

			System.out.println("\n1.For insertion at begning");
			System.out.println("2.for insertion at end");
			System.out.println("3.for deletion");
			System.out.println("4.for display");
			System.out.println("5.for reverse display");
			System.out.println("6.to exit");

			
			n = sc.nextInt();


			switch(n){


			case 1:
				System.out.println("Please enter element");
				x =sc.nextInt();

				obj.InsertAtBegning(x);
				break;

			case 2:
				System.out.println("Please enter element");
				x =sc.nextInt();

				obj.InsertAtEnd(x);
				break;

			case 3:
				System.out.println("Please enter element to be deleted");
				x =sc.nextInt();
				obj.delete(x);
				break;

			case 4:
				System.out.println("Elements are:");
				obj.display();
				break;

			case 5:
				System.out.println("Elements are:");
				obj.Reverse();
				break;

			case 6:
				System.out.println("Exiting the program");
				System.exit(1);



			default:
				System.out.println("Please enter valid choice");

			}
		}

	}


}