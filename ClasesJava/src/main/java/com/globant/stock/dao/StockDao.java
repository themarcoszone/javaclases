package com.globant.stock.dao;

/**
 * Created by marcos.pajon on 01/11/17.
 */
import com.globant.stock.model.Stock;

public interface StockDao {

    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);

}

