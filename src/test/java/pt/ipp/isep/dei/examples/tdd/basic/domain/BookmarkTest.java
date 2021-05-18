package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookmarkTest {

    @Test
    public void ensureURLIsValid() throws MalformedURLException {

        //Arrange
        String stringUrl = "http://opera.org.au/whats-on/brisbane";

        //Act
        boolean result = new Bookmark().validate(stringUrl);

        //Assert
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings= {"http://opera.org.au/whats-on/brisbane", "https://en.wikipedia.org/wiki/Guinea_pig", "https://www.fisheries.noaa.gov/species/hawksbill-turtle"})
    public void ensureURLIsValidParamTest(String testString) throws MalformedURLException{
        //Act
        boolean result = new Bookmark().validate(testString);
        //Assert
        assertTrue(result);
    }


    @Test
    public void ensureAddUrlToListWorks() throws MalformedURLException {
        //Arrange
        List<URL> testUrlList = new ArrayList<URL>();
        URL testUrl = new URL("http://opera.org.au/whats-on/brisbane");
        int expectedResult = 1;

        //Act
        //expected Result = sizeofList == 1;
        Bookmark bookmark = new Bookmark();
        bookmark.addURLToList(testUrl, testUrlList);
        int result = testUrlList.size();

        //Assert
        assertEquals(expectedResult, result);
    }

    // put, get for HashMap
    @Test
    public void ensureAddingATagToUrlWorks() throws MalformedURLException {
        //Arrange
        HashMap<String, URL> hashMapTest = new HashMap<String, URL>();
        String tagTest = "Hamster";
        URL urltest = new URL("https://en.wikipedia.org/wiki/Hamster");
        int expectedResult = 1; // sizeOf()

        //Act
        Bookmark bookmark = new Bookmark();
        bookmark.addTagToUrl(hashMapTest, urltest, tagTest);
        int result = hashMapTest.size();

        //Assert
        assertEquals(expectedResult, result);
    }


    @Test
    public void ensureFindingATaggedUrlWorks() throws MalformedURLException {
        //Arrange
        HashMap<String, URL> testingHashMap = new HashMap<String, URL>();
        String tagTest = "PetCare";
        URL urlTest = new URL("https://en.wikipedia.org/wiki/Hamster");
        testingHashMap.put(tagTest, urlTest);
        URL expectedResult =  new URL("https://en.wikipedia.org/wiki/Hamster");

        //Act
        Bookmark bookmark = new Bookmark();
        URL result = bookmark.findingATaggedURL(testingHashMap, tagTest);

        //Assert
        assertEquals(expectedResult, result);

    }
    @Test
    public void ensureAddingRatingToUrlWorks() throws MalformedURLException {
        //Arrange
        HashMap<URL, Integer> hashMapTest = new HashMap<URL, Integer>();
        URL urltest = new URL("https://en.wikipedia.org/wiki/Hamster");
        Integer testInt = 0;
        int expectedResult = 1;

        //Act
        Bookmark bookmark = new Bookmark();
        bookmark.addRatingToUrl(hashMapTest, urltest, testInt);
        int result = hashMapTest.size();

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureIncreaseRatingWorks() throws MalformedURLException {
        //Arrange
        HashMap<URL, Integer> hashMapTest = new HashMap<URL, Integer>();
        URL urltest = new URL("https://en.wikipedia.org/wiki/Hamster");
        Integer testInt = 0;
        Integer expectedResult = 1;
        hashMapTest.put(urltest, testInt);

        //Act
        Bookmark bookmark = new Bookmark();
        bookmark.increaseRating(hashMapTest, urltest);
        Integer result= hashMapTest.get(urltest);

        //Assert
        assertEquals(result, expectedResult);
    }

    @Test
    public void checkIfUrlExists() throws MalformedURLException {
        //Arrange
        HashMap<String, URL> testingHashMap = new HashMap<String, URL>();
        String tagTest = "PetCare";
        URL urlTest = new URL("https://en.wikipedia.org/wiki/Hamster");
        testingHashMap.put(tagTest, urlTest);
        URL expectedResult =  new URL("https://en.wikipedia.org/wiki/Hamster");

        //Act
        Bookmark bookmark = new Bookmark();
        URL result = bookmark.findingDuplicateUrl(testingHashMap, urlTest);

        //Assert
        assertEquals(expectedResult, result);

    }

    @Test
    public void checkIfUrlIsSecureWorks() throws MalformedURLException{
        // Arrange
        HashMap<String, URL> testingHashMap = new HashMap<String, URL>();
        String tagTest = "PetCare";
        URL urlTest = new URL("https://en.wikipedia.org/wiki/Hamster");
        testingHashMap.put(tagTest, urlTest);
        int expectedResult = 1;

        // Act
        Bookmark bookmark = new Bookmark();
        int result = bookmark.urlIsSecure(testingHashMap);

        // Arrange
        assertEquals(expectedResult, result);
    }

}

