package Adapter;


import DynamoDB.IDynamoCRUD;
import MySql.IMySqlCRUD;

public class DataBasePersistence implements IPersistence{

    private IDynamoCRUD dynamoCRUD;
    private IMySqlCRUD mySqlCRUD;

    public DataBasePersistence(IMySqlCRUD mySqlCRUD,IDynamoCRUD dynamoCRUD) {
        this.dynamoCRUD = dynamoCRUD;
        this.mySqlCRUD = mySqlCRUD;
    }

    @Override
    public void sendData(SystemInformation systemInformation) {
        System.out.println(mySqlCRUD.create(systemInformation.getUserInformation()));
        System.out.println(dynamoCRUD.create(systemInformation.getKardexInformation()));
    }
}
