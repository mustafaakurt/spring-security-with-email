package com.mustafaakurt.endtoend.registration;

import com.mustafaakurt.endtoend.user.Role;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.util.Collection;

@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    @NaturalId(mutable = true)
    private String email;
    private String password;
    private Collection<Role> roles;
}
