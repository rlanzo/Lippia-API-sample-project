package services;

import api.model.BaseServices;
import api.model.Users;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class UserService extends MethodsService {

    public static Response get(String jsonName) { return get(jsonName, Users.class, setParams()); }

    private static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key", BaseServices.API_KEY.get());
        params.put("user-id", BaseServices.USER_ID.get());
        return params;
    }

}


