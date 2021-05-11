package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookmarkTest {

    // Integration Test?
    /*String protocol = "http";
        String host = "opera.org.au";
        String file = "/whats-on/brisbane";
        */

    /*  @Test
        public void ensureBookmarkCanBeAdded() {
        //Arrange
        List<URL> expectedURLList = new ArrayList<>();
        try {
            URL ausOpera = new URL("http", "opera.org.au", "/whats-on/brisbane/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //Act
        expectedURLList.add();

        //Assert
    } */

    @Test
    public void ensureURLIsValid() throws MalformedURLException {

        //Arrange
        String stringUrl = "http://opera.org.au/whats-on/brisbane";

        //Act
        boolean result = new Bookmark().validate(stringUrl);

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

    @ParameterizedTest



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

}

