package com.changgou.dao;

import com.changgou.goods.pojo.Brand;
import tk.mybatis.mapper.common.Mapper;

/**
 * 增加数据. 调用Mapper.insert()
 * 增加数据. 调用Mapper.insertSelective()
 *
 * 修改数据. 调用Mapper.update(T)
 * 修改数据. 调用Mapper.updateByPrimaryKey(T)
 *
 * 查询数据. 根据Id查询: Mapper.selectByPrimaryKey(ID)r
 * 查询数据. 根据条件查询: Mapper.select(T)
 *
 */

public interface BrandMapper extends Mapper<Brand> {

}
