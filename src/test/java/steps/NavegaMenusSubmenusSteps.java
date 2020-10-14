package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.HomePage;

public class NavegaMenusSubmenusSteps {

	private static WebDriver driver;
	private HomePage homePage = new HomePage(driver);

	@Before
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\85\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	///////////Acessar tela inical
	@Dado("que estou na pagina inicial")
	public void que_estou_na_pagina_inicial() {
		homePage.carregarPaginaInicial();
		assertThat(homePage.obterTituloPaginaInicial(), is("Auditeste - Especialistas em Qualidade de Software"));

	}

	///////////////Fechar Frame que aparece na tela inicial
	@Dado("fecho o frame")
	public void fecho_o_frame() {
		homePage.fecharFrame();

	}
	
	/////////////// Menu Quem Somos
	@Dado("clico no menu Quem Somos")
	public void clico_no_menu_quem_somos() {
		homePage.botaoMenuQuemSomos();
	}

	@Entao("abre a tela Quem Somos")
	public void abre_a_tela_quem_somos() {
		assertThat(homePage.obterTituloPaginaQuemSomos(), is("Quem somos - Auditeste"));

	}
	///////////////Menu e Submenus Servicos
	
	////Submenu Testes Automatizados
		@Dado("clico no menu Servicos")
		public void clico_no_menu_servicos() {
			homePage.botaoMenuServicos();
		}

		@Dado("clico no Submenu Testes Automatizados")
		public void clico_no_submenu_testes_automatizados() {
			homePage.botaoSubMenuServicosTestesAutomatizados();
		}

		@Entao("abre a tela Testes Automatizados")
		public void abre_a_tela_testes_automatizados() {
			assertThat(homePage.obterTituloPaginaSubmenuTestesAutomatizados(), is("Testes Automatizados - Auditeste"));
		}
	
	/////Submenu Testes Funcionais e Nao Funcionais
		@Dado("clico no Submenu Testes Funcionais e Nao Funcionais")
		public void clico_no_submenu_testes_funcionais_e_nao_funcionais() {
			homePage.botaoSubMenuServicosTestesFuncionaisNaoFuncionais();
		}

		@Entao("abre a tela Testes Funcionais e Nao Funcionais")
		public void abre_a_tela_testes_funcionais_e_nao_funcionais() {
			assertThat(homePage.obterTituloPaginaSubmenuTestesFuncionaisNaoFuncionais(), is("Testes Funcionais Não Funcionais - Auditeste"));
		}
	
	//////Submenu Testes Manuais
		@Dado("clico no Submenu Testes Manuais")
		public void clico_no_submenu_testes_manuais() {
			homePage.botaoSubMenuServicosTestesManuais();
		}

		@Entao("abre a tela Testes Manuais")
		public void abre_a_tela_testes_manuais() {
			assertThat(homePage.obterTituloPaginaSubmenuTestesManuais(), is("Testes Manuais - Auditeste"));
		}
	
	/////Submenu Testes Mobile
		@Dado("clico no Submenu Testes Mobile")
		public void clico_no_submenu_testes_mobile() {
			homePage.botaoSubMenuServicosTestesMobile();
		}

		@Entao("abre a tela Testes Mobile")
		public void abre_a_tela_testes_mobile() {
			assertThat(homePage.obterTituloPaginaSubmenuTestesMobile(), is("Testes Mobile - Auditeste"));
		}

	/////Submenu Fabrica de Testes
		@Dado("clico no Submenu Fabrica de Testes")
		public void clico_no_submenu_fabrica_de_testes() {
			homePage.botaoSubMenuServicosFabricaTestes();
		}

		@Entao("abre a tela Fabrica de Testes")
		public void abre_a_tela_fabrica_de_testes() {
			assertThat(homePage.obterTituloPaginaSubmenuFabricaDeTestes(), is("Fábrica de Testes - Auditeste"));
		}

	///////Submenu Consultoria
		@Dado("clico no Submenu Consultoria")
		public void clico_no_submenu_consultoria() {
			homePage.botaoSubMenuServicosConsultoria();
		}

