-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Agu 2022 pada 15.55
-- Versi server: 10.4.20-MariaDB
-- Versi PHP: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_spp`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kelas`
--

CREATE TABLE `kelas` (
  `id_kelas` varchar(150) NOT NULL,
  `nama_kelas` varchar(300) NOT NULL,
  `kompetensi` varchar(200) NOT NULL,
  `wali_kelas` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kelas`
--

INSERT INTO `kelas` (`id_kelas`, `nama_kelas`, `kompetensi`, `wali_kelas`) VALUES
('K0001', 'IPA X A', 'IPS', 'IBU DEWI'),
('K0002', 'IPS X A', 'IPS', 'IBU AKILA'),
('K0003', 'IPS IX C', 'IPS', 'BAPAK AHMAD');

-- --------------------------------------------------------

--
-- Struktur dari tabel `konfir`
--

CREATE TABLE `konfir` (
  `kode_transaksi` varchar(200) NOT NULL,
  `nisn` int(200) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `kelas` varchar(200) NOT NULL,
  `angkatan` varchar(200) NOT NULL,
  `jenis` varchar(200) NOT NULL,
  `bulan` varchar(200) NOT NULL,
  `biaya` int(200) NOT NULL,
  `tgl` date NOT NULL,
  `bayar` int(200) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `konfir`
--

INSERT INTO `konfir` (`kode_transaksi`, `nisn`, `nama`, `kelas`, `angkatan`, `jenis`, `bulan`, `biaya`, `tgl`, `bayar`, `status`) VALUES
('T0004', 123123, 'siska', 'IPS X A', '2015', 'DAFTAR ULANG', 'MARET', 150000, '2022-07-04', 200000, 'BELUM LUNAS'),
('T0002', 170598, 'fachmi', 'IPA X A', '2018', 'UAS', 'MARET', 75000, '2022-07-03', 100000, 'BELUM LUNAS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` varchar(100) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(32) NOT NULL,
  `nama_petugas` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `username`, `password`, `nama_petugas`) VALUES
('P0001', 'admin', 'admin', 'santoso bonbon');

-- --------------------------------------------------------

--
-- Struktur dari tabel `siswa`
--

