package com.yoshallc.data.repository;

import com.yoshallc.data.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {

    @Query(nativeQuery = true, value = "select * from PERSON where age > 18")
    public List<Person> findAdults();

   /* @Modifying
    @Query(nativeQuery = true, value = "update NFCC_APP_DATA set NFCC_LAST_FOUR = ?2 where NFCC_AP_APPLCTN_ID = ?1")
    public void saveLastFour(long applicationId, String lastFour);
*/
}
