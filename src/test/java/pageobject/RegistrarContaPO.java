package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrarContaPO {

    private DSL dsl;
    WebDriver driver;

    public RegistrarContaPO(WebDriver driver) {
        dsl = new DSL(driver);
    }

    //  And uma conta de usuario foi criada
        public void criacaoConta(int email) throws InterruptedException {
            dsl.clicarBotaoXpath("//header[@id='header']//nav/div[1]/a");
            dsl.escrever("email_create",  email + "@outlook.com");
            dsl.clicarBotao("SubmitCreate");
            dsl.esperarElementoAparecer("id_gender2");
            dsl.clicarBotao("id_gender2");
            dsl.escrever("customer_firstname", "Micaelly");
            dsl.escrever("customer_lastname", "Souza");
            dsl.escrever("passwd", System.getenv("senha"));
            dsl.selecionarCombo("days", "15  ");
            dsl.selecionarCombo("months", "May ");
            dsl.selecionarCombo("years", "2001  ");
            dsl.clicarCheck("newsletter");
            dsl.escrever("firstname", "Rua dos");
            dsl.escrever("lastname", "Cariocas");
            dsl.escrever("address1", "Rua dos Cariocas");
            dsl.escrever("city", "Itapevi");
            dsl.selecionarCombo("id_state", "New York");
            dsl.escrever("postcode", "14925");
            dsl.selecionarCombo("id_country", "United States");
            dsl.escrever("phone_mobile", "(11) 9 8947-2199");
            dsl.escrever("alias","Market Our Home");
            dsl.clicarBotao("submitAccount");

        }
}
