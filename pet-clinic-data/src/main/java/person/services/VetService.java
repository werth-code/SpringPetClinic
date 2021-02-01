package person.services;

import person.Owner;
import person.Vet;

import java.util.Set;

public interface VetService {
    public Vet findById(Long id);
    public Vet save(Vet vet);
    Set<Vet> findAll();
}
