package jres.hundsun.server;

import java.util.List;

import com.hundsun.jrescloud.rpc.annotation.CloudService;

import jres.hundsun.server.dto.User;

@CloudService
public interface UserService {

	/**
	 *    �����û���Ż�ȡ�û�����
	 * @param userID
	 * @return
	 */
	User getUser(int userID);
	
	/**
	 * �����û���Ϣ
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 * 	���������û���Ϣ
	 * @return
	 */
	List<User> queryUser();
}
