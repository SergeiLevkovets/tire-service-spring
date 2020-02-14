package by.stormnet.levkovets.service.impl;

import by.stormnet.levkovets.domains.Role;
import by.stormnet.levkovets.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class RoleServiceImpl implements RoleService {

    @Override
    public List<String> getAllRoles() {

        List<String> list = Arrays.asList(Role.values().toString());

        return list;
    }

    @Override
    public String getUserRole(){
        return Role.USER.toString();
    }


}
