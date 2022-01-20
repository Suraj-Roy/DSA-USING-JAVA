import java.util.Scanner;

class Stack {

    private int arr[];
    private int top;
    private int capacity;

    Stack(){

    }

    Stack(int size){
        arr = new int[size];
        top=-1;
        capacity=size;

    }

    void push(int element){
        if(IsFull()){
            System.out.println("Stack overflow");
            return;
        }
        else{
            arr[++top]=element;
            System.out.println(element+" is pushed into stack");
        }

    }

    void pop(){

        if (IsEmpty()){
            System.out.println("Stack underflow");
            return;
        }
        else{
            System.out.println(arr[top--]+" is poped");
        }

    }

    boolean IsEmpty(){
        if (top==-1){
            return true;
        }
        return false;

    }

    boolean IsFull(){
        if (top==capacity-1){
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of stack: ");
        int n = sc.nextInt();

        Stack obj = new Stack(n);

        System.out.println("Please enter choice:");
        System.out.println("1.for push");
        System.out.println("2.for pop");
        System.out.println("3.for exit");

        while (true){
            int x=sc.nextInt();

            switch(x){

                case 1:
                    System.out.println("Please enter Element: ");
                    int element=sc.nextInt();
                    obj.push(element);
                    break;

                case 2:

                    obj.pop();
                    break;

                case 3:
                    System.out.println("Exiting the program");
                    System.exit(1);
                    break;

                default:
                    System.out.println("Please enter valid choice");
            }
        }

    }
}
