package no.fint.model.felles;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import no.fint.Link;
import no.fint.Links;
import no.fint.model.felles.kodeverk.iso.Kjonn;
import no.fint.model.felles.kodeverk.iso.Landkode;
import no.fint.model.felles.kodeverk.iso.Sprak;
import no.fint.model.felles.kompleksedatatyper.AdresseResource;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PersonResource extends Person {
    Links<Landkode> statsborgerskap;
    Link<Kjonn> kjonn;
    Link<Sprak> malform;
    Link<Sprak> morsmal;

    AdresseResource bostedsadresseResource;
    AdresseResource postadresseResource;
}
