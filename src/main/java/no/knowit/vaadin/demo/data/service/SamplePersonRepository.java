package no.knowit.vaadin.demo.data.service;

import java.util.UUID;
import no.knowit.vaadin.demo.data.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}