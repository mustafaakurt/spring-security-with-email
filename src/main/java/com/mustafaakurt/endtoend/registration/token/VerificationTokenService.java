package com.mustafaakurt.endtoend.registration.token;

import com.mustafaakurt.endtoend.user.User;

import java.util.Optional;

public interface VerificationTokenService {
    String validateToken(String token);
    void saveVerificationToken(User user, String token);
    Optional<VerificationToken> findByToken(String token);
}
