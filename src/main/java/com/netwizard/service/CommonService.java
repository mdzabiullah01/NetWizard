package com.netwizard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netwizard.model.AssignGroup;
import com.netwizard.model.Users;

/**
 * @author vara prasad
 *
 */
@Service
public interface CommonService {

	public List<Users> getAllUsers();

	public List<AssignGroup> getAllGroups();

}
