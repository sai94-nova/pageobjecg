package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import rediff.rediffhome;

public class googleutils {
	public int rowcnt;
	public void logsdata() throws Exception {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(".//book.xlsx");
		// Connection connection=fillo.getConnection(path);
		String strQuery = "Select * from Sheet3";
		Recordset recordset = connection.executeQuery(strQuery);

		while (recordset.next()) {
			System.out.println(" " + recordset.getField("srchdata") );
			String con = recordset.getField("srchdata");
			
			gl(con);
		}

		rowcnt = recordset.getCount();
		System.out.println(rowcnt);

		recordset.close();
		connection.close();
	}
	
	public void gl(String srch) throws Exception {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\\\Downloaded\\\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.get("https://www.google.com/");
		googlepf gpf=new googlepf(driver);
		gpf.Search().sendKeys(srch);
		Thread.sleep(2000);
		gpf.SearchBtn().click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(5000);
		
	}
}
