package no.fint.model.resource.felles;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import no.fint.model.resource.AbstractResources;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PersonResources extends AbstractResources {
    @Getter
    private PersonResources.EmbeddedResource _embedded = new PersonResources.EmbeddedResource();

    public void addResource(PersonResource resource) {
        _embedded._entries.add(resource);
    }

    public int getTotalItems() {
        return _embedded._entries.size();
    }

    @NoArgsConstructor
    private class EmbeddedResource {
        @Getter
        private List<PersonResource> _entries = new ArrayList<>();
    }
}
