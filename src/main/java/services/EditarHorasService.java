package services;

import api.model.Data;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class EditarHorasService extends MethodsService {


    public static Response put(String jsonName) {
        return put(jsonName, Data.class);
    }

}
