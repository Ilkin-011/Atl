package com.atl.bankapp.dao;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fame;
    private String lname;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_id",nullable = false)
    private BankEntity bankEntity;
}
