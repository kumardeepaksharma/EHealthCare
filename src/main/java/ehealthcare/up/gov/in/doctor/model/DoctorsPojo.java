package ehealthcare.up.gov.in.doctor.model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class DoctorsPojo {
	
	 
	private Integer doctorId;
	private String  doctorName;	
	private String  doctorDepartment;
	private Date dateOfJoining;
	private Long    doctorMobNum;	
	private String  doctorAddress;
	private Date dateOfJobEnding;
	private Date createdDate;
	private Date updatedDate;

}
