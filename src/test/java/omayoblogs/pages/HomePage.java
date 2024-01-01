package omayoblogs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement multiselectdropdownlocator() {
		WebElement selector = driver.findElement(By.xpath("//select[@id=\"multiselect1\"]"));
		return selector;
	}

	public void clickOnLink() {
		driver.findElement(By.xpath("//a[@id=\"selenium143\"]")).click();
	}

	// this is regarding to table
	public void tableContent(WebDriver driver) {
		driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td"));
	}

	public WebElement singleDropdown() {
		WebElement selector = driver.findElement(By.xpath("//select[@id='drop1']"));
		return selector;
	}

	public void TextArea() {
		driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("giiiiiii");
	}

	public WebElement MaleRadioButton() {
		WebElement button = driver.findElement(By.xpath("//input[@id='radio1']"));
		return button;
	}

	public WebElement FeMaleRadioButton() {
		WebElement button1 = driver.findElement(By.xpath("//input[@id='radio2']"));
		return button1;

	}

	public WebElement enableButton() {
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='but2']"));
		return btn1;

	}

	public WebElement disableButton() {
		WebElement btn2 = driver.findElement(By.xpath("//button[@id='but1']"));
		return btn2;
	}

	public WebElement hiddenButton() {
		WebElement btn3 = driver.findElement(By.xpath("//input[@id='hbutton']"));
		return btn3;

	}

	public ArrayList orderlist() {

		List<WebElement> orderList = driver.findElements(By.xpath("//div [@class='widget-content']/ol/li"));
		ArrayList<String> data = new ArrayList<>();
		for (WebElement list : orderList) {
			data.add(list.getText());

		}
		return data;

	}

	public List<WebElement> multipleCheckBox() {
		
		List<WebElement> allcheckBox = driver.findElements(By.xpath("//div[@class='widget-content']//input[@name='accessories']"));
		
		for (WebElement onebyone : allcheckBox) {
			if(!(onebyone.isSelected())) {
			onebyone.click();
			
	}
			
		}
		return allcheckBox;
		
		
	}
	
	//this is to check first two boxes
	public List<WebElement>  getTwoCheckboxes() {
	List<WebElement> boxes =driver.findElements(By.xpath("//div[@class='widget-content']//input[@name='accessories']"));
int totalboxes=	boxes.size();
for(int i =0;i<totalboxes;i++) {
	if(i<2 && !(boxes.get(i).isSelected())) {
		boxes.get(i).click();
	}
	
}
return boxes;




	
	}
	public void checkLastTwoCheckboxes() {
		driver.findElement(By.xpath("//div[@class='widget-content']//input[@name='accessories']"));
		
	}

	public void radioButtonThree() throws InterruptedException {
		List<WebElement> radioButtons = driver.findElements(By.xpath("//div[@class='widget-content']//input[@name='vehicle']"));
	int totalbuttons=	radioButtons.size();
		radioButtons.get(0).click();
		if(radioButtons.get(0).isSelected()) {
			System.out.println("buton is  selected");
		}
		radioButtons.get(1).click();
		radioButtons.get(2).click();
		
	}
	public WebElement fileUpload() {
	WebElement file=	driver.findElement(By.xpath("//input[@id='uploadfile']"));
	file.sendKeys("C:\\Users\\ABC\\Desktop\\krithya\\Neha resume.docx");
	return file;
	}

}
