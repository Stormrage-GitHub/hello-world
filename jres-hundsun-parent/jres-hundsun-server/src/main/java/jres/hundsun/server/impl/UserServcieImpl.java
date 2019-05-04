package jres.hundsun.server.impl;

import java.util.List;

import com.hundsun.jrescloud.rpc.annotation.CloudComponent;

import jres.hundsun.server.UserService;
import jres.hundsun.server.dto.User;

@CloudComponent
public class UserServcieImpl implements UserService {

	@Override
	public User getUser(int userID) {
		User user = new User();
		
		user.setUserID(userID);
		user.setUserName("shikk");
		user.setAddres("º¼ÖÝ¹°ÊûÇø");
		
		return user;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> queryUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
