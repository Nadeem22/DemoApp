package com.demo.vms.service.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.vms.model.FamilyRegInfo;
import com.demo.vms.repository.FamilyRepository;
import com.demo.vms.service.FamilyService;

@Service
public class FamilyServiceImpl implements FamilyService {

	@Autowired
	private FamilyRepository familyRepository;

	@Override
	public FamilyRegInfo createFamily(FamilyRegInfo familyRegInfo) {
		familyRegInfo.setEntryDateTime(new Date());
		return familyRepository.save(familyRegInfo);
	}

	@Override
	public boolean getFaltByFlatNo(String flatNo) {

		FamilyRegInfo familyRegInfo = familyRepository.getFaltByFlatNo(flatNo);
		if (familyRegInfo == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public List<FamilyRegInfo> getAllFamily() {
	return familyRepository.findAll();
	}

	@Override
	public FamilyRegInfo getFamilyByFlatNumber(String flatNumber) {
		
		return familyRepository.getFaltByFlatNo(flatNumber);
	}

}
