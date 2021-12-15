package com.nttdata.yanki.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Yanki {


    private Long id;
    private Long idAccount;
    private String documentNumber;
    private String phone;
    private String imei;
    private String email;
    private Double balance;
    private LocalDate date;

}
