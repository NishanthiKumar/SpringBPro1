package com.example.mobile;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	
	
	@Query (value= "select * from mobile_details where price > ?", nativeQuery=true)
	List<Mobile> getHighCostObj(int amount);

	@Query (value= "select * from mobile_details where brand like ?", nativeQuery=true)
	List<Mobile> getByBrand(String b);
	
	@Query (value= "select * from mobile_details where price > ? and price < ?", nativeQuery=true)
	List<Mobile> getByRange(int a, int b);

	@Query(value = "select * from mobile_details where price = (select max(price) from mobile_details)", nativeQuery = true)
	Mobile getMaxObj();

}
