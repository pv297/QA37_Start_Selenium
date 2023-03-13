import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver  wd;

    @BeforeClass
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        wd = new ChromeDriver(options);
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        // by tag name
        WebElement el= wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));
        WebElement xElement =wd.findElement(By.xpath("//button"));


        List<WebElement> list = wd.findElements(By.tagName("div"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("div"));
        List<WebElement> xList1 = wd.findElements(By.xpath("//div"));

        WebElement el1 = wd.findElement(By.tagName("form"));
        WebElement element1 = wd.findElement(By.cssSelector("form"));
        WebElement xElement1 = wd.findElement(By.xpath("//form"));

        WebElement el2 = wd.findElement(By.tagName("input"));
        WebElement element2 = wd.findElement(By.cssSelector("input"));
        WebElement xElement2 = wd.findElement(By.xpath("//input"));

        List<WebElement> list2 = wd.findElements(By.tagName("input"));
        List<WebElement> list3 = wd.findElements(By.cssSelector("input"));
        List<WebElement> xList3 = wd.findElements(By.xpath("//input"));

        WebElement el3 = wd.findElement(By.tagName("br"));
        WebElement element3 = wd.findElement(By.cssSelector("br"));
        WebElement xElement3 = wd.findElement(By.xpath("//br"));

        WebElement el4 = wd.findElement(By.tagName("h1"));
        WebElement element4 = wd.findElement(By.cssSelector("h1"));
        WebElement xElement4 = wd.findElement(By.xpath("//h1"));

        WebElement el5 = wd.findElement(By.tagName("a"));
        WebElement element5 = wd.findElement(By.cssSelector("a"));
        WebElement xElement5 = wd.findElement(By.xpath("//a"));

        // by class

        WebElement divContainer = wd.findElement(By.tagName("container"));
        WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));
        WebElement xDivContainer1   = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement divNav = wd.findElement(By.tagName("navbar-component_nav__1X_4m"));
        WebElement divNav1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement xDivNav = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement aClass= wd.findElement(By.tagName("active"));
        WebElement aClass1 = wd.findElement(By.cssSelector(".active"));
        WebElement el15 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement divLog = wd.findElement(By.tagName("login_login__3EHKB"));
        WebElement divLog1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement xDivLog = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //By id
        WebElement root = wd.findElement(By.tagName("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));
        WebElement xRoot = wd.findElement(By.xpath("//*[@id='root']"));
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
        wd.findElement(By.cssSelector("[class ^='login']"));//start

        WebElement element19 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el9 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        // end WebElement el9 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        wd.findElement(By.cssSelector("[class $='login']")); // end
        WebElement element20 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement el10 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));


        WebElement element21 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        // contains
        wd.findElement(By.cssSelector("[class  *='3EHKB']"));//contains
        WebElement element22 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement el11 = wd.findElement(By.xpath("//input[contains(@placeholder,'ss')]"));
        wd.findElement(By.xpath("//a[3]"));
    }
}
