package ar.steps;

import api.model.BaseServices;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ProjectSteps extends PageSteps {

    @And("^Add Hora Stard (.*) y Hora End (.*)")
    public void unNombreDeProyectoName(String start, String end) {
        BaseServices.START.set(start);
        BaseServices.END.set(end);
    }

}



