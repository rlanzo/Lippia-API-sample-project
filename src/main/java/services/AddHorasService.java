package services;

import api.model.BaseServices;
import api.model.Horas;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class AddHorasService extends MethodsService {

    public static Response post(String jsonName) {return post(jsonName, Horas[].class, setParams()); }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key", BaseServices.API_KEY.get());
        params.put("start", BaseServices.START.get());
        params.put("end", BaseServices.END.get());
        return params;
    }
}