package pageobject;

import org.openqa.selenium.WebDriver;

public class LogarPO {

    private DSL dsl;
    WebDriver driver;

    public LogarPO(WebDriver driver) {
        dsl = new DSL(driver);
    }

        public void logonConta(int email) throws InterruptedException {
            dsl.clicarBotaoXpath("//header[@id='header']//nav/div[2]/a");
            dsl.escrever("email", email + "@outlook.com");
            dsl.escrever("passwd", System.getenv("senha"));
            dsl.clicarBotao("SubmitLogin");
        }

}
