package br.manedwolf.airbnbclone.user.mapper;

import br.manedwolf.airbnbclone.user.application.dto.ReadUserDTO;
import br.manedwolf.airbnbclone.user.domain.Authority;
import br.manedwolf.airbnbclone.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }
}
