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

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class IdentifikatorResource extends Identifikator implements FintLinks {
    public static IdentifikatorResource create(Identifikator other) {
        if (other == null) {
            return null;
        }
        if (other instanceof IdentifikatorResource) {
            return (IdentifikatorResource)other;
        }
        IdentifikatorResource result = new IdentifikatorResource();
        result.setGyldighetsperiode(other.getGyldighetsperiode());
        result.setIdentifikatorverdi(other.getIdentifikatorverdi());
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
