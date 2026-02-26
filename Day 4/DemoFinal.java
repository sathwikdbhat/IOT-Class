public final class DemoFinal {

}

/*class A extends DemoFinal {
                                    // Cannot inherit final class
}*/

class B{
    final void college(){
        System.out.println("SNPSU");
    }
}
class C extends B{
/*    void college();{
                        // Cannot override final method
    }*/

    final int x=200;
    // x=300;
    
    void show(final int x){
        // x=20;       // cannot change value of final parameter
    }
}