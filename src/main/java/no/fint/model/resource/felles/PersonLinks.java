package no.fint.model.resource.felles;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kodeverk.iso.KjonnRelation;
import no.fint.model.felles.kodeverk.iso.LandkodeRelation;
import no.fint.model.felles.kodeverk.iso.SprakRelation;
import no.fint.model.resource.AbstractLinks;
import no.fint.model.resource.Link;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonLinks extends AbstractLinks {
    private List<Link<LandkodeRelation>> statsborgerskap;
    private List<Link<KjonnRelation>> kjonn;
    private List<Link<SprakRelation>> malform;
    private List<Link<SprakRelation>> morsmal;
}