package by.stormnet.levkovets.service.impl;

import by.stormnet.levkovets.domains.Role;
import by.stormnet.levkovets.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired


    @Override
    public List<String> getAllRoles() {
        return Arrays.stream(Role.values())
                .map(Role::name)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getUserRole(){
        List<String> list = Collections.singletonList(Role.ROLE_USER.name());
        return list;
    }


}
