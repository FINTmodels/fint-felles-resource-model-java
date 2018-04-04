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

import no.fint.model.felles.kompleksedatatyper.Adresse;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class AdresseResource extends Adresse implements FintLinks {
    public static AdresseResource create(Adresse other) {
        if (other == null) {
            return null;
        }
        if (other instanceof AdresseResource) {
            return (AdresseResource)other;
        }
        AdresseResource result = new AdresseResource();
        result.setAdresselinje(other.getAdresselinje());
        result.setPostnummer(other.getPostnummer());
        result.setPoststed(other.getPoststed());
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addLand(Link link) {
        addLink("land", link);
    }
}
