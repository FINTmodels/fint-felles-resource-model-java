// Built from tag v2.8.0

package no.fint.model.resource.felles.kompleksedatatyper;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class AdresseResources extends AbstractCollectionResources<AdresseResource> {

    @Override
    public TypeReference<List<AdresseResource>> getTypeReference() {
        return new TypeReference<List<AdresseResource>>() {};
    }
}
