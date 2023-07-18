package edu.itstep.blockchain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.itstep.blockchain.domain.User;
import edu.itstep.blockchain.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUpdateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findUserById(Integer id) {
		return userRepository.findById(id);
	}

}
