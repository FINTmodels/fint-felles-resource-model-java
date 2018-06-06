// Built from tag v3.0.0-rc-1

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
