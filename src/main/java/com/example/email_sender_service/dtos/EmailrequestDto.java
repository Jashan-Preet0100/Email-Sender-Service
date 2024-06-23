package com.example.email_sender_service.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailrequestDto {

    private String to;
    private String subject;
    private String message;
}