		@Entao("abre a tela Consultoria")
		public void abre_a_tela_consultoria() {
			assertThat(homePage.obterTituloPaginaSubmenuConsultoria(), is("Consultoria - Auditeste"));
		}

	/////Submenu Crowdsourced Auditeste
		@Dado("clico no Submenu Crowdsourced Auditeste")
		public void clico_no_submenu_crowdsourced_auditeste() {
			homePage.botaoSubMenuServicosCrowdsourcedAuditeste();
		}

		@Entao("abre a tela Crowdsourced Auditeste")
		public void abre_a_tela_crowdsourced_auditeste() {
			assertThat(homePage.obterTituloPaginaSubmenuCrowdsourcedAuditeste(), is("Crowdsourced Auditeste - Auditeste"));
		}

	/////Submenu Alocacao de Profissionais
		@Dado("clico no Submenu Alocacao de Profissionais")
		public void clico_no_submenu_alocacao_de_profissionais() {
			homePage.botaoSubMenuServicosAlocacaoDeProfissionais();
		}

		@Entao("abre a tela Alocacao de Profissionais")
		public void abre_a_tela_alocacao_de_profissionais() {
			assertThat(homePage.obterTituloPaginaSubmenuAlocacaoProfissionais(), is("Alocação de Profissionais - Auditeste"));
		}

	/////Submenu Automacao de Processos
		@Dado("clico no Submenu Automacao de Processos")
		public void clico_no_submenu_automacao_de_processos() {
			homePage.botaoSubMenuServicosAutomacaoDeProcessos();
		}

		@Entao("abre a tela Automacao de Processos")
		public void abre_a_tela_automacao_de_processos() {
			assertThat(homePage.obterTituloPaginaSubmenuAutomacaoDeProcessos(), is("Automação de Processos - Auditeste"));
		}
	

	/////////////////// Menu Cases de Sucesso
	@Dado("clico no menu Cases de Sucesso")
	public void clico_no_menu_cases_de_sucesso() {
		homePage.botaoMenuCasesDeSucesso();
		
	}

	@Entao("abre a tela Cases de Sucesso")
	public void abre_a_tela_cases_de_sucesso() {
		assertThat(homePage.obterTituloPaginaCasesDeSucesso(), is("Cases de Sucesso - Auditeste"));
		
	}
	
	////////////////// Menu Trabalhe Conosco
	@Dado("clico no menu Trabalhe Conosco")
	public void clico_no_menu_trabalhe_conosco() {
	    homePage.botaoMenuTrabalheConosco();
	}

	@Entao("abre a tela Trabalhe Conosco")
	public void abre_a_tela_trabalhe_conosco() {
		assertThat(homePage.obterTituloPaginaTrabalheConosco(), is("Trabalhe Conosco - Auditeste"));
		
	}
	
	//////////////////Menu Blog
	@Dado("clico no menu Blog")
	public void clico_no_menu_blog() {
	    homePage.botaoMenuBlog();
	}

	@Entao("abre a tela Blog")
	public void abre_a_tela_blog() {
		assertThat(homePage.obterTituloPaginaBlog(), is("Blog - Auditeste"));
	}
	
	////////////Menu Contato
	@Dado("clico no menu Contato")
	public void clico_no_menu_contato() {
	    homePage.botaoMenuContato();
	}

	@Entao("abre a tela Contato")
	public void abre_a_tela_contato() {
		assertThat(homePage.obterTituloPaginaContato(), is("Contato - Auditeste"));
	}
	
	///////Menu Home
	@Dado("clico no menu Home")
	public void clico_no_menu_home() {
	    homePage.botaoMenuHome();
	}

	@Entao("abre a tela Home")
	public void abre_a_tela_home() {
		assertThat(homePage.obterTituloPaginaHome(), is("Auditeste - Especialistas em Qualidade de Software"));
	    
	}

	/////////Fechar Site
	@After
	public static void finalizar() {
		driver.quit();
	}

}
