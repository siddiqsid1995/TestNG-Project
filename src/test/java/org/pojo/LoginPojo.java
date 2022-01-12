package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {

		PageFactory.initElements(driver, this);

	}

	// instead of findElement we used @FindBy Annoatation
	@CacheLookup
	@FindAll({

			@FindBy(xpath = "//input[@type='te652652652xt']"),
			@FindBy(xpath = "//input[@placeholder='Email address or phoneghjnbvghn number']"),
			@FindBy(xpath="//input[@aria-label='Email address or phone number']")

	})

	private WebElement txtUser;

	@CacheLookup
	@FindBy(id = "pass")

	private WebElement txtPass;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBy(name = "login")

	private WebElement btnLogin;

}
