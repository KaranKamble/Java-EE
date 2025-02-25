package com.silent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.silent.dto.OnboardingDTO;
import com.silent.entity.Employee;
import com.silent.entity.Offer;
import com.silent.repository.EmployeeRepo;
import com.silent.repository.OfferRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private OfferRepo offerRepo;
	
	@Override
	@Transactional
	public void onBoarding( OnboardingDTO onboardingDTO ) {
		
		addEmployee(onboardingDTO);
		addOffer(onboardingDTO);
	}

	private void addOffer(OnboardingDTO onboardingDTO) {
		Offer offer = new Offer(onboardingDTO.getSalary(), onboardingDTO.getJoinDate(), onboardingDTO.isAccepted());
		offerRepo.save(offer);
	}

	private void addEmployee(OnboardingDTO onboardingDTO) {
		Employee emp = new Employee(onboardingDTO.getName(),onboardingDTO.getCity());
		employeeRepo.save(emp);
	}
}
