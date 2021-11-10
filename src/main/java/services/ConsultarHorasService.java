package services;

import api.model.AgregarHoras;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

import static api.model.BaseServices.*;


public class ConsultarHorasService extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName,ConsultarHorasService.class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key-integrador",API_KEY_INTEGRADOR.get());
        params.put("id-workspace",ID_WORKSPACE_INTEGRADOR.get());
        params.put("id-hours-delete",ID_DELETE_HOURS.get());
        return params;
    }


}