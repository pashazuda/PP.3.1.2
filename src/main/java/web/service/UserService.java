package web.service;

import web.model.User;

import java.util.List;


public interface UserService {
    public void save(User user);

    public User find(int id);

    public List<User> findAll();

    public void update(int id, User user);

    public void delete(int id);
}
