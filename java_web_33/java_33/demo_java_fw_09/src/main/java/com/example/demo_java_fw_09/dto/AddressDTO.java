package com.example.demo_java_fw_09.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDTO {
private long id;
private String name;
private String code;
}
