package UPI;

import java.util.HashMap;
import java.util.Map;

public class Datastore {
    public static int accountNumber = 0;
    private static Map<String, Account> accountMap = new HashMap<>();

    public static boolean checkCredentials(String uName, String pass){

        return accountMap.containsKey(uName) && accountMap.get(uName).getPass().equals(pass);
    }

    public static Account accountInfo(String uName){

        return accountMap.get(uName);
    }

    public static void addAccount(String uName, Account account){
        accountNumber++;
        account.setAccountNo(accountNumber);
        accountMap.put(uName, account);
    }
}
