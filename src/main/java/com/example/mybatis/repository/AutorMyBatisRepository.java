/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.mybatis.repository;


import com.example.mybatis.entity.Autor;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author LAN CENTER LEONPERU
 */
@Mapper
public interface AutorMyBatisRepository {
    @Select("select * from autor")
    public List<Autor> findAll();
}
