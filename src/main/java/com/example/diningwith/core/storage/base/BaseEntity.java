package com.example.diningwith.core.storage.base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
public abstract class BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

}
