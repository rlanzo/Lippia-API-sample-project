package services;

import api.model.BaseServices;
import api.model.Horas;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class ConsultarHorasService extends MethodsService {

    public static Response get(String jsonName) {return get(jsonName, Horas[].class, setParams());}

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key", BaseServices.API_KEY.get());
        return params;
    }
}