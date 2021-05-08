package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BookmarkTest {
public void ensureBookmarkCanBeAdded(){
    //Arrange
    List<URL> listURL = new ArrayList<>();
    try {
        URL ausOpera = new URL("http", "opera.org.au", "/whats-on/brisbane/");
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }


    //Act

    //Assert
    }


    //public void ensureURIIsValid

    //Arrange

    //Act

    //Assert



}

