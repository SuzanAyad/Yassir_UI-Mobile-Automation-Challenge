package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.Setup;



// any test class should extend setup class, to be able to see @BeforeTest and @AfterTest from another package
public class P01_MoviesList extends Setup {


    // Scroll in movies list screen
    // Select specific movie item
    // Click on it
    public void scrollToMovieItem(String movieItem) {

        AndroidElement element = (AndroidElement) appiumDriver.findElement
                (MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + movieItem + "\").instance(0))"));
        element.click();
        action.tap(ElementOption.element(element)).perform();
    }


    // locate the movie title
    public WebElement movieTitle() {
        return appiumDriver.findElement(By.id("com.skydoves.themovies:id/detail_header_title"));
    }


    // Assert that user navigates to movie details screen
    public void assertSuccessfullyNavigatingToMovieDetailsScreen(){
        SoftAssert softAssert=new SoftAssert();
        String expectedAlertTxt ="Emily the Criminal";
        softAssert.assertTrue(movieTitle().getText().contains(expectedAlertTxt));
        softAssert.assertAll();
    }

}
