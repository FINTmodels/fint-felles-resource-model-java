package no.fint.model.felles;

import no.fint.Link;

import java.util.LinkedHashMap;
import java.util.List;

public interface FintLinks {
    List<List<? extends Link>> getLinkLists();
    default LinkedHashMap<String, List<Link<?>>> getCustomLinks() {
        return new LinkedHashMap<>();
    }
}
