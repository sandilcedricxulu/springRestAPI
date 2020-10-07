package xtn.projects.employeeSystem.employeeRestAPI.repository;

import org.springframework.stereotype.Repository;

import xtn.projects.employeeSystem.employeeRestAPI.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{}
