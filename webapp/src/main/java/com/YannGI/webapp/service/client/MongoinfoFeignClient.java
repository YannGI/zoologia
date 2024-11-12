package com.YannGI.webapp.service.client;

import com.YannGI.webapp.model.Animal;
import com.YannGI.webapp.model.InfosClassif;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("mongoinfo")
public interface MongoinfoFeignClient
{
    @GetMapping(value = "/getInfosClassif",consumes = "application/json")
    public ResponseEntity<InfosClassif> getInfosClassif();
}
