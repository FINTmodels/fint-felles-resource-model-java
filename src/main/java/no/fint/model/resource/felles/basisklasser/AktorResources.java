// Built from tag v2.8.0

package no.fint.model.resource.felles.basisklasser;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class AktorResources extends AbstractCollectionResources<AktorResource> {

    @Override
    public TypeReference<List<AktorResource>> getTypeReference() {
        return new TypeReference<List<AktorResource>>() {};
    }
}
