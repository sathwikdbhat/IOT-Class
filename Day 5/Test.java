public class Test{
    @Deprecated // Used when the program is no longer wanted or in use.
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object Destroyed!");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t=null;
        for (int i=1;i<100;i++){
            System.gc();
        }
    }
}