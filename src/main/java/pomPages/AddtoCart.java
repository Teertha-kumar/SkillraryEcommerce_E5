package pomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class AddtoCart
{

@FindBy(id="add")
private WebElement addbtn;

@FindBy(xpath="//button[text()=' Add to Cart']")
private WebElement cartbtn;

public AddtoCart(WebDriver driver) 
{
    PageFactory.initElements(driver, this);
}

public WebElement getAddbtn() 
{
	return addbtn;
}

public void carttocartbtn()
{
	cartbtn.click();
}
}