public class bank{
    private String accountname;
    private int accountnumber;

    bank(String accountname, int accountnumber) {
        this.accountname = accountname;
        this.accountnumber = accountnumber;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public static void main(String[] args) {
        bank b1 = new bank("Tejas", 12345);
        System.out.println("Account Name: " + b1.getAccountname());
        System.out.println("Account Number: " + b1.getAccountnumber());

        b1.setAccountname("Sathwik");
        b1.setAccountnumber(54321);
        System.out.println("Updated Account Name: " + b1.getAccountname());
        System.out.println("Updated Account Number: " + b1.getAccountnumber());
    }
}