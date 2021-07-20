package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ArticlePage;
import pages.WikiHomePage;

public class WikiTests extends BaseTests{
	
	@Test
	public void testWikiSearch() {
		WikiHomePage home = getWikiHomePage();
		ArticlePage articlePage = home.buscar("java");
		Assert.assertEquals(articlePage.getPageTitle(), "Java");
	}

}
