package com.wzres.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @date 2023-08-21 17:10
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Integer id;
    String username;
    Integer age;
    String address;
}
