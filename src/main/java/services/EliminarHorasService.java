package services;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class EliminarHorasService extends MethodsService {


    public static Response delete(String jsonName) {
        return delete(jsonName, null);
    }
}
