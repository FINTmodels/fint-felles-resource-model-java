package no.fint.model.resource.felles.kompleksedatatyper;

import lombok.Data;
import no.fint.model.relation.felles.kodeverk.iso.LandkodeRelation;
import no.fint.model.resource.Link;

import java.util.List;

@Data
public class AdresseLinks {
    private List<Link<LandkodeRelation>> land;
}
