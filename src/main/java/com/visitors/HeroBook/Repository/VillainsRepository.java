package com.visitors.HeroBook.Repository;

import com.visitors.HeroBook.Entity.VillainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VillainsRepository extends JpaRepository<VillainEntity, Long> {

}
