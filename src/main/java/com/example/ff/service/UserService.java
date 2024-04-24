/*
package com.example.ff.service;
import com.example.ff.model.User;
import com.example.ff.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    private final PasswordEncoder passwordEncoder;

    public User registerUser(String username, String password) {
    User user = new User(username, passwordEncoder.encode(password));
    return userRepository.save(user);
}

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
*//*

package com.example.ff.service;

import com.example.ff.model.User;
import com.example.ff.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

*/
/**
 * Service for managing user data.
 *//*

@Service
public abstract class UserService {
    abstract List<User> getUsers();







    }

*/
package com.example.ff.service;

import com.example.ff.model.User;
import com.example.ff.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service for managing user data.
 */

@Service
public abstract class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    /**
     * Constructs a new UserService with necessary dependencies.
     *
     * @param userRepository the user repository for database operations
     * @param passwordEncoder the encoder for password hashing
     */
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * Registers a new user with encrypted password.
     *
     * @param username the username of the new user
     * @param password the raw password of the new user
     * @return the saved user entity
     */
    /*public User registerUser(String username, String password) {
        User user = new User(username, passwordEncoder.encode(password));
        return userRepository.save(user);
    }*/

    /**
     * Finds a user by username.
     *
     * @param username the username to search for
     * @return an Optional containing the user if found
     */
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}