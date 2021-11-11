package ar.Validator;


import api.model.TimesEntriesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ProjectValidator {

    public static void validateId(String entity) {
        TimesEntriesResponse response = (TimesEntriesResponse) APIManager.getLastResponse().getResponse();
        Assert.assertTrue(entity.contains(response.getId()), "el id del projecto es nulo");
    }

}
