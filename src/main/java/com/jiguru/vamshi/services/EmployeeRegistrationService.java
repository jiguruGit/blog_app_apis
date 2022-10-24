package com.jiguru.vamshi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jiguru.vamshi.entities.DepartmentRegistrationEntity;
import com.jiguru.vamshi.entities.EmployeeRegistrationEntity;
import com.jiguru.vamshi.entities.Users;
import com.jiguru.vamshi.repositories.EmployeeRegistrationRepository;
import com.jiguru.vamshi.repositories.UserRepo;
import com.jiguru.vamshi.utils.ResponseBean;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeRegistrationService {
	
	@Autowired
	private EmployeeRegistrationRepository employeeRegistrationRepository;
	
	@Autowired
	private UserRepo userRepo;

	public ResponseEntity<ResponseBean> save(EmployeeRegistrationEntity employeeRegisterationEntityPayload) {
		ResponseBean responseBean = new ResponseBean();
		EmployeeRegistrationEntity employeeRegistrationEntity = new EmployeeRegistrationEntity();
		try {
			if (employeeRegisterationEntityPayload.getId() != null && employeeRegisterationEntityPayload.getId() > 0) {
				Optional<EmployeeRegistrationEntity> existingEmployeeRegisterationEntityRecord = employeeRegistrationRepository
						.getId(employeeRegisterationEntityPayload.getId());
				if (existingEmployeeRegisterationEntityRecord.isPresent()) {
					employeeRegisterationEntityPayload
							.setCreatedOn(existingEmployeeRegisterationEntityRecord.get().getCreatedOn());
					employeeRegisterationEntityPayload
							.setCreatedBy(existingEmployeeRegisterationEntityRecord.get().getCreatedBy());
					employeeRegistrationEntity = employeeRegistrationRepository
							.save(employeeRegisterationEntityPayload);

					responseBean.setStatus(HttpStatus.OK);
					responseBean.setReturnCode(1);
					responseBean.setMessage("Successfully updated the record");
					responseBean.setData(employeeRegisterationEntityPayload);
				} else {
					responseBean.setStatus(HttpStatus.OK);
					responseBean.setReturnCode(1);
					responseBean.setMessage("Record does not exist");
				}
			}else {
				Users users = new Users();
				DepartmentRegistrationEntity departmentRegistrationEntity = new DepartmentRegistrationEntity();
				
				if(users.getAge() >= 18 ) {
					
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;

	}
}
