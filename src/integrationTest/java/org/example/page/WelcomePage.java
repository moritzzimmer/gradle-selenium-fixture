/**
 * 
 */
package org.example.page;

import static org.fest.assertions.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;

public class WelcomePage extends FluentPage {

	@Override
	public void isAt() {
		assertThat(title()).isEqualTo("foo");
	}

	@Override
	public String getUrl() {
		return "http://localhost:8081/foo";
	}
}
