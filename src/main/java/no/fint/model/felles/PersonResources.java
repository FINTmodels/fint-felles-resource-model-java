package no.fint.model.felles;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode
@ToString(callSuper = true)
public class PersonResources {
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

    private class EmbeddedResource {
        @Getter
        private List<PersonResource> _entires = new ArrayList<>();
    }
}
