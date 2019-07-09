package com.ecut.entities;

import lombok.Data;

import java.util.Collection;

/**
 * @author Amy
 * @date 2019-07-09 16:26
 * @description:
 */
@Data
public class Page {
    private Collection<Customer> data;
}
