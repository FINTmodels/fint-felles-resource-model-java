// Built from tag v3.0.0-rc-1

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
