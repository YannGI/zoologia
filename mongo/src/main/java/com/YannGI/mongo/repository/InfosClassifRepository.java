package com.YannGI.mongo.repository;

import com.YannGI.mongo.model.InfosClassif;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfosClassifRepository extends MongoRepository<InfosClassif, String>
{

}
