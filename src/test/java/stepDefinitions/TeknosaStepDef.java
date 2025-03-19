package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TeknosaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TeknosaStepDef {

    TeknosaPage page=new TeknosaPage();

    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
        Driver.getAndroidDriver();

    }
    @When("Ilk ekran bolumunden atlaya tiklanir")
    public void ilk_ekran_bolumunden_atlaya_tiklanir() {
        page.atlaButonu.click();
        ReusableMethods.bekle(3);
    }
    @When("bolumunden {string} bolumune tiklanir")
    public void bolumunden_bolumune_tiklanir(String string) {
        page.kategorilerButonu.click();
        ReusableMethods.bekle(3);
    }
    @When("kategoriler bolumunden kaydirarak {string} bolumune tiklanir")
    public void kategoriler_bolumunden_kaydirarak_bolumune_tiklanir(String kategoriSecim) {
        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,100);
        ReusableMethods.bekle(3);
        ReusableMethods.scrollWithUiScrollableAndClick(kategoriSecim);
    }
    @When("acilan sayfadan {string} secimi yapilir")
    public void acilan_sayfadan_secimi_yapilir(String urun) {
        ReusableMethods.scrollWithUiScrollableAndClick(urun);
        ReusableMethods.bekle(3);
    }

    @When("filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {
        page.FiltreleButonu.click();
        ReusableMethods.bekle(3);
    }
    @Then("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String marka) {
        page.markaButonu.click();
        ReusableMethods.bekle(3);
        page.markaMetinYazmaKutusu.sendKeys(marka);
        ReusableMethods.bekle(3);
        page.filtrelenmisMarkaKutusu.click();
        ReusableMethods.bekle(3);
        page.SonuclariGosterButonu.click();

    }



}

