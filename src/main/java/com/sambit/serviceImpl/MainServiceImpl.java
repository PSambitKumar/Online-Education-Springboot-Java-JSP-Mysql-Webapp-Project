package com.sambit.serviceImpl;

import com.sambit.model.Register;
import com.sambit.repository.RegisterRepository;
import com.sambit.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 4:01 PM
 */

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public Register saveRegister(Register register) {
		try {
			register.setUserType("USER");
			return registerRepository.save(register);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Register chekLogin(String email, String password) {
		return registerRepository.getRegistersByEmailAndPassword(email, password);
	}
}
