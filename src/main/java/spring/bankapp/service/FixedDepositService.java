package main.java.spring.bankapp.service;

import main.java.spring.bankapp.domain.FixedDepositDetails;


public interface FixedDepositService {
	int createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
