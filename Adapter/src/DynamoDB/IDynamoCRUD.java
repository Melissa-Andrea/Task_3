package DynamoDB;

import Adapter.KardexInformation;
import Adapter.UserInformation;

public interface IDynamoCRUD {
    String create(KardexInformation kardexInformation);
    String read();
}
