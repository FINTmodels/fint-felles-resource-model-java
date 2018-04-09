// Built from tag v2.6.0

package no.fint.model.resource.felles.basisklasser;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class EnhetResources extends AbstractCollectionResources<EnhetResource> {

    @Override
    public TypeReference<List<EnhetResource>> getTypeReference() {
        return new TypeReference<List<EnhetResource>>() {};
    }
}
