package com.nttdata.yanki.operations;

import com.nttdata.yanki.domain.Yanki;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface YankiOperations {

    Flux<Yanki> findAll() throws Exception;

    Mono<Yanki> findById(Long id) throws Exception;

    Mono<Yanki> save(Yanki yanki) throws Exception;

    Mono<Yanki> update(Long id, Yanki yanki) throws Exception;

    Mono<Void> delete(Long id) throws Exception;
}
