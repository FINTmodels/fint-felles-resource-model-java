package no.fint.model.felles;

import lombok.Data;
import no.fint.Link;

import java.util.List;

@Data
public class CollectionLinks {
    private List<Link<String>> self;
}
