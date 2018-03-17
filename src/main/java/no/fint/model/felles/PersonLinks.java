package no.fint.model.felles;

import lombok.Data;
import no.fint.Link;
import no.fint.model.felles.kodeverk.iso.Kjonn;
import no.fint.model.felles.kodeverk.iso.Landkode;
import no.fint.model.felles.kodeverk.iso.Sprak;

import java.util.List;

@Data
public class PersonLinks {
    private List<Link<Landkode>> statsborgerskap;
    private List<Link<Kjonn>> kjonn;
    private List<Link<Sprak>> malform;
    private List<Link<Sprak>> morsmal;
}
