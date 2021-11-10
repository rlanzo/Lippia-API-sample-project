package services;

import api.model.AgregarHoras;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class AgregarHorasService extends MethodsService {


    public static Response get(String jsonName) {
        return get(jsonName, AgregarHoras.class);
    }

    public static Response delete(String jsonName) {
        return delete(jsonName, null);
    }
}
