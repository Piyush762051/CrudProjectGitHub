package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.HubGit;

@Repository
public interface HubGitRepository extends CrudRepository<HubGit, Integer>
{

}
