package UPI;

class Account {
    private String name;
    private String uName;
    private String pass;
    private int accountNo;
    int balance;

    public Account(String name, String uName, String pass){
        this.name = name;
        this.uName = uName;
        this.pass = pass;
        this.accountNo = createAccountNo();
        this.balance = 0;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getuName() {

        return uName;
    }

    public void setuName(String uName) {

        this.uName = uName;
    }


    public void setPass(String pass) {

        this.pass = pass;
    }

    public String getPass() {

        return pass;
    }

    public void setAccountNo(int accountNo) {

        this.accountNo = accountNo;
    }

    public int getAccountNo(){

        return accountNo;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }


    public int getCreditLimit(){

        return 0;
    }

    private int createAccountNo(){

        return 0;
    }

}
