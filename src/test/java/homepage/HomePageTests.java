package homepage;

import org.junit.jupiter.api.Test;

import base.BaseTests;

public class HomePageTests extends BaseTests {
	
	@Test
	public void testNavegacaoMenu_subMenus() {
		carregarPaginaInicial();
		
		
		homePage.fecharFrame();
		
		homePage.botaoMenuQuemSomos();
		
		//Menu e SubMenu (Servicos)
		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosTestesAutomatizados();
		
		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosTestesFuncionaisNaoFuncionais();
		
		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosTestesManuais();
		
		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosTestesMobile();
		
		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosFabricaTestes();
		
		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosConsultoria();
		
		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosCrowdsourcedAuditeste();
		
		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosAlocacaoDeProfissionais();

		homePage.botaoMenuServicos();
			homePage.botaoSubMenuServicosAutomacaoDeProcessos();
		//////////
			
		homePage.botaoMenuCasesDeSucesso();
		
		homePage.botaoMenuTrabalheConosco();
		
		homePage.botaoMenuBlog();
		
		homePage.botaoMenuContato();
		
		homePage.botaoMenuHome();
		
	}

}

