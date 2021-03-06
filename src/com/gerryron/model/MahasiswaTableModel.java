package com.gerryron.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.gerryron.Entity.Mahasiswa;

public class MahasiswaTableModel extends AbstractTableModel{

	private static final int NIM = 0;
	private static final int NAMA = 1;
	private static final int PRODI = 2;
	
	private String[] columnNames = { "NIM", "NAMA", "PRODI"};
	private List<Mahasiswa> listMahasiswa;
	
	public MahasiswaTableModel(List<Mahasiswa> listMahasiswa) {
		this.listMahasiswa = listMahasiswa;
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	@Override
	public int getRowCount() {
		return listMahasiswa.size();
	}
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {
		
		Mahasiswa mahasiswa = listMahasiswa.get(row);

		switch (col) {
		case NIM:
			return mahasiswa.getNim();
		case NAMA:
			return mahasiswa.getNama();
		case PRODI:
			return mahasiswa.getProdi();
		default:
			return mahasiswa.getNim();
		}
	}
	
	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

}
