package ru.gymanager.server.service;

import java.util.Optional;
import ru.gymanager.server.model.UserEntity;
import ru.gymanager.server.dto.UserCreationDto;

public interface UserService {
    Optional<UserEntity> getUserByLogin(String login);

    UserEntity createUser(UserCreationDto userDto);
}
