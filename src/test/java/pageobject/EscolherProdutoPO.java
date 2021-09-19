package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

public class EscolherProdutoPO {
    private DSL dsl;
    WebDriver driver;

    public EscolherProdutoPO(WebDriver driver) {
        dsl = new DSL(driver);
    }

    public void escolhaProduto() throws InterruptedException {
        dsl.clicarBotaoXpath("//div[@id='block_top_menu']/ul/li[2]/a");
        dsl.clicarBotaoXpath("//div[@id='subcategories']//li[3]/div/a");
        dsl.clicarBotaoXpath("//div[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a/span");

        Thread.sleep(5000);
        dsl.verificarCarrinho();
    }
}
