package no.fint;

import lombok.Getter;

public class Link<T> {
    @Getter
    private String href;

    public void setVerdi(String verdi) {
        href = verdi;
    }
}

