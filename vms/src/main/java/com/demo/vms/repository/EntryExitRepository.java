package com.demo.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.vms.model.EntryExit;

@Repository
public interface EntryExitRepository extends JpaRepository<EntryExit, Long> {

}
