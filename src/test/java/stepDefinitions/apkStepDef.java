package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class apkStepDef {

    @Given("Kullanici uygulamayi yükler")
    public void kullanici_uygulamayi_yükler() {
        Driver.getAndroidDriver();

    }


}
