package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Setup;

public class P02_MovieDetails extends Setup {


    // Scroll in movie details screen
    // Select specific review item
    // Expand it
    public void scrollToReview(String lastReview) {

        AndroidElement element = (AndroidElement) appiumDriver.findElement
                (MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + lastReview + "\").instance(0))"));
        element.click();
        action.tap(ElementOption.element(element)).perform();
    }

    public WebElement expandReviewIcon() {
        return appiumDriver.findElement(By.id("com.skydoves.themovies:id/expand_collapse"));
    }

    public void expandReviewItem() {
        expandReviewIcon().click();
    }

    public WebElement navigateUpBtn() {
        return appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    }

    public void clickNavigateUp() {
        navigateUpBtn().click();
    }


    //find the first video and swipe
    public void swipeTrailers(){


        AndroidElement firstVideo = (AndroidElement) appiumDriver.findElements(By.id("com.skydoves.themovies:id/item_video_cover")).get(0);
        action.press(ElementOption.element(firstVideo))
                .waitAction().moveTo(PointOption.point(-50, 250))
                .release()
                .perform();
    }

    public WebElement goBackBtn() {
        return appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    }

    public void clickGoBack() {
        goBackBtn().click();
    }
}
