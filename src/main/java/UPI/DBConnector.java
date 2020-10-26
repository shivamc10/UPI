package UPI;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.json.simple.JSONObject;

class DBConnector {
    private static DBConnector dbConnector;

    private DBConnector(){

    }
    public static DBConnector getDBConnector(){
        if(dbConnector == null){
            dbConnector = new DBConnector();
        }
        return dbConnector;
    }
    public void insert(String query){

    }

    public JSONObject queryExecute(String query){
        return new JSONObject();
    }
}
