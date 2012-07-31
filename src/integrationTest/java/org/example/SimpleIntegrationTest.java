package org.example;

import static org.fest.assertions.Assertions.assertThat;

import org.example.page.WelcomePage;
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.domain.FluentWebElement;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SimpleIntegrationTest extends FluentTest {

	private WebDriver webDriver = new HtmlUnitDriver();

	@Page
	private WelcomePage page;

	@Test
	public void simpleTest() {
		goTo(page);
		page.isAt();

		FluentWebElement element = findFirst(".label");
		assertThat(element.getText()).isEqualTo("It works!");
	}

	@Override
	public WebDriver getDefaultDriver() {
		return webDriver;
	}
}
