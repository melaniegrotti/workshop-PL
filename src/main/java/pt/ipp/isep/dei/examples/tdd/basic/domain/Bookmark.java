package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

public class Bookmark {

    public boolean validate(String stringForUrl) throws MalformedURLException {
        URL urlToTest = new URL(stringForUrl);
        return true;
    }

    public void addURLToList(URL urlForList, List<URL> urlList1) throws MalformedURLException {
        urlList1.add(urlForList);
    }

    public void addTagToUrl(HashMap<String, URL> hashMap, URL urlForHashMap, String tag){
        hashMap.put(tag, urlForHashMap);
    }

    public URL findingATaggedURL(HashMap<String, URL> hashMap, String tag){
        URL urlFound = null;
        urlFound = (URL)hashMap.get(tag);
        return urlFound;
    }

    public void addHashToHash(HashMap<String, HashMap<URL, Integer>> urlHash, String tag, HashMap<URL, Integer> ratingHash, URL url, Integer rating ){
        ratingHash.put(url, rating);
        urlHash.put(tag, ratingHash);
    }

}
