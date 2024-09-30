package dataProvider.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtility;

public class GetProductInfoTest {

	@Test(dataProvider = "getData")
	public void getProductInfoTest(String brandNam, String productName) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");

		// Search product
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(brandNam, Keys.ENTER);

		// capture product info
		String price = driver
				.findElement(
						By.xpath("//span[text()='" + productName + "']/../../../../..//span[@class='a-price-whole']"))
				.getText();
		System.out.println(price);

		driver.quit();
	}

	@DataProvider
	public Object[][] getData() throws Throwable {

		ExcelUtility elib = new ExcelUtility();

		int rowCount = elib.getRowcount("product");
		
		Object[][] objArr = new Object[rowCount][2];

		for (int i = 0; i < rowCount; i++) {
			objArr[i][0] = elib.getDataFromExcel("product", i + 1, 0);
			objArr[i][1] = elib.getDataFromExcel("product", i + 1, 1);
			

		}

		return objArr;
	}

}
