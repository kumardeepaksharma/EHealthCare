package ehealthcare.up.gov.in.patient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="Patient_Table")
public class PatientEntity {
	
	@Id
	@Column(name="Id")
	private Integer patientId;
	@Column(name="Name")
	private String  patientName;
	@Column(name="Age")
	private String patientAge;
	@Column(name="PhoneNumber")
	private String  phoneNumber;
	@Column(name="Address")
	private String  address;
	private String  v;
	
	
	
	
	
	

}
