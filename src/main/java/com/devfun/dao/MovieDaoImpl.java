package com.devfun.dao;

import com.devfun.vo.MovieVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao{

    private final SqlSession sqlSession;
    private static final String Namespace = "com.devfun.mybatis.sql.test";

    public MovieDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<MovieVo> selectMovie() throws Exception {

        return sqlSession.selectList(Namespace+".selectMovie");
    }
}
