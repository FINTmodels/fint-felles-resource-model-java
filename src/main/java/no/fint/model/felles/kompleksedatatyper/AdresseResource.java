package no.fint.model.felles.kompleksedatatyper;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AdresseResource extends Adresse {
    @Getter
    private AdresseLinks _links;

    public AdresseResource(Adresse adresse) {
        this.setPoststed(adresse.getPoststed());
        this.setAdresselinje(adresse.getAdresselinje());
        this.setPostnummer(adresse.getPostnummer());
    }

    public void setLinks(AdresseLinks adresseLinks) {
        _links = adresseLinks;
    }
}
