package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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
    public void ensureAddUrlToListWorks() throws MalformedURLException{
        //Arrange
        List<URL> testUrlList = new ArrayList<URL>();
        URL testUrl = new URL("http://opera.org.au/whats-on/brisbane");
        int expectedResult = 1;

        //Act
        //expected Result = sizeofList == 1;
         testUrlList.Bookmark().addURLToList(testUrl);
          int result = testUrlList.size();
        //Assert
        assertEquals(expectedResult, result);
    }


}

