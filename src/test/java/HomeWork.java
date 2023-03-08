import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver  wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        // by tag name
        WebElement el= wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("div"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("div"));

        WebElement el1 = wd.findElement(By.tagName("form"));
        WebElement element1 = wd.findElement(By.cssSelector("form"));

        WebElement el2 = wd.findElement(By.tagName("input"));
        WebElement element2 = wd.findElement(By.cssSelector("input"));

        List<WebElement> list2 = wd.findElements(By.tagName("input"));
        List<WebElement> list3 = wd.findElements(By.cssSelector("input"));

        WebElement el3 = wd.findElement(By.tagName("br"));
        WebElement element3 = wd.findElement(By.cssSelector("br"));

        WebElement el4 = wd.findElement(By.tagName("h1"));
        WebElement element4 = wd.findElement(By.cssSelector("h1"));

        WebElement el5 = wd.findElement(By.tagName("a"));
        WebElement element5 = wd.findElement(By.cssSelector("a"));

        // by class

         WebElement divcontainer = wd.findElement(By.tagName("container"));
         WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));

        WebElement divnavbar = wd.findElement(By.tagName("navbar-component_nav__1X_4m"));
        WebElement divnavbar1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement aclass= wd.findElement(By.tagName("active"));
        WebElement aclass1 = wd.findElement(By.cssSelector(".active"));

        WebElement divloglog = wd.findElement(By.tagName("login_login__3EHKB"));
        WebElement divloglog1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        //By id
        WebElement root = wd.findElement(By.tagName("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));
        // by attribute
        WebElement a1 = wd.findElement(By.cssSelector("[href='/home]"));
        WebElement a2 = wd.findElement(By.cssSelector("[href='/about]"));
        WebElement a3 = wd.findElement(By.cssSelector("[href='/login]"));
        WebElement inputE = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inputP = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement buttonL = wd.findElement(By.name("login"));
        WebElement buttonR = wd.findElement(By.cssSelector("[name='registration']"));
        List<WebElement> list4 = wd.findElements(By.cssSelector("[type='submit']"));
        WebElement divClass = wd.findElement(By.cssSelector("[class='login_login__3EHKB']"));

        // one of elements find by attribute ==> start & end & contains value
        // start
        wd.findElement(By.cssSelector("[class ^='login']"));
        // end
        wd.findElement(By.cssSelector("[class $='login__']"));
        // contains
        wd.findElement(By.cssSelector("[class  *='3EHKB']"));
    }
}
