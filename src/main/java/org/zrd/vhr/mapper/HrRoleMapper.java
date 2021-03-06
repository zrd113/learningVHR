package org.zrd.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.zrd.vhr.bean.HrRole;

public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    void deleteByHrid(Integer hrid);

    int addRole(@Param("hrid") Integer hrid, @Param("rids") Integer[] rids);
}