package com.xiaohui.mapper;

import com.xiaohui.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BrandMapper {

    @ResultMap("brandResultMap")
    @Select("select  * from tb_brand")
    List<Brand> selectAll();

    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    @ResultMap("brandResultMap")
    @Select("select  * from tb_brand where id = #{id}")
    Brand selectByIdBrand(int id);


    @Update("update tb_brand set brand_name = #{brandName},company_name = #{companyName},ordered = #{ordered},description = #{description},status = #{status} where id = #{id}")
    void update(Brand brand);
}
