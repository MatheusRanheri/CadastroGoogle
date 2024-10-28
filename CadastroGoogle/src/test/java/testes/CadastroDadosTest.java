package testes;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CadastrarDadosPage;
import pages.CadastrarDadosPage2;

public class CadastroDadosTest {
	
	static WebDriver driver;
	static CadastrarDadosPage cadastroDadosPage;
	static CadastrarDadosPage2 cadastraDadosPage2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?hl=pt");
		driver.manage().window().maximize();
		
		cadastroDadosPage = new CadastrarDadosPage(driver);
		cadastraDadosPage2 = new CadastrarDadosPage2(driver);
	}

	@Test
	public void test() {
		cadastroDadosPage.preencherCampoNomes();
		cadastroDadosPage.preencherCampoSobreNome();
		cadastroDadosPage.ClicarProximo();
	}
	
	@Test
	public void test2() throws InterruptedException {
		
		Thread.sleep(7000);
		
		cadastraDadosPage2.preencherCampoDia();
		cadastraDadosPage2.preencherCampoAno();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}
