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

    public void addTagToUrl(HashMap hashMap, URL urlForHashMap, String tag){
        hashMap.put(tag, urlForHashMap);
    }

    public URL findingATaggedURL(HashMap hashMap, String tag){
        URL urlFound = null;

        return urlFound;
    }

}
