package services;

import api.model.AgregarHoras;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class AgregarHorasService extends MethodsService {


    public static Response post(String jsonName) {
        return post(jsonName, AgregarHoras.class);
    }

}
