package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.net.MalformedURLException;
import java.net.URL;
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
    public void ensureURLIsValid() {

        //Arrange
        String stringUrl = "http://opera.org.au/whats-on/brisbane";

        //Act
        boolean result = new Bookmark().validate(stringUrl);

        //Assert
        assertTrue(result);

    }


}

