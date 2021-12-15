package com.nttdata.yanki.impl;

import com.nttdata.yanki.domain.Yanki;
import com.nttdata.yanki.model.YankiRepository;
import com.nttdata.yanki.operations.YankiOperations;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class YankiImpl implements YankiOperations {



    private final YankiRepository yankiRepository;

    @Override
    public Flux<Yanki> findAll() throws Exception {
        try {
            return yankiRepository.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Yanki> findById(Long id) throws Exception {
        try {
            return yankiRepository.findById(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Yanki> save(Yanki yanki) throws Exception {
        try {
            return yankiRepository.save(yanki);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Yanki> update(Long id, Yanki yanki) throws Exception {
        try {
            return yankiRepository.update(id, yanki);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Void> delete(Long id) throws Exception {
        return yankiRepository.delete(id);
    }
}
