import Adapter.*;
import DynamoDB.DynamoActions;
import DynamoDB.IDynamoCRUD;
import MySql.IMySqlCRUD;
import MySql.MySqlActions;

public class Application {
    public static void main(String[] args) {
        UserInformation userInformation = new UserInformation("Andres", "Lopez");
        KardexInformation kardexInformation = new KardexInformation(81.4);
        SystemInformation systemInformation = new SystemInformation(userInformation, kardexInformation);

        IMySqlCRUD mySqlCRUD = new MySqlActions();
        IDynamoCRUD dynamoCRUD = new DynamoActions();
        IPersistence persistence = new DataBasePersistence(mySqlCRUD, dynamoCRUD);
        persistence.sendData(systemInformation);




    }
}
