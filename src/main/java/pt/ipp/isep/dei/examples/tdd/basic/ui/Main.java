package pt.ipp.isep.dei.examples.tdd.basic.ui;

import pt.ipp.isep.dei.examples.tdd.basic.domain.Bookmark;
import pt.ipp.isep.dei.examples.tdd.basic.domain.Calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Calculator calculator = new Calculator();
        //System.out.println(calculator.sum(3, 4));
        Bookmark bookmark = new Bookmark();
        List<URL> urlList = new ArrayList<URL>();
        HashMap<String, URL> hashMap = new HashMap<String, URL>();

        // VALIDATE URL
        String url1 = "https://www.britannica.com/animal/hamster";
        String url2 = "https://en.wikipedia.org/wiki/Hamster";
        String url3 = "https://www.livescience.com/27169-hamsters.html";

        try {
            bookmark.validate(url1);
            bookmark.validate(url2);
            bookmark.validate(url3);
        } catch (MalformedURLException e ) {
            System.out.println("Invalid URL");
        }

        // ADD URL TO LIST
        try {
            URL url11 = new URL("https://www.britannica.com/animal/hamster");
            URL url22 = new URL("https://en.wikipedia.org/wiki/Hamster");
            URL url33 = new URL("https://www.livescience.com/27169-hamsters.html");
            bookmark.addURLToList(url11, urlList);
            bookmark.addURLToList(url22, urlList);
            bookmark.addURLToList(url33, urlList);
            System.out.println(urlList);
        } catch (MalformedURLException e){
            System.out.println("Invalid URL");
        }

        // ADD KEY + VALUE TO HASHMAP
        String tag1 = "PetCare";
        String tag2 = "Culture";
        try {
            URL urlForTag1 = new URL("https://www.britannica.com/animal/hamster");
            URL urlForTag2 = new URL("http://opera.org.au/whats-on/brisbane");
            bookmark.addTagToUrl(hashMap, urlForTag1, tag1);
            bookmark.addTagToUrl(hashMap, urlForTag2, tag2);
            System.out.println(hashMap);
        }catch (MalformedURLException e){
            System.out.println("Invalid Input");
        }

        //Searching a Tagged URL
        URL searchedURL = bookmark.findingATaggedURL(hashMap, tag1);
        System.out.println("The URL you searched for is " + searchedURL);


    }
}
