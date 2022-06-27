package user.kyojun.spring.model.repo;

import java.util.List;

import user.kyojun.spring.dto.User;

public interface UserRepo {
	public void insert(User user);
	public void delete(User user);
	public User select(String id);
	public List<User> selectAll();
}
