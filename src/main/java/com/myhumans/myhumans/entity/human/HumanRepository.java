package com.myhumans.myhumans.entity.human;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<Human, Long> {
}