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

import no.fint.model.felles.kompleksedatatyper.Periode;
import java.util.Date;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class PeriodeResource extends Periode implements FintLinks {
    public static PeriodeResource create(Periode other) {
        if (other == null) {
            return null;
        }
        if (other instanceof PeriodeResource) {
            return (PeriodeResource)other;
        }
        PeriodeResource result = new PeriodeResource();
        result.setBeskrivelse(other.getBeskrivelse());
        result.setSlutt(other.getSlutt());
        result.setStart(other.getStart());
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
