package com.mustafaakurt.endtoend.user;

import com.mustafaakurt.endtoend.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    User registerUser(RegistrationRequest registrationRequest);
    User findByEmail(String email);

}
