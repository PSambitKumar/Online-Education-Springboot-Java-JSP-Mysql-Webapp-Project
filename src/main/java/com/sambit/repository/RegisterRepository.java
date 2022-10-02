package com.sambit.repository;

import com.sambit.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 4:03 PM
 */
public interface RegisterRepository extends JpaRepository<Register, Integer> {
	Register getRegistersByEmailAndPassword(String email, String password);
	List<Register> getAllByUserType(String userType);
}
