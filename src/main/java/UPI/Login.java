package UPI;

import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


class Login {

    @GET
    @Path("/login")
    public JSONObject signIn(String uName, String pass){
        if(Datastore.checkCredentials(uName, pass))
            return loginPage(uName);
        throw new Exceptions("credentials not matched");
    }

    public JSONObject loginPage(String uName){
        Account account = Datastore.accountInfo(uName);
        JSONObject json = new JSONObject();
        json.put("user name", account.getName());
        json.put("Account no", account.getAccountNo());
        json.put("Balance", account.getBalance());
        return  json;
    }

}
