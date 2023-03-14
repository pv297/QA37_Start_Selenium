import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;


public class ClassWork {
    WebDriver  wd;

    @BeforeClass
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(options);
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void classwork(){
        // parent
        WebElement el =wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 =wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 =wd.findElement(By.xpath("//h1/.."));

        // ancestor предки
        WebElement el3 =wd.findElement(By.xpath("//h1/ancestor::*")); // all
        WebElement el4 =wd.findElement(By.xpath("//h1/ancestor::div")); // two options
        WebElement el5 =wd.findElement(By.xpath("//h1/ancestor::div[2]")); // one option

        // ancestor and self (plus one more)
        WebElement el6= wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement >list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling

        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));
        //preceding-sibling
        WebElement el7=wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        List<WebElement> list2=wd.findElements(By.xpath("//a[@href='/login']/preceding-sibling::a"));



    }

    @Test
    public void classwork2(){

        WebElement element = wd.findElement(By.cssSelector("[name='login']"));

        String text =element.getText(); // get from innerText
        System.out.println(text);

        WebElement form =wd.findElement(By.xpath("//form"));
        String  textForm =form.getText();
        System.out.println("**************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String  textall = html.getText();
        System.out.println("**************");
        System.out.println(textall);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text br--->"+br.getText());
    }
}
