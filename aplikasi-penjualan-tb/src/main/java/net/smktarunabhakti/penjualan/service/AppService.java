package net.smktarunabhakti.penjualan.service;


import java.awt.print.Pageable;

import org.springframework.data.domain.Page;

import net.smktarunabhakti.penjualan.domain.barang;

public interface AppService {
	
	void saveBarang(barang b);
	
	void deleteBarang(barang b);
	
	Page<barang> searchSemuaBarang
		(Pageable p);
	
	barang searchBarangById(String id);
	
	Long countSemuaBarang();
	
}
