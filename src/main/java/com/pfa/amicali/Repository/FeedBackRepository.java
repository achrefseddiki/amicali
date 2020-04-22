package com.pfa.amicali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FeedBackRepository extends JpaRepository<com.pfa.amicali.Entity.FeedBack, Long> {

}
