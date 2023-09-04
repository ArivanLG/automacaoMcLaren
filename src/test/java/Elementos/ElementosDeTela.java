package Elementos;

import org.openqa.selenium.By;

public class ElementosDeTela {

	private By BtnAceitar = By.id("onetrust-accept-btn-handler");
	
	private By BtnSuperCars = By.xpath("//*[@id=\"app\"]/div/section[1]/div[1]/div/div/div/div[1]/div/div/button[1]");	
	
	private By BtnDescobrir = By.xpath("//*[@id=\"app\"]/div/section[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div[1]/a");
	
	private By BtnPlay = By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[1]/section/div[2]/div/div[2]/button");
	
	private By BtnVolume = By.cssSelector("#app > div > div.root.responsivegrid > div > div.cmp.cmp-h011-hero-image-video.aem-GridColumn.aem-GridColumn--default--12 > section > section > div > div > div > div > div > button.mute-button.js-mute-button > span.icon.unmuted > svg > path");
	
	private By BtnTelaCheia = By.cssSelector("#app > div > div.root.responsivegrid > div > div.cmp.cmp-h011-hero-image-video.aem-GridColumn.aem-GridColumn--default--12 > section > section > div > div > div > div > div > button.full-screen-button.js-full-screen-button > span.icon.exit-full-screen > svg");
	
	private By BtnFechar = By.cssSelector("#app > div > div.root.responsivegrid > div > div.cmp.cmp-h011-hero-image-video.aem-GridColumn.aem-GridColumn--default--12 > section > section > div > div > div > div > button.close-button.js-close-button > span > svg > path");


	
	public By getBtnAceitar() {
		return BtnAceitar;
	}

	public By getBtnSuperCars() {
		return BtnSuperCars;
	}

	public By getBtnDescobrir() {
		return BtnDescobrir;
	}

	public By getBtnPlay() {
		return BtnPlay;
	}

	public By getBtnVolume() {
		return BtnVolume;
	}

	public By getBtnTelaCheia() {
		return BtnTelaCheia;
	}

	public By getBtnFechar() {
		return BtnFechar;
	}
	
	
}
