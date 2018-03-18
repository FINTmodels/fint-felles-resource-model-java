package no.fint.model.felles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import no.fint.Link;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode
@ToString(callSuper = true)
public class PersonResources implements FintLinks {
    @Getter
    private EmbeddedResource _embedded = new EmbeddedResource();

    @Getter
    private CollectionLinks _links;

    public int getTotal_items() {
        return _embedded._entires.size();
    }

    public void setLinks(CollectionLinks collectionLinks) {
        _links = collectionLinks;
    }

    public void addResource(PersonResource personResource) {
        _embedded._entires.add(personResource);
    }

    @JsonIgnore
    @Override
    public List<List<? extends Link>> getLinkLists() {
        List<List<? extends Link>> linkLists = new ArrayList<>();
        linkLists.add(_links.getSelf());
        return linkLists;
    }

    private class EmbeddedResource {
        @Getter
        private List<PersonResource> _entires = new ArrayList<>();
    }
}
