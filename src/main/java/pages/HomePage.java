package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	
	private By fechar_Frame = By.cssSelector("#sgpb-popup-dialog-main-div-wrapper > div > img");
	private By menuHome = By.cssSelector("#menu-item-132 > a");
	private By menuQuemSomos = By.cssSelector("#menu-item-133");
	private By menuServicos = By.cssSelector("#menu-item-290");
	//SubMenu
		private By subMenuServicosTestesAutomatizados = By.cssSelector("#menu-item-296");
		private By subMenuServicosTestesFuncionaisNaoFuncionais = By.cssSelector("#menu-item-293");
		private By subMenuServicosTestesManuais = By.cssSelector("#menu-item-292");
		private By subMenuServicosTestesMobile = By.cssSelector("#menu-item-291");
		private By subMenuServicosFabricaTestes = By.cssSelector("#menu-item-294");
		private By subMenuServicosConsultoria = By.cssSelector("#menu-item-295");
		private By subMenuServicosCrowdsourcedAuditeste = By.cssSelector("#menu-item-816");
		private By subMenuServicosAlocacaoDeProfissionais = By.cssSelector("#menu-item-297");
		private By subMenuServicosAutomacaoDeProcessos = By.cssSelector("#menu-item-772");
	////
	private By menuCasesDeSucesso = By.cssSelector("#menu-item-392");
	private By menuTrabalheConosco = By.cssSelector("#menu-item-135");
	private By menuBlog = By.cssSelector("#menu-item-1477");
	private By menuContato = By.cssSelector("#menu-item-130");
	
		
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//////Carregar pagina inicial
	public void carregarPaginaInicial() {
		driver.get("https://auditeste.com.br/");
	}
	////Obter titulo pagina inicial para validar se esta na pagina correta
	public String obterTituloPaginaInicial() {
		return driver.getTitle();
	}
			
	///////Fechar Frame que aparece na tela inicial
	public void fecharFrame() {
		driver.findElement(fechar_Frame).click();
	}
	
	///Menu Home
		public void botaoMenuHome() {
			driver.findElement(menuHome).click();
		}
	////Obter titulo pagina Home para validar se esta na pagina correta	
		public String obterTituloPaginaHome() {
			return driver.getTitle();
		}
	
	//////Menu Quem Somos
	public void botaoMenuQuemSomos() {
		driver.findElement(menuQuemSomos).click();
	}
	////Obter titulo pagina Que Somos para validar se esta na pagina correta
	public String obterTituloPaginaQuemSomos() {
		return driver.getTitle();
	}
	
	///////Menu Servicos
	public void botaoMenuServicos() {
		driver.findElement(menuServicos).click();
	}
	
	///////////SubMenu Servicos
		///////Submenu Testes Automatizados
		public void botaoSubMenuServicosTestesAutomatizados() {
			driver.findElement(subMenuServicosTestesAutomatizados).click();
		}
		////Obter titulo pagina Testes Automatizados para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuTestesAutomatizados() {
			return driver.getTitle();
		}
		
		///////Submenu Testes  Funcionais e Nao Funcionais
		public void botaoSubMenuServicosTestesFuncionaisNaoFuncionais() {
			driver.findElement(subMenuServicosTestesFuncionaisNaoFuncionais).click();
		}
		////Obter titulo pagina Testes Funcionais e Nao Funcionais para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuTestesFuncionaisNaoFuncionais() {
			return driver.getTitle();
		}
		
		///////Submenu Testes Manuais
		public void botaoSubMenuServicosTestesManuais() {
			driver.findElement(subMenuServicosTestesManuais).click();
		}
		////Obter titulo pagina Testes Manuais para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuTestesManuais() {
			return driver.getTitle();
		}
		
		///////Submenu Testes Mobile
		public void botaoSubMenuServicosTestesMobile() {
			driver.findElement(subMenuServicosTestesMobile).click();
		}
		////Obter titulo pagina Testes Mobile para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuTestesMobile() {
			return driver.getTitle();
		}
		
		///////Submenu Fabrica de Testes
		public void botaoSubMenuServicosFabricaTestes() {
			driver.findElement(subMenuServicosFabricaTestes).click();
		}
		////Obter titulo pagina Fabrica de Testes para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuFabricaDeTestes() {
			return driver.getTitle();
		}
		
		///////Submenu Consultoria
		public void botaoSubMenuServicosConsultoria() {
			driver.findElement(subMenuServicosConsultoria).click();
		}
		////Obter titulo pagina Consultoria para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuConsultoria() {
			return driver.getTitle();
		}
		
		///////Submenu Crowdsourced Auditeste
		public void botaoSubMenuServicosCrowdsourcedAuditeste() {
			driver.findElement(subMenuServicosCrowdsourcedAuditeste).click();
		}
		////Obter titulo pagina Crowdsourced Auditeste para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuCrowdsourcedAuditeste() {
			return driver.getTitle();
		}
		
		///////Submenu Alocacao De Profissionais
		public void botaoSubMenuServicosAlocacaoDeProfissionais() {
			driver.findElement(subMenuServicosAlocacaoDeProfissionais).click();
		}
		////Obter titulo pagina Alocacao Profissionais para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuAlocacaoProfissionais() {
			return driver.getTitle();
		}
		
		///////Submenu Automacao de Processos 
		public void botaoSubMenuServicosAutomacaoDeProcessos() {
			driver.findElement(subMenuServicosAutomacaoDeProcessos).click();
		}
		////Obter titulo pagina Automacao De Processos para validar se esta na pagina correta
		public String obterTituloPaginaSubmenuAutomacaoDeProcessos() {
			return driver.getTitle();
		}
	//////////////Fim SubMenu Servicos
	
	//////Menu Cases de Uso
	public void botaoMenuCasesDeSucesso() {
		driver.findElement(menuCasesDeSucesso).click();
	}
	////Obter titulo pagina Cases de Uso para validar se esta na pagina correta
	public String obterTituloPaginaCasesDeSucesso() {
		return driver.getTitle();
	}
	
	//////Menu Trabalhe conosco
	public void botaoMenuTrabalheConosco() {
		driver.findElement(menuTrabalheConosco).click();
	}
	////Obter titulo pagina Trabalhe conosco para validar se esta na pagina correta
	public String obterTituloPaginaTrabalheConosco() {
		return driver.getTitle();
	}
	
	/////Menu Blog
	public void botaoMenuBlog() {
		driver.findElement(menuBlog).click();
	}
	////Obter titulo pagina Blog para validar se esta na pagina correta
	public String obterTituloPaginaBlog() {
		return driver.getTitle();
	}
	
	/////Menu Contato
	public void botaoMenuContato() {
		driver.findElement(menuContato).click();
	}
	////Obter titulo pagina Contato para validar se esta na pagina correta
	public String obterTituloPaginaContato() {
		return driver.getTitle();
	}

	
	
	


	
	

}
