package com.yang.mall.mapper;

import com.yang.mall.model.UmsMemberReceiveAddress;
import com.yang.mall.model.UmsMemberReceiveAddressExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress>, MySqlMapper<UmsMemberReceiveAddress> {
    long countByExample(UmsMemberReceiveAddressExample example);

    int deleteByExample(UmsMemberReceiveAddressExample example);

    int deleteByPrimaryKey(Long id);

    @Override
    int insert(UmsMemberReceiveAddress record);

    @Override
    int insertSelective(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> selectByExample(UmsMemberReceiveAddressExample example);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    int updateByExample(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    @Override
    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    @Override
    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}