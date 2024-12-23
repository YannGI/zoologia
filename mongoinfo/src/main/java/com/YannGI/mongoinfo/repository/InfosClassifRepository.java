package com.YannGI.mongoinfo.repository;

import com.YannGI.mongoinfo.model.InfosClassif;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InfosClassifRepository extends MongoRepository<InfosClassif, String>
{
    public Optional<InfosClassif> findInfosClassifByIdInfosClassif(int idInfosClassif);
}
