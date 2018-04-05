// Built from tag v2.6.0

package no.fint.model.resource.felles.kompleksedatatyper;

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

import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AdresseResource implements FintComplexDatatypeObject, FintLinks {
    // Attributes
    @NonNull
    private List<String> adresselinje;
    private String postnummer;
    private String poststed;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addLand(Link link) {
        addLink("land", link);
    }
}
