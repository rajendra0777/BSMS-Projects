package in.ashokit.repo;

import org.hibernate.mapping.PrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, PrimaryKey>{

}
