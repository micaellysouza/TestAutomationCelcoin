import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.DSL;
import pageobject.EscolherProdutoPO;
import pageobject.LogarPO;
import pageobject.RegistrarContaPO;


public class Runner {
    WebDriver driver;
    DSL dsl;
    RegistrarContaPO registrar;
    LogarPO logar;
    EscolherProdutoPO escolher;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/bruno/Documents/chrome driver/chromedriver.exe");
        driver = new ChromeDriver();
        dsl = new DSL(driver);
        registrar = new RegistrarContaPO(driver);
        logar = new LogarPO(driver);
        escolher = new EscolherProdutoPO(driver);

        driver.get("http://automationpractice.com/index.php");


    }

    @After
    public void finish() {
        driver.close();
//        driver.quit();
    }

    @Test
    public void execucao() throws InterruptedException {
        //Gerador de email para o login
        int email = dsl.geradorDeEmail();


        //  Given que o site Automation Practice foi acessado
        //  And uma conta de usuário foi criada
        registrar.criacaoConta(email);
        //  And foi realizado o login na conta de usuário criada
        logar.logonConta(email);
        //  When um produto for escolhido
        //  And adicionado ao carrinho de compras
        //  Then validar que o produto foi adicionado ao carrinho de compras
        escolher.escolhaProduto();

    }

}
