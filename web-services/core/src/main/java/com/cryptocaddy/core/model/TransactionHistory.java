package com.cryptocaddy.core.model;

import com.cryptocaddy.core.exchanges.SupportedExchanges;

import java.util.ArrayList;
import java.util.List;

//TODO: this class needs more data such as exchange name etc. Incomplete.
public class TransactionHistory {


    private List<Transaction> transactions;

    public TransactionHistory(){
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction tx){
        transactions.add(tx);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
