package net.smktarunabhakti.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import net.smktarunabhakti.penjualan.dao.barangDao;
import net.smktarunabhakti.penjualan.domain.barang;
import net.smktarunabhakti.penjualan.service.AppService;

@SuppressWarnings("unchecked")
@Service("appService")
@Transactional

public class AppServiceImpl implements AppService {
	
	@Autowired
	public barangDao barangDao;

	public void saveBarang(barang b) {
		// TODO Auto-generated method stub
		barangDao.save(b);
	}

	public void deleteBarang(barang b) {
		// TODO Auto-generated method stub
		if (b == null || b.getId() == null) {
			return;
		}
		barangDao.delete(b);
	}

	public Page<barang> searchSemuaBarang(Pageable p) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public barang searchBarangById(String id) {
		// TODO Auto-generated method stub
		if (!StringUtils.hasText(id)) {
			return null;
		}
		return barangDao.findOne(id);
	}

	public Long countSemuaBarang() {
		// TODO Auto-generated method stub
		return barangDao.count();
	}

	public Page<barang> searchSemuaBarang(java.awt.print.Pageable p) {
		// TODO Auto-generated method stub
		return null;
	}

}
