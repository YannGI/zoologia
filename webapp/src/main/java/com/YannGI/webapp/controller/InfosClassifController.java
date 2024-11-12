package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.Animal;
import com.YannGI.webapp.model.InfosClassif;
import com.YannGI.webapp.service.client.MongoinfoFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class InfosClassifController
{
    private final MongoinfoFeignClient mongoinfoFeignClient;

    public InfosClassifController(MongoinfoFeignClient mongoinfoFeignClient)
    {
        this.mongoinfoFeignClient = mongoinfoFeignClient;
    }

    @GetMapping("/getInfosClassif") // page home
    public ModelAndView getInfosClassif(Model model)
    {
        InfosClassif infosClassif = mongoinfoFeignClient.getInfosClassif().getBody();
        model.addAttribute("infosClassif", infosClassif);
        return new ModelAndView("InfosClassif");
    }
}
