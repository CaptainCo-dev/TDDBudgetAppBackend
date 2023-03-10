package com.example.tddbudgetappbackend.Repository;

import com.example.tddbudgetappbackend.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}