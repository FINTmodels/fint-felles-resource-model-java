package no.fint.model.resource.felles.kompleksedatatyper;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AdresseResource extends Adresse implements FintLinks {
    @Getter
    private final Map<String, List<Link>> links = Collections.synchronizedMap(new LinkedHashMap<>());

    public AdresseResource(Adresse adresse) {
        this.setPoststed(adresse.getPoststed());
        this.setAdresselinje(adresse.getAdresselinje());
        this.setPostnummer(adresse.getPostnummer());
    }

    public void addLand(Link link) {
        addLink("land", link);
    }
}
