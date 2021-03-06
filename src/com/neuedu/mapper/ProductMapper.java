package com.neuedu.mapper;

import com.neuedu.model.Product;
import com.neuedu.model.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer prodid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);
    
    List<Product> selectAll();

    List<Product> selectByPrimaryKey(Integer prodid);
    
    Product findByBuyId( Integer buyid );
    
    int update( double Buycount, double Prodcount, Integer prodid, Integer buyid );

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    Double getBuycount();
}