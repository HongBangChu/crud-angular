package lee.mink.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lee.mink.crud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}