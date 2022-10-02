package com.sambit.service;

import com.sambit.model.Register;

import java.util.List;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 4:01 PM
 */
public interface MainService {
	Register saveRegister(Register register);
	Register chekLogin(String email, String password);
	Register getRegisterById(int registerId);
	List<Register> getAllAdmin();
}
