// Built from tag v3.0.0-rc-1

package no.fint.model.resource.felles;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class KontaktpersonResources extends AbstractCollectionResources<KontaktpersonResource> {

    @Override
    public TypeReference<List<KontaktpersonResource>> getTypeReference() {
        return new TypeReference<List<KontaktpersonResource>>() {};
    }
}
