package com.demo.vms.service;

import com.demo.vms.model.FamilyRegInfo;

public interface EntryExitService {

	void createEntryByFamily(FamilyRegInfo family);

	void createExitByFamily(FamilyRegInfo family);

}
