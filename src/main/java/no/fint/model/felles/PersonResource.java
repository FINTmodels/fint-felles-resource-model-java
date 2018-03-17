package no.fint.model.felles;

import lombok.*;
import no.fint.model.felles.kompleksedatatyper.AdresseResource;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PersonResource extends Person {
    @Getter
    @Setter
    private AdresseResource bostedsadresse;
    @Getter
    @Setter
    private AdresseResource postadresse;

    @Getter
    private PersonLinks _links;

    public void setLinks(PersonLinks personLinks) {
        _links = personLinks;
    }

}
