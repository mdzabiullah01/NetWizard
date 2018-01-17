package com.netwizard.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.netwizard.model.Users;

/**
 * @author vara prasad
 *
 */
@Component
public interface CommonDAO {

	public List<Users> getAllUsers();

}
