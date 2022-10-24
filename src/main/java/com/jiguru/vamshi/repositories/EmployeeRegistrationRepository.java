package com.jiguru.vamshi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jiguru.vamshi.entities.EmployeeRegistrationEntity;

public interface EmployeeRegistrationRepository extends JpaRepository<EmployeeRegistrationEntity, Long> {
	
	@Query(value = "select * from employee_registration where id = ?1 and is_deleted = false", nativeQuery = true)
	public Optional<EmployeeRegistrationEntity> getId(Long id);
}
