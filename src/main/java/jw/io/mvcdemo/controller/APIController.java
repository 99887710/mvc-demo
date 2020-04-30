package jw.io.mvcdemo.controller;

import jw.io.mvcdemo.model.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class APIController {


    @RequestMapping("/list")
    public List<Transaction> listTransactions() {

        return Arrays.asList(new Transaction());
    }
}
