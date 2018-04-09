// Built from tag v2.6.0

package no.fint.model.resource.felles.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FylkeResources extends AbstractCollectionResources<FylkeResource> {

    @Override
    public TypeReference<List<FylkeResource>> getTypeReference() {
        return new TypeReference<List<FylkeResource>>() {};
    }
}
