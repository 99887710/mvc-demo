package jw.io.mvcdemo.service;

import jw.io.mvcdemo.model.Transaction;
import jw.io.mvcdemo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> listAll() {
        return transactionRepository.getTransactions();
    }
}
