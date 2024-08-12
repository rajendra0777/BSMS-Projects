package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Citizen;
import in.ashokit.entity.PrimaryKeys;
import in.ashokit.repo.CitizenRepo;

@Service
public class CitizenService {

    @Autowired
    private CitizenRepo citiRepo;

    // Save record
    public void saveCitizenRecord() {
        PrimaryKeys pk1 = new PrimaryKeys();
        pk1.setCid(1);
        pk1.setPassportId("ABH1IYS78RJ");

        Citizen c1 = new Citizen();
        c1.setAge(23);
        c1.setName("Mahinder");
        c1.setPhone(761215024);

        // Setting Primary key value
        c1.setPk(pk1);

        citiRepo.save(c1);
        System.out.println("Citizen record saved..");
    }

    public void getCitizen() {
        PrimaryKeys pk1 = new PrimaryKeys();
        pk1.setCid(1);
        pk1.setPassportId("ABH1IYS78RJ");

        Optional<Citizen> findById = citiRepo.findById(pk1);

        if (findById.isPresent()) {
            Citizen citizen = findById.get();
            System.out.println(citizen);
        }
    }
}
