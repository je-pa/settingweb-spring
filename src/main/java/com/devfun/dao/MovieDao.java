package com.devfun.dao;

import com.devfun.vo.MovieVo;

import java.util.List;

public interface MovieDao {
    public List<MovieVo> selectMovie() throws Exception;
}
