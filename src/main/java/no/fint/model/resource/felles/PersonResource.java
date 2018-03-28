// Built from tag v2.6.0-rc-1

package no.fint.model.resource.felles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;

import no.fint.model.felles.Person;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Personnavn;
import no.fint.model.felles.basisklasser.Aktor;
import no.fint.model.resource.felles.kompleksedatatyper.AdresseResource;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class PersonResource extends Person implements FintLinks {
    // Resources
    @Getter
    private AdresseResource bostedsadresse;
    @JsonSetter
    public void setBostedsadresse(AdresseResource _bostedsadresse) {
        this.bostedsadresse = _bostedsadresse;
    }
    @JsonIgnore
    @Override
    public void setBostedsadresse(Adresse _bostedsadresse) {
        this.bostedsadresse = new AdresseResource(_bostedsadresse);
    }

    // Links
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
