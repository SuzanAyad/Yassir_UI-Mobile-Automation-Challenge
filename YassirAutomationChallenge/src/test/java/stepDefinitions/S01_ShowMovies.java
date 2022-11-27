package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Setup;

import java.net.MalformedURLException;

public class S01_ShowMovies extends Setup {


    @Given("user go to movies list screen")
    public void userGoToMoviesListScreen() throws MalformedURLException {
        Setup.setUp();
    }

    @When("user select movie item {string}")
    public void userSelectMovieItem(String movieName) {
        moviesList.scrollDownAndSelectMovieItem("Emily the Criminal");
    }

    @And("user should be navigated to movie screen successfully")
    public void userShouldBeNavigatedToMovieScreenSuccessfully() {
        moviesList.assertSuccessfullyNavigatingToMovieDetailsScreen();
    }

    @And("user scroll in movie details screen and expand last review item {string}")
    public void userScrollInMovieDetailsScreenAndExpandLastReviewItem(String lastReviewName) {
        movieDetails.scrollToReview("MSB");
        movieDetails.expandReviewItem();
    }

    @And("user clicks navigate up button to go back to movies list screen")
    public void userClicksNavigateUpButtonToGoBackToMoviesListScreen() {
        movieDetails.clickNavigateUp();
    }

    @And("user select first movie in movies list {string}")
    public void userSelectFirstMovieInMoviesList(String firstMovieItemName) {
        moviesList.scrollUpAndSelectFirstMovieItem("Disenchanted");
    }

    @And("user swipe Trailers")
    public void userSwipeTrailers() throws InterruptedException {
        movieDetails.swipeTrailers();
    }

    @Then("user go back to movies list screen")
    public void userGoBackToMoviesListScreen() {
        movieDetails.clickGoBack();
    }
}
