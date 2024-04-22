package com.example.oblig3web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class BilllettController {
    public final List<Billett> billettRegister =new ArrayList<>();
    @PostMapping("/lagreKunde")
    public void lagreKunde(Billett film){
        billettRegister.add(film);
    }
    @GetMapping("/hentAlt")
    public List<Billett> hentalle(){
        return billettRegister;
    }
    @GetMapping("/slettBillett")
    public void slettBillett(){
        billettRegister.clear();
    }
}
