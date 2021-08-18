package global;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DataProvider_ {

    @DataProvider
    public static Object[][] getOwnersLoginData(Method m) {
        Object[][] data;
        data = new Object[2][2];
        data [0][0] = "zo1@berkley.dk";
        data [0][1] = ObjectRepo.universalPassword;
        data [1][0] = "zo2@berkley.dk";
        data [1][1] = ObjectRepo.universalPassword;

        return data;
    }


}
