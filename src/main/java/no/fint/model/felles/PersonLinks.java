package no.fint.model.felles;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.AbstractLinks;
import no.fint.Link;
import no.fint.model.felles.kodeverk.iso.Kjonn;
import no.fint.model.felles.kodeverk.iso.Landkode;
import no.fint.model.felles.kodeverk.iso.Sprak;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonLinks extends AbstractLinks {
    private List<Link<Landkode>> statsborgerskap;
    private List<Link<Kjonn>> kjonn;
    private List<Link<Sprak>> malform;
    private List<Link<Sprak>> morsmal;
}
