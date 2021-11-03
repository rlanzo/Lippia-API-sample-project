package services;

import api.model.Data;
import api.model.Horas;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class AgregarHorasService extends MethodsService {


    public static Response get(String jsonName) {
        return get(jsonName, Horas.class);
    }

    public static Response delete(String jsonName) {
        return delete(jsonName, null);
    }
}
