public interface catt{
    default void sound(){
        System.out.println("Hello");
    }
}
interface dogg{
    default void sound(){
        System.out.println("Woof");
    }
}
class cog implements catt, dogg{
    @Override
    public void sound(){
        // System.out.println("Some sound");
        catt.super.sound();
        dogg.super.sound();
    }
}
class demo3{
    public static void main(String[] args) {
        cog c=new cog();
        c.sound();
    }
}