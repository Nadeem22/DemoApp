package com.demo.vms.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "family_info")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FamilyRegInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "owner_name", nullable = false)
	@NotNull
	@Size(min = 3, max = 20, message = "Name should contain minmum 3 and max 20 charecter")
	private String ownerName;
	@Column(name = "flat_no", nullable = false)
	@NotEmpty
	@Size(min = 2, max = 5, message = "flat number shoud be minimum 3 and maximum 5 charecter")
	private String flatNo;
	@Column(name = "no_of_member", nullable = false)
	@NotEmpty(message = "Field cannot be empty")
	private String noOfMember;
	@Column(name = "ssn_number")
	@NotEmpty
	@Size(min = 9)
	@Size(max = 9)
	private String ssnNumber;
	@Temporal(TemporalType.TIMESTAMP)
	private Date entryDateTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date exitDateTime;
	
	@OneToMany(mappedBy = "family", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<EntryExit> entryExit;

}
