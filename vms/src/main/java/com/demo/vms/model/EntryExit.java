package com.demo.vms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "entry_exit")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EntryExit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "entry_stamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date entryStamp;
	@Column(name = "exit_stamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date exitStamp;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private FamilyRegInfo family;
}
