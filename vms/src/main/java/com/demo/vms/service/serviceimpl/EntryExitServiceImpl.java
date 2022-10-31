package com.demo.vms.service.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.vms.model.EntryExit;
import com.demo.vms.model.FamilyRegInfo;
import com.demo.vms.repository.EntryExitRepository;
import com.demo.vms.service.EntryExitService;

@Service
public class EntryExitServiceImpl implements EntryExitService {

	@Autowired
	private EntryExitRepository entryExitRepository;

	@Override
	public void createEntryByFamily(FamilyRegInfo family) {
		EntryExit entry = new EntryExit();
		entry.setEntryStamp(new Date());
		entry.setExitStamp(null);
		entry.setFamily(family);
		entryExitRepository.save(entry);
	}

	@Override
	public void createExitByFamily(FamilyRegInfo family) {
		EntryExit entry = new EntryExit();
		entry.setEntryStamp(null);
		entry.setExitStamp(new Date());
		entry.setFamily(family);
		entryExitRepository.save(entry);
	}

}