CREATE TABLE `siswa` (
  `nisn` int(100) NOT NULL,
  `nis` int(100) NOT NULL,
  `nama_siswa` varchar(150) NOT NULL,
  `kelas` varchar(100) NOT NULL,
  `tahun` varchar(50) NOT NULL,
  `biaya` int(200) NOT NULL,
  `kelamin` varchar(20) NOT NULL,
  `telepon` int(150) NOT NULL,
  `alamat` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `siswa`
--

INSERT INTO `siswa` (`nisn`, `nis`, `nama_siswa`, `kelas`, `tahun`, `biaya`, `kelamin`, `telepon`, `alamat`) VALUES
(31321, 123, 'tes', 'IPS X A', '2015-2016', 70000, 'laki-laki', 3131, 'dawd'),
(123123, 321, 'siska', 'IPS X A', '2015', 30000, 'perempuan', 623123, 'depok'),
(170598, 598, 'fachmi', 'IPA X A', '2018', 90000, 'laki-laki', 6232323, 'tangerang');

-- --------------------------------------------------------

--
-- Struktur dari tabel `spp`
--

CREATE TABLE `spp` (
  `kode_pembayaran` varchar(100) NOT NULL,
  `jenis_pembayaran` varchar(50) NOT NULL,
  `tahun` varchar(100) NOT NULL,
  `biaya` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `spp`
--

INSERT INTO `spp` (`kode_pembayaran`, `jenis_pembayaran`, `tahun`, `biaya`) VALUES
('P0001', 'UAS', '2015-2016', 70000),
('P0002', 'UTS', '2015-2016', 50000),
('P0003', 'AKHIR TAHUN', '2015-2016', 100000),
('P0004', 'LKS', '2015-2016', 30000),
('P0005', 'DAFTAR ULANG', '2015-2016', 150000),
('P0006', 'UAS', '2016-2017', 70000),
('P0007', 'UTS', '2016-2017', 50000),
('P0008', 'AKHIR TAHUN', '2016-2017', 100000),
('P0009', 'LKS', '2016-2017', 30000),
('P0010', 'DAFTAR ULANG', '2016-2017', 150000),
('P0011', 'UAS', '2017-2018', 75000),
('P0012', 'UTS', '2017-2018', 55000),
('P0013', 'AKHIR TAHUN', '2017-2018', 110000),
('P0014', 'LKS', '2017-2018', 35000),
('P0015', 'DAFTAR ULANG', '2017-2018', 150000),
('P0016', 'UAS', '2018-2019', 80000),
('P0017', 'UTS', '2018-2019', 55000),
('P0018', 'AKHIR TAHUN', '2018-2019', 110000),
('P0019', 'LKS', '2018-2019', 35000),
('P0020', 'DAFTAR ULANG', '2018-2019', 150000),
('P0021', 'UAS', '2019-2020', 80000),
('P0022', 'UTS', '2019-2020', 55000),
('P0023', 'AKHIR TAHUN', '2019-2020', 110000),
('P0024', 'LKS', '2019-2020', 35000),
('P0025', 'DAFTAR ULANG', '2019-2020', 150000),
('P0026', 'UAS', '2020-2021', 80000),
('P0027', 'UTS', '2020-2021', 55000),
('P0028', 'AKHIR TAHUN', '2020-2021', 120000),
('P0029', 'LKS', '2020-2021', 40000),
('P0030', 'DAFTAR ULANG', '2020-2021', 150000),
('P0031', 'UAS', '2021-2022', 80000),
('P0032', 'UTS', '2021-2022', 60000),
('P0033', 'AKHIR TAHUN', '2021-2022', 150000),
('P0034', 'LKS', '2021-2022', 40000),
('P0035', 'DAFTAR ULANG', '2021-2022', 200000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `kode_transaksi` varchar(200) NOT NULL,
  `nisn` int(200) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `kelas` varchar(200) NOT NULL,
  `angkatan` int(200) NOT NULL,
  `jenis_bayar` varchar(200) NOT NULL,
  `bulan` varchar(100) NOT NULL,
  `biaya` int(200) NOT NULL,
  `tgl` date NOT NULL,
  `bayar` int(200) NOT NULL,
  `kembali` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`kode_transaksi`, `nisn`, `nama`, `kelas`, `angkatan`, `jenis_bayar`, `bulan`, `biaya`, `tgl`, `bayar`, `kembali`) VALUES
('T0001', 170598, 'fachmi', 'IPA X A', 2018, 'UAS', 'BULAN', 70000, '2022-07-03', 100000, 30000),
('T0002', 170598, 'fachmi', 'IPA X A', 2018, 'UAS', 'MARET', 75000, '2022-07-03', 100000, 25000),
('T0004', 123123, 'siska', 'IPS X A', 2015, 'DAFTAR ULANG', 'MARET', 150000, '2022-07-04', 200000, 50000),
('T0005', 123123, 'siska', 'IPS X A', 2015, 'UTS', 'MARET', 50000, '2022-08-08', 100000, 50000),
('T0006', 170598, 'fachmi', 'IPA X A', 2018, 'UAS', 'MARET', 70000, '2022-08-09', 100000, 30000),
('T0007', 123123, 'siska', 'IPS X A', 2015, 'UAS', 'APRIL', 70000, '2022-08-09', 50000, -20000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indeks untuk tabel `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indeks untuk tabel `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nisn`),
  ADD UNIQUE KEY `telepon` (`telepon`);

--
-- Indeks untuk tabel `spp`
--
ALTER TABLE `spp`
  ADD PRIMARY KEY (`kode_pembayaran`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kode_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
