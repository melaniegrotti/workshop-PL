package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.net.MalformedURLException;
import java.net.URL;

public class Bookmark {

    public boolean validate(String stringForUrl){

        try {
            URL urlToTest = new URL(stringForUrl);
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
