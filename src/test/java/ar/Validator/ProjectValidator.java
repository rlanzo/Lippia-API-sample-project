package ar.Validator;

import api.model.Horas;
import api.model.TimeInterval;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ProjectValidator {
    public static void validaId(String entity) {
        Horas response = (Horas) APIManager.getLastResponse().getResponse();
        Assert.assertTrue(entity.contains(response.getId()), "The id of project is null");
    }

    public static void validateTime(String time) {
        TimeInterval response = (TimeInterval) APIManager.getLastResponse().getResponse();
        Assert.assertTrue(time.contains(response.getDuration()), "The time of project is null");
    }

    public static void validateDescription() {
        Horas response = (Horas) APIManager.getLastResponse().getResponse();
        Assert.assertTrue(response.getDescription().contains("NewHour"), "The description is null");
    }

}
