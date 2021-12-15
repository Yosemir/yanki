package com.nttdata.yanki.infrestructure.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document("yanki")
@NoArgsConstructor
public class YankiDao {

    @Id
    private Long id;
    private Long idAccount;
    private String documentNumber;
    private String phone;
    private String imei;
    private String email;
    private Double balance;
    private LocalDate date;

}
