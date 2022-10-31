package com.demo.vms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "visitor_info")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VisitorRegistrastion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY	)
    private Long id;
	@Column(name = "visitor_name", nullable = false)
	private  String visitorName;
	@Column(name = "flat_no", nullable = false)
	private String flatNo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date entryDateTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date exitDateTime;
	
	//taking minimal field rest will be added
    
}
