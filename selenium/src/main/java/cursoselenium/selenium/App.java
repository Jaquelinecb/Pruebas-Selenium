package cursoselenium.selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "COOLTESTERS!" );
        String exepath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
        System.setProperty("webdriver.chrome.driver", exepath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();//Inicializando el driver
        driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");
        
        
        
    }
}
