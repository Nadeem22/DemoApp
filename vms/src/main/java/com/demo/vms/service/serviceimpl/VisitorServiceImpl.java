package com.demo.vms.service.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.vms.model.FamilyRegInfo;
import com.demo.vms.model.VisitorRegistrastion;
import com.demo.vms.repository.FamilyRepository;
import com.demo.vms.repository.VisitorRepository;
import com.demo.vms.service.VisitorService;

@Service
public class VisitorServiceImpl implements VisitorService {
	@Autowired
	private VisitorRepository visitorRepository;
	
	@Autowired 
	private FamilyRepository familyRepository;

	@Override
	public VisitorRegistrastion createVisitor(VisitorRegistrastion visitor) {
		visitor.setEntryDateTime(new Date());
		return visitorRepository.save(visitor);
	}

	@Override
	public boolean getFlatByFlatNo(String flatNo) {
		FamilyRegInfo visitorRegistrastion = familyRepository.getFaltByFlatNo(flatNo);
		if (visitorRegistrastion == null) {
			return false;
		} else {
			return true;
		}

	}
}
