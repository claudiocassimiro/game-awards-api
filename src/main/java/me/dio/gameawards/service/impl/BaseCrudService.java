package me.dio.gameawards.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.gameawards.domain.BaseEntity;

public class BaseCrudService<E extends BaseEntity, T extends JpaRepository<E, Long>> implements CrudService<E> {
    
}
