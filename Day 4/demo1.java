interface browser1{
    void browser1();
}
interface browser2{
    void browser2();
}
interface browser3{
    void browser3();
}
class browsers implements browser1, browser2, browser3 {
    @Override
    public void browser1(){
        System.out.println("Google Chrome");
    }
    @Override
    public void browser2(){
        System.out.println("Microsoft Edge");
    }
    @Override
    public void browser3(){
        System.out.println("Mozilla Firefox");
    }
}
class demo1{
    public static void main(String[] args) {
        browsers b=new browsers();
        b.browser1();
        b.browser2();
        b.browser3();
    }
}