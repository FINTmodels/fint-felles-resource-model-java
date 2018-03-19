package no.fint.test.model

import com.fasterxml.jackson.databind.ObjectMapper
import no.fint.Link
import no.fint.model.felles.Person
import no.fint.model.felles.PersonLinks
import no.fint.model.felles.PersonResource
import no.fint.model.felles.kodeverk.iso.Kjonn
import no.fint.model.felles.kodeverk.iso.Landkode
import no.fint.model.felles.kompleksedatatyper.Adresse
import no.fint.model.felles.kompleksedatatyper.AdresseLinks
import no.fint.model.felles.kompleksedatatyper.Identifikator
import no.fint.model.felles.kompleksedatatyper.Personnavn
import spock.lang.Specification

class ModelSerializationSpec extends Specification {
    def objectMapper = new ObjectMapper()

    def "Serialize Person without Links"() {
        given:
        def person = new Person(
                fodselsnummer: new Identifikator(identifikatorverdi: "12345678901"),
                navn: new Personnavn(fornavn: "Tore", etternavn: "Test"),
                fodselsdato: new Date(55, 5, 15),
                bostedsadresse: new Adresse(postnummer: "1234", poststed: "Test", adresselinje: [ "Storgata 12"])
        )

        when:
        def result = objectMapper.writeValueAsString(person)
        println(result)

        then:
        result.size() > 0
    }

    def "Serialize PersonResource with only own links"() {
        given:
        def person = new PersonResource(
                fodselsnummer: new Identifikator(identifikatorverdi: "12345678901"),
                navn: new Personnavn(fornavn: "Tore", etternavn: "Test"),
                fodselsdato: new Date(55, 5, 15),
                bostedsadresse: new Adresse(postnummer: "1234", poststed: "Test", adresselinje: [ "Storgata 12"])
        )
        def links = new PersonLinks(
                kjonn: [ new Link<Kjonn>(href: "/felles/kjonn/systemid/1") ],
                statsborgerskap: [ new Link<Landkode>(href: "/felles/land/systemid/no")]
        )
        person.setLinks(links)
        
        when:
        def result = objectMapper.writeValueAsString(person)
        println(result)

        then:
        result.size() > 0
    }

    def "Serialize PersonResource with deep links"() {
        given:
        def person = new PersonResource(
                fodselsnummer: new Identifikator(identifikatorverdi: "12345678901"),
                navn: new Personnavn(fornavn: "Tore", etternavn: "Test"),
                fodselsdato: new Date(55, 5, 15),
                bostedsadresse: new Adresse(postnummer: "1234", poststed: "Test", adresselinje: [ "Storgata 12"])
        )
        def links = new PersonLinks(
                kjonn: [ new Link<Kjonn>(href: "/felles/kjonn/systemid/1") ],
                statsborgerskap: [ new Link<Landkode>(href: "/felles/land/systemid/no")]
        )
        person.setLinks(links)
        person.bostedsadresse.setLinks(new AdresseLinks(
                land: [ new Link<Landkode>(href: "/felles/land/systemid/no") ]
        ))

        when:
        def result = objectMapper.writeValueAsString(person)
        println(result)

        then:
        result.size() > 0

    }
}
