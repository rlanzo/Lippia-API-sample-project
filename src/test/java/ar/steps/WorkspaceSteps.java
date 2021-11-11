package ar.steps;

import api.model.BaseServices;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;



public class WorkspaceSteps extends PageSteps {

    @Given("Mi cuenta creada en clockify y mi X-Api-Key generada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGeneada() {
        BaseServices.API_KEY.set("MmQ5MDNjM2QtNTc0NS00Yzg4LTgyNDAtYjQ3MmIyMGMzMmJl");
    }

    @Given("^My account created in clockify and my X-Api-Key$")
    public void myAccountCreatedInClockifyAndMyXApiKey() {
        BaseServices.API_KEY.set("YWU1MDQ4ZTAtM2U5MS00ODMwLTg3YjYtMmEzYzkxZmI4MTRl");
    }

    @And("My valid workspace id")
    public void myValidWorkspaceId() {
        BaseServices.WORKSPACE_ID.set("616f3efb99d16c30b318db43");
    }

    @And("My valid project id")
    public void myValidProjectId() {
        BaseServices.PROJECT_ID.set("617b125a11d52a34104e57cf");
    }
}