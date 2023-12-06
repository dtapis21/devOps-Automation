package Dao;


import org.springframework.data.repository.CrudRepository;

import com.exchange.bank.domain.PrimaryAccount;

/**
 * Created by z00382545 on 10/21/16.
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
