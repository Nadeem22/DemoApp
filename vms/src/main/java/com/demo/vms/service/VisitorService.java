package com.demo.vms.service;

import com.demo.vms.model.VisitorRegistrastion;

public interface VisitorService {

	VisitorRegistrastion createVisitor(VisitorRegistrastion visitor);

	boolean getFlatByFlatNo(String flatNo);

}
