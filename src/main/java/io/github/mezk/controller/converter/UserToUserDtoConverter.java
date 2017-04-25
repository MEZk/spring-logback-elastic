package io.github.mezk.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import io.github.mezk.controller.dto.UserDto;
import io.github.mezk.model.User;

@Component
public class UserToUserDtoConverter implements Converter<User, UserDto> {

    @Override
    public UserDto convert(User source) {
        UserDto dto = UserDto.builder().helloMsg(source.getHelloMsg()).build();
        return dto;
    }
}
