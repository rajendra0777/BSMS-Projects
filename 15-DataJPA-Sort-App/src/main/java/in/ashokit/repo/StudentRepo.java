package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Students;

public interface StudentRepo extends JpaRepository<Students, Integer>{

}
