package ru.portfolio.finance;
import org.springframework.data.jpa.repository.*; import java.time.LocalDate; import java.util.*;
public interface TransactionRepository extends JpaRepository<Transaction,Long>, JpaSpecificationExecutor<Transaction>{ List<Transaction> findByTransactionDateBetween(LocalDate from, LocalDate to); }
