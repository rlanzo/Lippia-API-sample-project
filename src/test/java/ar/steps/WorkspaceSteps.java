package ar.steps;

import api.model.BaseServices;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;



public class WorkspaceSteps extends PageSteps {

    @Given("Mi cuenta creada en clockify y mi X-Api-Key generada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGeneada() {
        BaseServices.API_KEY.set("MmQ5MDNjM2QtNTc0NS00Yzg4LTgyNDAtYjQ3MmIyMGMzMmJl");
    }
}