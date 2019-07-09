package com.ecut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Amy
 * @date 2019-07-09 16:23
 * @description: 顾客信息实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Long id;

    private String name;
}
