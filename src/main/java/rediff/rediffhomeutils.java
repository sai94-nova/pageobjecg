package rediff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class rediffhomeutils {
	public int rowcnt;
	public void logsdata() throws Exception {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(".//book.xlsx");
		// Connection connection=fillo.getConnection(path);
		String strQuery = "Select * from Sheet2";
		Recordset recordset = connection.executeQuery(strQuery);

		while (recordset.next()) {
			System.out.println(" " + recordset.getField("srchdata") );
			String con = recordset.getField("srchdata");
			
			home(con);
		}

		rowcnt = recordset.getCount();
		System.out.println(rowcnt);

		recordset.close();
		connection.close();
	}
	
	public void home(String srch) throws Exception {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\\\Downloaded\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rediffhome rdfh=new rediffhome(driver);
		rdfh.Home().click();
		rdfh.Search().sendKeys(srch);
		rdfh.Submit().click();
		driver.quit();
	}
}
