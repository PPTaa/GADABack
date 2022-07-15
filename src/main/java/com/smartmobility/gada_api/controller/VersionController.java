package com.smartmobility.gada_api.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartmobility.gada_api.DAO.VersionDAO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class VersionController {
	
	@Autowired
	private VersionDAO versionDao;

    // 버전관리 API
    @GetMapping("/version")
    public String versionCheck() throws Exception {
    	String version = this.versionDao.versionCall();
    	return version;
    }
}
