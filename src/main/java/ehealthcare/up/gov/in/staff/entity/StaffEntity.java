package ehealthcare.up.gov.in.staff.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="StaffTable")
public class StaffEntity {
	
	@Id
	@Column(name="id")
	private Integer staffId;
	@Column(name="Name")
	private String  staffName;
	@Column(name="Gender")
	private String  staffGender;
	@Column(name="PhoneNumber")
	private String  staffPhNum;
	@Column(name="Address")
	private String  staffAddress;
	@Column(name="Department")
	private String  staffDepartment;
	@Column(name="Joining Date")
	private String  joiningDate;
	@Column(name="Ending Date")
	private String  endingDate;
	@CreatedDate
	private Date createdDate;
	@UpdateTimestamp
	private Date updatedDate;

}
