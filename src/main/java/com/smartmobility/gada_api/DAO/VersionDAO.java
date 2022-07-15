package com.smartmobility.gada_api.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smartmobility.gada_api.DTO.TaxiListDTO;

@Mapper
public interface VersionDAO {
	String versionCall() throws Exception;

}
