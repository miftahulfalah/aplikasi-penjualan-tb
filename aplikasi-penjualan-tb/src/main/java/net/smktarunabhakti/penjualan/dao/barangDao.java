package net.smktarunabhakti.penjualan.dao;

import net.smktarunabhakti.penjualan.domain.barang;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface barangDao extends PagingAndSortingRepository<barang, String> {
	
}
