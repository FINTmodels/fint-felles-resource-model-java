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

import no.fint.model.felles.kompleksedatatyper.Personnavn;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class PersonnavnResource extends Personnavn implements FintLinks {
    public static PersonnavnResource create(Personnavn other) {
        if (other == null) {
            return null;
        }
        if (other instanceof PersonnavnResource) {
            return (PersonnavnResource)other;
        }
        PersonnavnResource result = new PersonnavnResource();
        result.setEtternavn(other.getEtternavn());
        result.setFornavn(other.getFornavn());
        result.setMellomnavn(other.getMellomnavn());
        return result;
    }

    // Links
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
