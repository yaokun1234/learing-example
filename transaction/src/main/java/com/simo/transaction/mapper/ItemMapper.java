package com.simo.transaction.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.simo.transaction.domain.po.Item;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ItemMapper extends BaseMapper<Item> {

}
