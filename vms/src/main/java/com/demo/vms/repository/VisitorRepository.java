package com.demo.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.vms.model.FamilyRegInfo;
import com.demo.vms.model.VisitorRegistrastion;

@Repository
public interface VisitorRepository  extends JpaRepository<VisitorRegistrastion, Long>{

	@Query(value = "select * from family_info where flat_no=:flatNo", nativeQuery = true)
	FamilyRegInfo getFaltByFlatNo(@Param("flatNo") String flatNo);

}
