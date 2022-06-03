package DynamoDB;

import Adapter.KardexInformation;
import Adapter.UserInformation;

public class DynamoActions implements IDynamoCRUD{

    @Override
    public String create(KardexInformation kardexInformation) {
        return "User information DynamoDB";
    }

    @Override
    public String read() {
        return null;
    }
}
