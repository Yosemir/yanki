package com.nttdata.yanki.infrestructure.service;


import com.nttdata.yanki.domain.Yanki;
import com.nttdata.yanki.infrestructure.model.dao.YankiDao;
import com.nttdata.yanki.infrestructure.repository.YankiCrudRepository;
import com.nttdata.yanki.model.YankiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class YankiCrudService implements YankiRepository {


    @Autowired
    private YankiCrudRepository yankiCrudRepository;



    @Override
    public Flux<Yanki> findAll() {
        return yankiCrudRepository.findAll().map(yankiDao -> getYanki(yankiDao));
    }

    @Override
    public Mono<Yanki> findById(Long id) {
        return yankiCrudRepository.findById(id).map(yankiDao -> getYanki(yankiDao));
    }

    @Override
    public Mono<Yanki> save(Yanki yanki) {
        return yankiCrudRepository.save(getYankiDao(yanki)).map(this::getYanki);
    }

    @Override
    public Mono<Yanki> update(Long id, Yanki yanki) {
        return yankiCrudRepository.save(getYankiDao(yanki)).map(this::getYanki);
    }

    @Override
    public Mono<Void> delete(Long id) {
        return yankiCrudRepository.deleteById(id);
    }



    public Yanki getYanki(YankiDao yankiDao){
        Yanki yanki = new Yanki();
        yanki.setId(yankiDao.getId());
        yanki.setIdAccount(yankiDao.getIdAccount());
        yanki.setDocumentNumber(yankiDao.getDocumentNumber());
        yanki.setPhone(yankiDao.getPhone());
        yanki.setImei(yankiDao.getImei());
        yanki.setEmail(yankiDao.getEmail());
        yanki.setBalance(yankiDao.getBalance());
        yanki.setDate(LocalDateTime.now().toLocalDate());
        return yanki;
    }


    public YankiDao getYankiDao(Yanki yanki){
        YankiDao yankiDao = new YankiDao();
        yankiDao.setId(yanki.getId());
        yankiDao.setIdAccount(yanki.getIdAccount());
        yankiDao.setDocumentNumber(yanki.getDocumentNumber());
        yankiDao.setPhone(yanki.getPhone());
        yankiDao.setImei(yanki.getImei());
        yankiDao.setEmail(yanki.getEmail());
        yankiDao.setBalance(yanki.getBalance());
        yankiDao.setDate(LocalDateTime.now().toLocalDate());
        return yankiDao;
    }

}
