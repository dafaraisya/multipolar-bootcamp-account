package com.multipolar.bootcamp.account.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountHolder {
    private String nik;
    private String name;
    private String address;
}
