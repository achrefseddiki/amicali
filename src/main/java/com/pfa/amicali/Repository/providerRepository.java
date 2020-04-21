package com.pfa.amicali.Repository;

import com.pfa.amicali.Entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface providerRepository extends JpaRepository<Provider, Long> {

}
