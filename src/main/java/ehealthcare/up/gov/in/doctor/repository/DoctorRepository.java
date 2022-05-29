package ehealthcare.up.gov.in.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ehealthcare.up.gov.in.doctor.entity.DoctorsEntity;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorsEntity,Integer>{

}
