// Built from tag v3.0.0-rc-1

package no.fint.model.resource.felles.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class KommuneResources extends AbstractCollectionResources<KommuneResource> {

    @Override
    public TypeReference<List<KommuneResource>> getTypeReference() {
        return new TypeReference<List<KommuneResource>>() {};
    }
}
