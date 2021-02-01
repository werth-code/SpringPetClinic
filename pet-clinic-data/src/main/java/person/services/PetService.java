package person.services;

import person.Owner;
import person.Pet;

import java.util.Set;

public interface PetService {
    public Pet findById(Long id);
    public Pet save(Pet pet);
    Set<Pet> findAll();
}
