package com.yk.mapper;

import com.yk.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
//getSqlSession();是SqlSessionDaoSupport写的
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}