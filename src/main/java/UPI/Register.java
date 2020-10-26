package UPI;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;

class Register {
    @PUT
    @Path("/register")
    public int addAccount(String name, String uName, String pass){
        Account acc = new Account(name, uName, pass);
        int accountNo = acc.getAccountNo();
        Datastore.addAccount(uName, acc);
        return accountNo;
    }
}
