package jw.io.mvcdemo.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import jw.io.mvcdemo.model.Transaction;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TransactionRepository {
    private final  ObjectMapper objectMapper = new ObjectMapper();

    public List<Transaction> getTransactions() {
        String data;
        List<Transaction> transactions = new ArrayList<>();
        try {
            data = new String(Files.readAllBytes(Paths.get("data/transactions.json")));
            transactions = objectMapper.readValue(data, List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transactions;
    }
}
