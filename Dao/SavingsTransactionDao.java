package Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exchange.bank.domain.SavingsTransaction;



public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

