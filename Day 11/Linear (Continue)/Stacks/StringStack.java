public class StringStack{
    private static final int MAX_SIZE=10;
    private String[] arr=new String[MAX_SIZE];
    private int top=-1;
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }

    public void push(String data){
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=data;
        System.out.println("The String: "+data+" was pushed to stack.");
    }

    public String pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return null;
        }
        String popped=arr[top--];
        return popped;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("\n The Stack Elements in order [LIFO] are: ");
        for (int i=top;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public int size(){
        return top+1;
    }

    public String peek(){
        // Intention is to fetch the top element --> not delete it.
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        StringStack stack=new StringStack();
        // Stack.pop();
        stack.push("Mango");
        stack.push("Pineapple");
        stack.push("Avacado");
        stack.display();
        System.out.println("Top Element: "+stack.peek());
        String popped=stack.pop();
        System.out.println("Popped Element: "+popped);
        stack.display();
        System.out.println("Size of stack: "+stack.size());
    }
}