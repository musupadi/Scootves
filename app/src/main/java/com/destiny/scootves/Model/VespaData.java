package com.destiny.scootves.Model;

import java.util.ArrayList;

public class VespaData {
    public static String[][] data = new String[][]{
            {"VESPA 98",
                    "1946",
                    "ada bulan April 1946, sebuah model transportasi baru yang fungsional dan inovatif dipublikaskan pertamakalinya kepada masyarakat umum di acara Golf Club, Roma. Dengan tameng yang dilengkapi oleh logo timbul guna menggantikan lambang Pesawat Piaggio sebelumnya, Vespa lantas menjadi sebuah kesuksesan besar dan sorotan media massa. Vespa-pun berhasil menarik perhatian publik, memberikan kejutan, namun juga keraguan. Saat itu, penjualan pertama Vespa bermula dari dealer kecil dengan harga 55.000 Lira untuk model standar, sedangkan model deluxe dibanderol seharga 66.000 Lira",
                    "https://www.vespa.com/dam/jcr:7ff9ee8e-c276-4148-bf25-58f7e74da6bf/vespa%2098-%201946.jpg"
            },
            {"VESPA 98 CORSA CIRCUITO",
                    "1947",
                    "Vespa 98 Corsa diciptakan khusus untuk menunjukkan kepada dunia bahwa scooter kecil juga dapat bersaing di arena balap.Vespa yang semakin banyak terlihat di jalanan dan alun-alun kota Italia, membuat Enrico Piaggio termotivasi untuk menciptakan scooterbaru yang agresif untuk menjadi pemenang di arena balap. Giuseppe Cau merupakan orang pertama yang menggunakan Vespa 98 di sirkuit dan berhasil keluar sebagai pemenang di Climb Monte Mario Hill pada tahun 1947. Vespa 98 Corsa (Circuit) merupakan kombinasi antara kecepatan dan inovasi; body-nya dirakit oleh tangan menggunakan rangka baja; rem tromolnya dilengkapi dengan ventilasi udara belakang untuk sistem cooling; serta memiliki tiga persneling guna memastikan bahwa kontrol katup dan sistem coolingdapat terjadi melalui ventilasi udara. Dikenal dengan warna originalmerah, Vespa 98 Corsa ini dijuluki sebagai si \"bola api\" kecil.",
                    "https://www.vespa.com/dam/jcr:d42a7813-9ccb-4416-a828-a6db315749ba/vespa%2098%20Corsa%20Circuito-%201947.jpg"
            },
            {"VESPA 98 II SERIE",
                    "1947",
                    "Seri kedua dari Vespa 98 diproduksi sebanyak 16.500 unit. Model ini menawarkan perubahan yang signifikan dari model pendahulunya, baik dari segi estetika maupun teknis. Model tersebut juga dilengkapi oleh ban serep untuk berjaga-jaga apabila pengendara mengalami kempes ban, dimana hal tersebut sangatlah mungkin terjadi karena kondisi jalan yang buruk paska perang. Elemen tersebut akhirnya menjadi fitur desain Vespa yang paling dikenal karena alasannya yang sangat fungsional. Vespa 98 juga hadir dengan lampu depan baru dengan warna silver metalik yang mengingatkan kita akan perusahaan pesawat Piaggio terdahulu. Beberapa majalah pun memberitakan bahwa penjualan Vespa 98 telah mencapai 8 bulan waitlist. Hal ini akhirnya membuka peluang bagi pasar gelap untuk turut ambil bagian dengan membanderol harga Vespa 2 kali lipat, yakni mencapai 125.000 Lira!",
                    "https://www.vespa.com/dam/jcr:539ccd41-714f-44c3-9958-d3e55b59f244/Vespa%2098%20II%20Seire-1947-1948%20.jpg"
            },
            {"VESPA 125 CORSA ALLOY FRAME",
                    "1949",
                    "Pada tahun 1949, Vespa pertama kalinya diciptakan dengan sasis balap yang terbuat dari aluminium, yang digunakan pada konstruksi pesawat, kemudian dirakit menggunakan paku rivet, dilengkapi dengan velg dan teknologi yang muktahir di tahun 40an.",
                    "https://www.vespa.com/dam/jcr:5535b59a-93b7-4925-8c9f-708d5b8261f1/vespa%20125%20Corsa%20alloy%20frame.jpg",

            },
            {"VESPA125",
                    "1949",
                    "Pada tahun 1948 Piaggio meluncurkan Vespa baru. Antara tahun 1946 dan 1947, sebanyak 1183 unit Vespa 125cc dijual dan dipasarkan di luar negeri (terutama di Swiss). Pada akhir tahun 1947 Enrico Piaggio memutuskan untuk menghentikan produksi Vespa 98cc, dan hanya menjual Vespa 125cc baik untuk pasar Italia maupun penjualan internasional. Beberapa model baru juga telah dilengkapi oleh lengan suspensi depan, dan kap mesin yang dibuat lebih terbuka untuk memudahkan akses ke mesin dan komponen mekanis lainnya. Seri Vespa tahun 1949 berikutnya, yang kini dipamerkan di Museum Piaggio, tampak lebih baik dengan sistem cooling dan kontrol persneling yang baru.",
                    "https://www.vespa.com/dam/jcr:e47728cf-3349-4121-8f5f-711eb191326d/Vespa%20125-%201949.jpg"
            },
            {"VESPA CIRCUITO 125",
                    "1949",
                    "Di akhir tahun 40an, produsen sepeda motor mulai beranggapan bahwa cara terbaik untuk mengiklankan kendaraan mereka adalah dengan berpartisipasi dalam arena balap. Tujuannya yakni untuk meningkatkan potensi pelanggan baru dengan cara mengangkat industri sepeda motor ini ke ranah publik. Beberapa motor Piaggio telah berpartisipasi dalam rangkaian sirkuit balap; yang awalnya hanya bertujuan untuk mengiklankan produk, namun ternyata 125 sirkuit tersebut juga dapat digunakan untuk menguji kemampuan motor baru, yang kemudian mampu menimbulkan adaptasi baru dari model standar. Motor balap vespa yang dibuat secara handmade oleh para spesialis Piaggio telah digunakan oleh beberapa pembalap terkenal sepeeti Dino Mazzoncini dan Giuseppe Cau. Giuseppe Cau pun telah memenangkan waktu balap pada Catania Etna di tahun 1950, dengan menjadi yang tercepat di kelasnya (125cc), dan berhasil meraih posisi 3 dalam klasemen keseluruhan setelah Guzzi dan Benelli.",
                    "https://www.vespa.com/dam/jcr:20480ed3-a616-4c2f-a76d-764c9678239e/Vespa%20Circuito%20125-%201949.jpg",
            },

    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setNamaVespa(aData[0]);
            model.setTahunVespa(aData[1]);
            model.setDetailVespa(aData[2]);
            model.setGambarVespa(aData[3]);
            list.add(model);
        }

        return list;
    }
}
