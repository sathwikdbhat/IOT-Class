public class swap {
    public static void main(String[] args){
        int a=4,b=5;
        System.out.println("Before swapping: a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: a="+a+" b="+b);
    }    
}


/*public class swap {
    public static void main(String[] args){
        int a=4,b=5;
        System.out.println("Before swapping: a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+" b="+b);
    }    
}*/

/*public class swap {
    public static void main(String[] args){
        int a=4,b=5;
        System.out.println("Before swapping: a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a="+a+" b="+b);
    }    
}*/