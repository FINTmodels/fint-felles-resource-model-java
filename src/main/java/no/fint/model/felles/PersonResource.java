package no.fint.model.felles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import no.fint.Link;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.AdresseResource;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PersonResource extends Person implements FintLinks {
    @Getter
    private AdresseResource bostedsadresse;
    @Getter
    private AdresseResource postadresse;

    @Getter
    private PersonLinks _links;

    @JsonSetter("_links")
    public void setLinks(PersonLinks personLinks) {
        _links = personLinks;
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

    @JsonIgnore
    @Override
    public List<List<? extends Link>> getLinkLists() {
        List<List<? extends Link>> linkLists = new ArrayList<>();
        linkLists.add(_links.getKjonn());
        linkLists.add(_links.getMalform());
        linkLists.add(_links.getMorsmal());
        linkLists.add(_links.getStatsborgerskap());
        return linkLists;
    }
}
