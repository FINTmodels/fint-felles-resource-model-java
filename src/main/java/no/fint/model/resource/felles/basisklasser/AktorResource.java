// Built from tag v2.6.0

package no.fint.model.resource.felles.basisklasser;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import no.fint.model.FintAbstractObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.resource.felles.kompleksedatatyper.AdresseResource;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class AktorResource implements FintAbstractObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (postadresse != null) {
            result.add(postadresse);
        }
        return result;
    }
    private Kontaktinformasjon kontaktinformasjon;
    private AdresseResource postadresse;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
