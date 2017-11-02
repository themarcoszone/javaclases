package com.globant.stock.dao.impl;

/**
 * Created by marcos.pajon on 01/11/17.
 */
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.globant.stock.dao.StockDao;
import com.globant.stock.model.Stock;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao{

    public void save(Stock stock){
        getHibernateTemplate().save(stock);
    }

    public void update(Stock stock){
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock){
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(String stockCode){
        List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",stockCode
        );
        return (Stock)list.get(0);
    }

}
