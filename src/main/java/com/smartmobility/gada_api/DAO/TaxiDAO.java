package com.smartmobility.gada_api.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smartmobility.gada_api.DTO.TaxiInfoDTO;
import com.smartmobility.gada_api.DTO.TaxiListDTO;

@Mapper
public interface TaxiDAO {
	List<TaxiListDTO> selectAll() throws Exception;

	List<TaxiListDTO> selectAllByRegion(String division) throws Exception;
	
	TaxiInfoDTO selectTaxiInfoByIdx(int idx) throws Exception;
}
