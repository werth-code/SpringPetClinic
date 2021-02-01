package person.services;

import person.Owner;

import java.util.Set;

public  interface OwnerService {
    public Owner findByLastName(String lastName);
    public Owner findById(Long id);
    public Owner save(Owner owner);
    Set<Owner> findAll();
}
