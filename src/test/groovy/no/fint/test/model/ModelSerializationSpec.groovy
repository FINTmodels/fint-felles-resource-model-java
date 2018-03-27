package no.fint.test.model

import com.fasterxml.jackson.databind.ObjectMapper
import groovy.json.JsonSlurper
import no.fint.model.felles.Person
import no.fint.model.felles.kompleksedatatyper.Adresse
import no.fint.model.felles.kompleksedatatyper.Identifikator
import no.fint.model.felles.kompleksedatatyper.Personnavn
import no.fint.model.resource.felles.Link
import no.fint.model.resource.felles.PersonResource
import spock.lang.Specification

class ModelSerializationSpec extends Specification {
    def objectMapper
    def jsonSlurper

    void setup() {
        objectMapper = new ObjectMapper()
        jsonSlurper = new JsonSlurper()
    }

    def "Serialize Person without Links"() {
        given:
        def person = new Person(
                fodselsnummer: new Identifikator(identifikatorverdi: "12345678901"),
                navn: new Personnavn(fornavn: "Tore", etternavn: "Test"),
                fodselsdato: new Date(55, 5, 15),
                bostedsadresse: new Adresse(postnummer: "1234", poststed: "Test", adresselinje: ["Storgata 12"])
        )

        when:
        def result = objectMapper.writeValueAsString(person)
        println(result)
        def object = jsonSlurper.parseText(result)

        then:
        object
        object.bostedsadresse.adresselinje
        object.navn.etternavn
    }

    def "Serialize PersonResource with only own links"() {
        given:
        def person = new PersonResource(
                fodselsnummer: new Identifikator(identifikatorverdi: "12345678901"),
                navn: new Personnavn(fornavn: "Tore", etternavn: "Test"),
                fodselsdato: new Date(55, 5, 15),
                bostedsadresse: new Adresse(postnummer: "1234", poststed: "Test", adresselinje: ["Storgata 12"])
        )
        person.addKjonn(Link.with("/felles/kjonn/systemid/1"))
        person.addStatsborgerskap(Link.with("/felles/land/systemid/no"))

        when:
        def result = objectMapper.writeValueAsString(person)
        println(result)
        def object = jsonSlurper.parseText(result)

        then:
        object
        object._links.statsborgerskap
    }

    def "Serialize PersonResource with deep links"() {
        given:
        def person = new PersonResource(
                fodselsnummer: new Identifikator(identifikatorverdi: "12345678901"),
                navn: new Personnavn(fornavn: "Tore", etternavn: "Test"),
                fodselsdato: new Date(55, 5, 15),
                bostedsadresse: new Adresse(postnummer: "1234", poststed: "Test", adresselinje: ["Storgata 12"])
        )
        person.addKjonn(new Link(href: "/felles/kjonn/systemid/1"))
        person.addStatsborgerskap(new Link(href: "/felles/land/systemid/no"))

        person.bostedsadresse.addLand(new Link(href: "/felles/land/systemid/no"))

        when:
        def result = objectMapper.writeValueAsString(person)
        println(result)
        def object = jsonSlurper.parseText(result)

        then:
        object
        object.bostedsadresse._links.land
    }
}
