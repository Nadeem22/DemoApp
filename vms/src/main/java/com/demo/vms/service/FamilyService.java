package com.demo.vms.service;

import java.util.List;

import com.demo.vms.model.FamilyRegInfo;

public interface FamilyService {

	FamilyRegInfo createFamily(FamilyRegInfo familyRegInfo);

	boolean getFaltByFlatNo(String flatNo);

	List<FamilyRegInfo> getAllFamily();

	FamilyRegInfo getFamilyByFlatNumber(String flatNumber);

}
