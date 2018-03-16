package no.fint;

import lombok.Data;

@Data
public class Link<T> {
    Class<T> klasse;
    String identifikator;
}
