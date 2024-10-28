package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastrarDadosPage2 {

	static WebDriver driver;

	public CadastrarDadosPage2(WebDriver driver) {
			this.driver = driver;
		}

	public void preencherCampoDia() {
		WebElement campoDia = driver.findElement(By.name("day"));
		campoDia.sendKeys("16");
	}
	
	public void preencherCampoAno() {
		WebElement campoAno = driver.findElement(By.name("year"));
		campoAno.sendKeys("2005");
	}
	
	public void escolherMes() {
		WebElement campoMes = driver.
	}
	
	public void escolherGenero() {
		
	}


}
