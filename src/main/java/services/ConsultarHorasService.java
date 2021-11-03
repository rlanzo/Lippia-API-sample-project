package services;

import api.model.Horas;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class ConsultarHorasService extends MethodsService {


    public static Response get(String jsonName) {
        return get(jsonName, Horas.class);
    }

}
