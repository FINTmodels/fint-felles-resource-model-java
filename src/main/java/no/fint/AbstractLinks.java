package no.fint;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class AbstractLinks {
    private LinkedHashMap<String, List<Link<?>>> customLinks;

    @JsonAnyGetter
    public LinkedHashMap<String, List<Link<?>>> getCustomLinks() {
        return customLinks;
    }

    public boolean containsCustomLinks() {
        return (customLinks != null && customLinks.size() > 0);
    }

    public void addRelasjon(String key, Link<?> link) {
        if (customLinks == null) {
            customLinks = new LinkedHashMap<>();
        }

        List<Link<?>> links = customLinks.get(key);
        if (links == null) {
            links = new ArrayList<>();
        }

        links.add(link);
        customLinks.put(key, links);
    }
}
