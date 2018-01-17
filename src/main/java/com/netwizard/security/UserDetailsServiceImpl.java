/**
 * 
 */
package com.netwizard.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.netwizard.dao.UserDAO;
import com.netwizard.model.Users;
import com.netwizard.util.RequestConstans;


/**
 * @author Rayulu Vemula
 * 
 */
@Service
public class UserDetailsServiceImpl  implements UserDetailsService{
	
	/*@Autowired
	private MongoTemplate mongoTemplate;*/
	
	@Autowired
	private UserDAO userDao;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = null;
		try {
			System.out.println(username);
			user = userDao.loadUserByUserEmail(username);
			System.out.println(user);
			return new org.springframework.security.core.userdetails.User(
					user.getEmail(), user.getPassword(), getAuthorities(
							user.getRolesList()));
		} catch (Exception ex) {
			throw new UsernameNotFoundException(username + " Not Found");
		}
	}

	private List<GrantedAuthority> getAuthorities(List<String> roles) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			if (RequestConstans.Roles.ROLE_ADMIN.equals(role)) {
				authList.add(new SimpleGrantedAuthority(RequestConstans.Roles.ROLE_ADMIN));
			} else if (RequestConstans.Roles.ROLE_USER.equals(role)) {
				authList.add(new SimpleGrantedAuthority(RequestConstans.Roles.ROLE_USER));
			} else {
				authList.add(new SimpleGrantedAuthority(RequestConstans.Roles.ROLE_VENDOR));
			}
		}
		return authList;
	}
	
	

}
