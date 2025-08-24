package com.sit.homeloan.repository;

import com.sit.homeloan.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByCustomer_User_Email(String email);
    
    List<Document> findByCustomerId(Long customerId);
}

