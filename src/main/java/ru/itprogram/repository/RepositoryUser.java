package ru.itprogram.repository;

import ru.itprogram.entity.User;
import ru.itprogram.utils.generator.UserGenerator;

import java.util.List;

public class RepositoryUser implements Repository<User> {
    @Override
    public User getEntity() {
        return UserGenerator.getUser();
    }

    @Override
    public List<User> getAllEntity() {
        return UserGenerator.getListUser();
    }

    @Override
    public void saveEntity(User user) {
        System.out.println(user);
    }

    @Override
    public void saveAllEntity(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
