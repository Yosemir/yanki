package com.nttdata.yanki.model;

import com.nttdata.yanki.domain.Yanki;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface YankiRepository {

    Flux<Yanki> findAll();

    Mono<Yanki> findById(Long id);

    Mono<Yanki> save(Yanki yanki);

    Mono<Yanki> update(Long id, Yanki Yanki);

    Mono<Void> delete(Long id);
}
