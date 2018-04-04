// Built from tag v2.6.0

package no.fint.model.resource.felles.kompleksedatatyper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;

import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class KontaktinformasjonResource extends Kontaktinformasjon implements FintLinks {
    public static KontaktinformasjonResource create(Kontaktinformasjon other) {
        if (other == null) {
            return null;
        }
        if (other instanceof KontaktinformasjonResource) {
            return (KontaktinformasjonResource)other;
        }
        KontaktinformasjonResource result = new KontaktinformasjonResource();
        result.setEpostadresse(other.getEpostadresse());
        result.setMobiltelefonnummer(other.getMobiltelefonnummer());
        result.setNettsted(other.getNettsted());
        result.setSip(other.getSip());
        result.setTelefonnummer(other.getTelefonnummer());
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
