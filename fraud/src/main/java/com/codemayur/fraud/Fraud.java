package com.codemayur.fraud;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Fraud {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
