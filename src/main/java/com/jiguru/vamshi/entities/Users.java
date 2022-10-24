package com.jiguru.vamshi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Users extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	
	@Basic(optional = false)
	@Column(name = "id")
	private Long  id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	@Basic(optional = false)
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_password")
	private String Password;

	@ManyToOne
	@JoinColumn(name = "user_types_id")
	private UserTypes userTypes;
	
	@OneToMany(mappedBy = "users")
	private List<EmployeeRegistrationEntity> employeeRegistrationEntities;

//	@Column(name = "role_id")
//	private int userTypeId;

}
