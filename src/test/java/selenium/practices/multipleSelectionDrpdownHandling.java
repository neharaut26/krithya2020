package selenium.practices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelectionDrpdownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wevdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/omayo.blogspot.com");
		driver.manage().window().maximize();
		WebElement multiselect = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select multiselectdrpdwn = new Select(multiselect);
		//this method is to check whethr it is multiple dropdown or not
		multiselectdrpdwn.isMultiple();
	List<WebElement> options=	multiselectdrpdwn.getOptions();
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		
		multiselectdrpdwn.selectByVisibleText("Swift");
		//multiselectdrpdwn.selectByIndex(0);
		multiselectdrpdwn.selectByIndex(3);
	List<WebElement> selectedoptn=	multiselectdrpdwn.getAllSelectedOptions();
	for( WebElement opt:selectedoptn) {
		System.out.println(opt.getText());
	}
	System.out.println("222222222222222222222222222222222");	
	System.out.println(multiselectdrpdwn.getFirstSelectedOption().getText());
	Thread.sleep(2000);
	multiselectdrpdwn.deselectByIndex(0);
	multiselectdrpdwn.deselectByValue("audix");
	
	multiselectdrpdwn.deselectByVisibleText("Swift");
	
	
	multiselectdrpdwn.selectByIndex(0);
	multiselectdrpdwn.selectByValue("audix");
	multiselectdrpdwn.deselectByVisibleText("Swift");
	multiselectdrpdwn.deselectAll();
	
	//this is use to select a single dropdown
	WebElement singleselect = driver.findElement(By.xpath("//select[@id='drop1']"));
	Select singledropdwn = new Select(singleselect);
	//to ckech whethr this dropdown is multiple or not
	System.out.println(singledropdwn.isMultiple());
	List<WebElement> alloptions =singledropdwn.getOptions();
	
	  Iterator<WebElement> it = alloptions.iterator();
	  while(it.hasNext()){
	WebElement	r= it.next();
	  System.out.println(r.getText()); }
	  System.out.println("##################################################################");
	 
	
	// for(WebElement e:alloptions) { System.out.println(e.getText()); }
	  singledropdwn.selectByIndex(3);
	  singledropdwn.selectByValue("mno");
	  singledropdwn.selectByVisibleText("doc 1");
	System.out.println(singledropdwn.getFirstSelectedOption().getText());
	//deselect doesnt work here bcs it is single dropdown
	//singledropdwn.deselectByValue("mno");
	
	
System.out.println(	driver.findElement(By.cssSelector("select#drop1")).getCssValue("color"));
	}

}
