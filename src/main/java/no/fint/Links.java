package no.fint;

import lombok.Data;

import java.util.List;

@Data
public class Links<T> {
    private List<Link> links;
}
