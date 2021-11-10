package services;

import api.model.BaseServices;
import api.model.Horas;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class CambiarHorasService extends MethodsService {
    public static final ThreadLocal<String> ID_TIME_ENTRIES = new ThreadLocal<String>();

    public static Response put(String jsonName) { return put(jsonName, Horas[].class, setParams()); }



     private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
         params.put("base.url", PropertyManager.getProperty("base.api.url"));
         params.put("api-key", BaseServices.API_KEY.get());
         params.put("workspaceId", BaseServices.WORKSPACE_ID.get());
         params.put("projectId", BaseServices.PROJECT_ID.get());
         params.put("time-id", CambiarHorasService.ID_TIME_ENTRIES.get());
        return params;
    }
}