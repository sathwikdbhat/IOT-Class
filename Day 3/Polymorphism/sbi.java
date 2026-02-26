 class sbi extends bank {
    void interest(double rate, int years){
        double amount=10000;
        double total=(amount*rate*years)/100;
        System.out.println(total);
    }
    public static void main(String[] args) {
        sbi s = new sbi();
        s.interest();
        s.interest(6.5);
        s.interest(6.5, 3);
    }
}