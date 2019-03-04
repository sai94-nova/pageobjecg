package rediff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class rediffloginutils {
	public int rowcnt;
	public void logsdata() throws Exception {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(".//book.xlsx");
		// Connection connection=fillo.getConnection(path);
		String strQuery = "Select * from Sheet1";
		Recordset recordset = connection.executeQuery(strQuery);

		while (recordset.next()) {
			System.out.println(" " + recordset.getField("user") + " " + recordset.getField("pass"));
			String con = recordset.getField("user");
			String st = recordset.getField("pass");
			login(con,st);
		}

		rowcnt = recordset.getCount();
		System.out.println(rowcnt);

		recordset.close();
		connection.close();
	}
	
	public void login(String user,String pass) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\Downloaded\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		redifflogin rdl=new redifflogin(driver);
    	rdl.Emaild().sendKeys(user);
		rdl.Password().sendKeys(pass);
		
		driver.quit();
	}
}
