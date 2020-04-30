package jw.io.mvcdemo.service;

import jw.io.mvcdemo.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> listAll() {
        return Arrays.asList(new Transaction());
    }
}
