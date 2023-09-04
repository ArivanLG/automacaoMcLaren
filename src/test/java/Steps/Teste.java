package Steps;

import Elementos.ElementosDeTela;
import Metodos.MetodosDeTela;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class Teste {

	MetodosDeTela m = new MetodosDeTela();
	ElementosDeTela e = new ElementosDeTela();

	@Dado("Que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) {

		m.abrirNavegador("https://cars.mclaren.com/br-pt");

	}

	@Quando("No modelidade Super cars")
	public void no_modelidade_super_cars() throws InterruptedException {
		
		Thread.sleep(1500);
		m.clicar(e.getBtnAceitar());
		
				
	}

	@Quando("clicar no modelos do veiculo spider")
	public void clicar_no_modelos_do_veiculo_spider() throws InterruptedException {
		
		Thread.sleep(2500);
		m.clicar(e.getBtnSuperCars());

	}

	@Quando("clicar em descobrir")
	public void clicar_em_descobrir() throws InterruptedException {
		
		Thread.sleep(2000);
		m.clicar(e.getBtnDescobrir());
		

	}

	@Quando("clicar no play")
	public void clicar_no_play() throws InterruptedException {
		
		m.clicar(e.getBtnPlay());
		Thread.sleep(1000);

	}

	@Então("o video iniciará apresentando o designer e a performace do veiculo.")
	public void o_video_iniciará_apresentando_o_designer_e_a_performace_do_veiculo() throws InterruptedException {
		
		m.clicar(e.getBtnVolume());
		Thread.sleep(1000);
		m.clicar(e.getBtnTelaCheia());
		Thread.sleep(57000);
		m.clicar(e.getBtnFechar());
		Thread.sleep(3000);
		m.fecharNavegador();

	}

	
	
}
