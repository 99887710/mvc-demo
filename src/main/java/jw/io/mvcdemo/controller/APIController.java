package jw.io.mvcdemo.controller;

import jw.io.mvcdemo.model.Transaction;
import jw.io.mvcdemo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class APIController {

    @Autowired
    TransactionService transactionService;

    @RequestMapping("/list")
    public List<Transaction> listTransactions() {
        return transactionService.listAll();
    }
}
