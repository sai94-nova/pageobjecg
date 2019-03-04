package com.nova1.pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import google.googleutils;
import rediff.rediffhome;
import rediff.rediffhomeutils;
import rediff.redifflogin;
import rediff.rediffloginutils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        login();
        /*System.setProperty("webdriver.chrome.driver", "D:\\\\Downloaded\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        redifflogin rdl=new redifflogin(driver);
        rdl.Emaild().sendKeys("sam");
        rdl.Password().sendKeys("jackson");
        rediffhome rdh=new rediffhome(driver);
        rdh.Search().sendKeys("smartphone");
        rdh.Submit().click();
        driver.quit();*/
        //googleutils glf=new googleutils();
        //glf.logsdata();
    }
    @Test
    public static void login() throws Exception {
    	WebDriver driver = null;
    	rediffloginutils rdl=new rediffloginutils();
    	rdl.logsdata();
    	rediffhomeutils fdh=new rediffhomeutils();
    	fdh.logsdata();
    	
    }
}
