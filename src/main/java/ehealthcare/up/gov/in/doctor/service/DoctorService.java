package ehealthcare.up.gov.in.doctor.service;

import java.util.List;

import ehealthcare.up.gov.in.doctor.entity.DoctorsEntity;
import ehealthcare.up.gov.in.doctor.pojo.DoctorsPojo;

public interface DoctorService {

	public Boolean saveDoctorsData(DoctorsPojo doctorsPojo);
	public List<DoctorsEntity> getAllDoctorsData();
	
	
}
