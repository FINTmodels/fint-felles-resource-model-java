// Built from tag v3.5.0

package no.fint.model.resource.felles;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.felles.kompleksedatatyper.Personnavn;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class KontaktpersonResource implements FintMainObject, FintLinks {
    // Attributes
    @Deprecated
    @NonNull
    private Boolean foreldreansvar;
    private Kontaktinformasjon kontaktinformasjon;
    private Personnavn navn;
    @NonNull
    private Identifikator systemId;
    @NonNull
    private String type;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getKontaktperson() {
        return getLinks().getOrDefault("kontaktperson", Collections.emptyList()); 
    }
    public void addKontaktperson(Link link) {
        addLink("kontaktperson", link);
    }
    @Deprecated
    @JsonIgnore
    public List<Link> getPerson() {
        return getLinks().getOrDefault("person", Collections.emptyList()); 
    }
    @Deprecated
    public void addPerson(Link link) {
        addLink("person", link);
    }
}
