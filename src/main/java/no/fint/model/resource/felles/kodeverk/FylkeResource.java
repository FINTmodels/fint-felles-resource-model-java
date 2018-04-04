// Built from tag v2.6.0

package no.fint.model.resource.felles.kodeverk;

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

import no.fint.model.felles.kodeverk.Fylke;
import no.fint.model.felles.basisklasser.Begrep;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class FylkeResource extends Fylke implements FintLinks {
    public static FylkeResource create(Fylke other) {
        if (other == null) {
            return null;
        }
        if (other instanceof FylkeResource) {
            return (FylkeResource)other;
        }
        FylkeResource result = new FylkeResource();
        result.setGyldighetsperiode(other.getGyldighetsperiode());
        result.setKode(other.getKode());
        result.setNavn(other.getNavn());
        result.setPassiv(other.getPassiv());
        result.setSystemId(other.getSystemId());
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addKommune(Link link) {
        addLink("kommune", link);
    }
}
