// Built from tag v2.7.0

package no.fint.model.resource.felles;

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

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.felles.kompleksedatatyper.AdresseResource;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Personnavn;
import no.fint.model.resource.felles.basisklasser.AktorResource;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class PersonResource extends AktorResource implements FintMainObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = super.getNestedResources();
        if (bostedsadresse != null) {
            result.add(bostedsadresse);
        }
        return result;
    }
    private String bilde;
    private AdresseResource bostedsadresse;
    private Date fodselsdato;
    @NonNull
    private Identifikator fodselsnummer;
    @NonNull
    private Personnavn navn;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addStatsborgerskap(Link link) {
        addLink("statsborgerskap", link);
    }
    public void addKjonn(Link link) {
        addLink("kjonn", link);
    }
    public void addMalform(Link link) {
        addLink("malform", link);
    }
    public void addPersonalressurs(Link link) {
        addLink("personalressurs", link);
    }
    public void addMorsmal(Link link) {
        addLink("morsmal", link);
    }
    public void addElev(Link link) {
        addLink("elev", link);
    }
}
