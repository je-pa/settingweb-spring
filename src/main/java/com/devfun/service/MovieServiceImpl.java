package com.devfun.service;

import com.devfun.dao.MovieDao;
import com.devfun.vo.MovieVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    private final MovieDao dao;

    public MovieServiceImpl(MovieDao dao) {
        this.dao = dao;
    }

    @Override
    public List<MovieVo> selectMovie() throws Exception {
        return dao.selectMovie();
    }
}
