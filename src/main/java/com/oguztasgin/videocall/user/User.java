package com.oguztasgin.videocall.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    String username;
    String email;
    String password;
    String status;

}
