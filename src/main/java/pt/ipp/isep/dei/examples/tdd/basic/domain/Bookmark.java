package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Bookmark {

    List <URL> urlList = new ArrayList<URL>();

    String url1 = "https://www.britannica.com/animal/hamster";
    String url2 = "https://en.wikipedia.org/wiki/Hamster";
    String url3 = "https://www.livescience.com/27169-hamsters.html";



    public boolean validate(String stringForUrl) throws MalformedURLException {
            URL urlToTest = new URL(stringForUrl);
            return true;

    }

    public void addURLToList(URL urlForList) throws MalformedURLException {

    }

}
