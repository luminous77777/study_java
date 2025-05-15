package user;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	List<User> users = new ArrayList<User>();
	{
		users.add(new Customer("1", "새똥이", "1"));
		users.add(new Admin("2", "개똥이", "2"));
	}
	
	//등록
	boolean register(User user) {
		return users.add(user);
	}
	
	boolean remove(User user) {
		return users.remove(user);
	}
	
	<T extends User> T findBy(String id, Class<T> clazz) {
		for(User u : users) {
			if(id.equals(u.id) && clazz.isInstance(u)) {
				return clazz.cast(u);
			}
		}
		return null;
	}

	<T>  List<T> getUsers(Class<T> clazz) {
		List<T> list = new ArrayList<T>();
		for(User u : users) {
			if(clazz.isInstance(u)) {
				list.add(clazz.cast(u));
			}
		}
		return null;
	}
}
