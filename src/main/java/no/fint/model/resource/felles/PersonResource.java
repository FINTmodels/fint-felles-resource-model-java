package no.fint.model.resource.felles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import no.fint.model.felles.Person;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.felles.kompleksedatatyper.AdresseResource;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PersonResource extends Person implements FintLinks {
    @Getter
    private final Map<String, List<Link>> links = Collections.synchronizedMap(new LinkedHashMap<>());

    @Getter
    private AdresseResource bostedsadresse;
    @Getter
    private AdresseResource postadresse;

    public void addStatsborgerskap(Link link) {
        addLink("statsborgerskap", link);
    }

    public void addKjonn(Link link) {
        addLink("kjonn", link);
    }

    public void addMalform(Link link) {
        addLink("malform", link);
    }

    public void addMorsmal(Link link) {
        addLink("morsmal", link);
    }

    @JsonSetter
    public void setBostedsadresse(AdresseResource bostedsadresse) {
        this.bostedsadresse = bostedsadresse;
    }

    @JsonIgnore
    @Override
    public void setBostedsadresse(Adresse bostedsadresse) {
        this.bostedsadresse = new AdresseResource(bostedsadresse);
    }

    @JsonSetter
    public void setPostadresse(AdresseResource postadresse) {
        this.postadresse = postadresse;
    }

    @JsonIgnore
    @Override
    public void setPostadresse(Adresse postadresse) {
        this.postadresse = new AdresseResource(postadresse);
    }

}
