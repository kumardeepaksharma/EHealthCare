package ehealthcare.up.gov.in.doctor.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@Table(name="Doctors_table")
public class DoctorsEntity implements Serializable{
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="Id")
	private Integer doctorId;
	
	@Column(name="Name")
	private String  doctorName;
	
	@Column(name="Department")
	private String  doctorDepartment;

	@Column(name="PhoneNumber")
	private Long doctorPhonNum;
	
	@Column(name="Address")
	private String  doctorAddress;
	
	@Lob
	@Column(name="Image")
	private Byte[] doctorImg;
	
	private String dateOfJoining;
	
	private String dateOfEnding;
	
	@CreatedDate
	private Date createdDate;
	
	@UpdateTimestamp
	private Date updatedDate;
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
}
