package pomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
public class Testingpage 
{
	@FindBy(xpath="(//a[text()='Selenium Training']) [2]")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement carttab;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook']) [2]")
	private WebElement facebook;
	
	public Testingpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}

	public WebElement getSeleniumtraining() 
	{
		return seleniumtraining;
	}

	public WebElement getCarttab() 
	{
		return carttab;
	}
	
	public void facebookicon()
	{
		facebook.click(); 
	}

	}
	
	
