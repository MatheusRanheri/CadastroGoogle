package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastrarDadosPage {
	
	static WebDriver driver;
	
	public CadastrarDadosPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherCampoNomes() {
		WebElement campoNome = driver.findElement(By.name("firstName"));
		campoNome.sendKeys("Aluno Matheus");
	}
	
	public void preencherCampoSobreNome() {
		WebElement campoSobreNome = driver.findElement(By.name("lastName"));
		campoSobreNome.sendKeys("Ranheri");
	}
	
	public void ClicarProximo() {
		WebElement proxima = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
		proxima.click();
	}
	
}
