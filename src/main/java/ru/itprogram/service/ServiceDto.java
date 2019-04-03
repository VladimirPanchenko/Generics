package ru.itprogram.service;

import ru.itprogram.dto.UserDto;
import ru.itprogram.entity.User;
import ru.itprogram.repository.RepositoryUser;
import ru.itprogram.service.converter.UserDtoToUser;
import ru.itprogram.service.converter.UserToDtoUser;

import java.util.ArrayList;
import java.util.List;

public class ServiceDto implements Service<UserDto> {
    private RepositoryUser repositoryUser;
    private UserToDtoUser userToDtoUser;
    private UserDtoToUser userDtoToUser;

    public ServiceDto() {
        repositoryUser = new RepositoryUser();
        userToDtoUser = new UserToDtoUser();
        userDtoToUser = new UserDtoToUser();
    }

    @Override
    public UserDto getDto() {
        User user = repositoryUser.getEntity();
        return userToDtoUser.convertion(user);
    }

    @Override
    public List<UserDto> getAllDto() {
        List<User> users = repositoryUser.getAllEntity();
        List<UserDto> userDtos = new ArrayList<>();
        for (User user : users) {
            userDtos.add(userToDtoUser.convertion(user));
        }
        return userDtos;
    }

    @Override
    public void addDtoObject(UserDto userDto) {
        repositoryUser.saveEntity(userDtoToUser.convertion(userDto));
    }

    @Override
    public void addListDtoObject(List<UserDto> userDtos) {
        List<User> users = new ArrayList<>();
        for (UserDto userDto : userDtos) {
            users.add(userDtoToUser.convertion(userDto));
        }
        repositoryUser.saveAllEntity(users);
    }
}
