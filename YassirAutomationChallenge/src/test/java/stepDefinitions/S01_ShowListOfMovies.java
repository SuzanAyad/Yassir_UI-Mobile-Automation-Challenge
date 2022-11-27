package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Setup;

import java.net.MalformedURLException;

public class S01_ShowListOfMovies extends Setup {


    @Given("user go to movies list screen")
    public void userGoToMoviesListScreen() throws MalformedURLException {
        Setup.setUp();
    }

    @When("user select movie item {string}")
    public void userSelectMovieItem(String movieName) {
        moviesList.scrollToMovieItem("Emily the Criminal");
    }

    @Then("user should be navigated to movie screen successfully")
    public void userShouldBeNavigatedToMovieScreenSuccessfully() {
        moviesList.assertSuccessfullyNavigatingToMovieDetailsScreen();

    }

}
