package jres.hundsun.server;

import java.util.List;

import com.hundsun.jrescloud.rpc.annotation.CloudService;

import jres.hundsun.server.dto.User;

@CloudService
public interface UserService {

	/**
	 *    根据用户编号获取用户对象
	 * @param userID
	 * @return
	 */
	User getUser(int userID);
	
	/**
	 * 新增用户信息
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 * 	查下所有用户信息
	 * @return
	 */
	List<User> queryUser();
}
