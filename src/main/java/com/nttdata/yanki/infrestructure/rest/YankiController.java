package com.nttdata.yanki.infrestructure.rest;

import com.nttdata.yanki.domain.Yanki;
import com.nttdata.yanki.operations.YankiOperations;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/yanki")
@RequiredArgsConstructor
public class YankiController {


    private static final Logger logger = LoggerFactory.getLogger(YankiController.class);
    private final YankiOperations yankiOperations;


    @GetMapping("list")
    public Flux<Yanki> getall() throws Exception{
        try {
            return yankiOperations.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Mono<Yanki> getOne(@PathVariable Long id) throws Exception {
        try {
            return yankiOperations.findById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @PostMapping("add")
    public Mono<Yanki> save(@RequestBody Yanki yanki) throws Exception {
        try {
            return yankiOperations.save(yanki);
        }catch (Exception e){
            throw e;
        }
    }

    @PutMapping("/{id}")
    public Mono<Yanki> update(@PathVariable Long id, @RequestBody Yanki yanki) throws Exception {
        try {
            return yankiOperations.update(id , yanki);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) throws Exception {
        try {
            return yankiOperations.delete(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
