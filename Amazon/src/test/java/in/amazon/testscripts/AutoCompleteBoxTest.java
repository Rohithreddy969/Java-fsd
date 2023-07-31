package in.amazon.testscripts;

import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;

public class AutoCompleteBoxTest extends MainTest{

	@Test
	public void selectItem() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.searchFromBox("computer");
}
}