package com.globant.stock.bo.impl;

/**
 * Created by marcos.pajon on 01/11/17.
 */
import com.globant.stock.bo.StockBo;
import com.globant.stock.dao.StockDao;
import com.globant.stock.model.Stock;

public class StockBoImpl implements StockBo{

    StockDao stockDao;

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void save(Stock stock){
        stockDao.save(stock);
    }

    public void update(Stock stock){
        stockDao.update(stock);
    }

    public void delete(Stock stock){
        stockDao.delete(stock);
    }

    public Stock findByStockCode(String stockCode){
        return stockDao.findByStockCode(stockCode);
    }
}
