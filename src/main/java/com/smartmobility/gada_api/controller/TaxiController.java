package com.smartmobility.gada_api.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smartmobility.gada_api.DAO.TaxiDAO;
import com.smartmobility.gada_api.DTO.TaxiInfoDTO;
import com.smartmobility.gada_api.DTO.TaxiListDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TaxiController {
	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private TaxiDAO taxiDao;

	@GetMapping("/taxi_list")
	public List<TaxiListDTO> taxiList() throws Exception {
		List<TaxiListDTO> list = taxiDao.selectAll();
		return list;
	}
	
	@GetMapping("/taxi_list_by_division")
	public List<TaxiListDTO> taxiListByDivision(@RequestParam("division") String division) throws Exception {
		List<TaxiListDTO> list = taxiDao.selectAllByRegion(division);
		return list;
	}

	@GetMapping("/taxi_info_by_idx")
	public TaxiInfoDTO taxiInfoByIdx(@RequestParam("idx") int idx) throws Exception {
		TaxiInfoDTO info = taxiDao.selectTaxiInfoByIdx(idx);
		return info;
	}

}
