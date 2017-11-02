package com.globant.stock.model;

/**
 * Created by marcos.pajon on 01/11/17.
 */
import lombok.Data;

import java.io.Serializable;

@Data
public class Stock implements Serializable {

    private Long stockId;
    private String stockCode;
    private String stockName;

}
