package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        String baseUrl = "https://civr.appian.community/suite/";

        //System Path
        System.setProperty("webdriver.chrome.driver","C:\\swdtools\\driver\\chromedriver.exe");

        //Declaration
        WebDriver driver= new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println("URL entered");

        //Enter Username
      /*input placeholder="Username" id="un" name="un" type="text" value="" size="34"
         autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false">*/

        //Click on button
   /*     <input type="submit" class="btn primary" value="Sign In"
    onclick="return login_jsp.saveRemember &amp;&amp; login_jsp.saveRemember() || true;">*/
        //xpath syntax
        //  "//tagname[@attribute='value']"
        //  "//input[@type='submit']"

      //  driver.findElement(By.xpath("//input[@type='submit']")).click();

        

    }
}
