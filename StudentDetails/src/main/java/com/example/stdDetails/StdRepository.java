package com.example.stdDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StdRepository extends JpaRepository<Std, Integer> {
   
	
	@Query(value="select * from std_details where deptname like ?", nativeQuery = true)
	List<Std> getByDept(String d);

	@Query(value="select * from std_details where avg = (select max(avg) from std_details)",nativeQuery = true)
	Std getMaxAvg();

}
