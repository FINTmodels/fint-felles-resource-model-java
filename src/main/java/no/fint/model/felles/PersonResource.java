package no.fint.model.felles;

import lombok.*;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.AdresseResource;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PersonResource extends Person {
    @Getter
    private AdresseResource bostedsadresse;
    @Getter
    @Setter
    private AdresseResource postadresse;

    @Getter
    private PersonLinks _links;

    public void setLinks(PersonLinks personLinks) {
        _links = personLinks;
    }

    public void setBostedsadresse(AdresseResource bostedsadresse) {
        this.bostedsadresse = bostedsadresse;
    }

    public void setBostedsadresse(Adresse bostedsadresse) {
        this.bostedsadresse = new AdresseResource(bostedsadresse);
    }

}
