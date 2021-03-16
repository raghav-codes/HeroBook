package com.visitors.HeroBook.Repository;

import com.visitors.HeroBook.Entity.VisitorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<VisitorEntity, Long>{

}
