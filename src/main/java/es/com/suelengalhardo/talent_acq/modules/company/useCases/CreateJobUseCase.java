package es.com.suelengalhardo.talent_acq.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.com.suelengalhardo.talent_acq.modules.company.entities.JobEntity;

@Service
public class CreateJobUseCase {
  private JobRepository jobRepository;

@Autowired 
private JobRepository jobRepository;

public JobEntity execute(JobEntity jobEntity) {
    return this.jobRepository.save(jobEntity);
  }
}
