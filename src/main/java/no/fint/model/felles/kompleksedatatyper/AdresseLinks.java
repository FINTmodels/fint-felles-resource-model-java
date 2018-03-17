package no.fint.model.felles.kompleksedatatyper;

import lombok.Data;
import no.fint.Link;
import no.fint.model.felles.kodeverk.iso.Landkode;

import java.util.List;

@Data
public class AdresseLinks {
    private List<Link<Landkode>> land;
}
