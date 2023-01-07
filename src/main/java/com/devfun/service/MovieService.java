package com.devfun.service;

import com.devfun.vo.MovieVo;

import java.util.List;

public interface MovieService {
    public List<MovieVo> selectMovie() throws Exception;
}
