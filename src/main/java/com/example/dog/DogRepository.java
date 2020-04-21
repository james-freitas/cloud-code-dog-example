package com.example.dog;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends DatastoreRepository<Dog, Long> {}
