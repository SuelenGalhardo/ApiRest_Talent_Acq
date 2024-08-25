package es.com.suelengalhardo.talent_acq.modules.company.repositories;


import java.util.UUID;



import org.springframework.data.jpa.repository.JpaRepository;
import es.com.suelengalhardo.talent_acq.modules.company.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
    
}
