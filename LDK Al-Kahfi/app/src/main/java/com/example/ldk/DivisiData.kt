package com.example.ldk

import java.util.*

object DivisiData {
    private val dev =arrayOf("Tedi Setiandi","Muhamad Abdul Aziz","Reda Nursamsu")
    private val nim = arrayOf("20170810088","20170810069","20170810044")
    private val divisiNames = arrayOf(
            "LDK Al-Kahfi?",
            "Divisi Al-Qur'an",
            "Divisi Syi'ar dan Dakwah",
            "Divisi Kaderisasi",
            "Divisi Kemuslimahan",
            "Divisi Jurnalistik",
            "Divisi Pengembangan Ekonomi Islam",
            "Program Tahfidz",
            "Mentoring Agama Islam",
            "Uniku Islamic Competition")
    private val divisiDetails = arrayOf(
            "LDK Al-Kahfi (Lembaga Dakwah Kampus Al-Kahfi) ini merupakan sebuah UKM yang memiliki umur tertua diantara UKM lain di Universitas Kuningan, karena LDK ini berdiri di tahun yang sama dengan UNIKU, hanya beda beberapa bulan saja, adapun syarat untuk masuk UKM ini yaitu berstatus sebagai mahasiswa UNIKU dengan mengikuti DDK (Dauroh Dakwah Kampus) 1 dan 2.",
            "Divisi Al-Qur'an merupakan divisi paling baru di LDK Al-Kahfi, yang mana divisi ini baru didirikan tahun 2019 lalu. Dengan harapan adanya divisi Al-Qur'an ini pergerakan dakwah bisa menyebar secara menyeluruh terkhusus dibidang Qur'ani.",
            "Divisi Syi'ar dan Dakwah ini merupakan esensi dari pergerakan dakwah kampus ini karena di divisi ini terdapat proker-proker yang ditujukan untuk dakwah seperti kajian rutin, semarak ramadhan, hingga agenda terbesar di LDK yaitu UIC (Uniku Islamic Competition) sebagai peringatan milad LDK Al-Kahfi ini.",
            "Divisi Kaderisasi merupakan wadah dan pusat bagi para kader LDK, yang mana divisi ini bertugas untuk mengelola setiap anggota LDK supaya tetap bisa berjalan dengan seksama, tidak bosan dan betah berada di lingkungan LDK Al-Kahfi ini.",
            "Divisi Kemuslimahan ini merupakan divisi yang dikhususkan untuk akhwat saja, program kerja di dalamnya pun hanya ditujukan untuk akhwat saja seperti KUA (Kajian Untuk Akhwat) dan Lingkar Nisa, selain itu divisi ini juga menjadi pusat berkumpulnya para Akhwat LDK.",
            "Divisi Jurnalistik ini bisa dibilang divisi paling kece, anggota yang ada di divisi ini entah kenapa gaul semua dari bahasa dan tingkah lakunya, bisa jadi terpengaruh karena disini mereka memiliki tugas dokumentasi, desain, mengadakan pelatihan teknologi, hingga ke arah bagaimana cara menjadi jurnalis yang baik.",
            "Divisi ini sering disebut Divisi PEI, memiliki tugas untuk mengembangkan ekonomi islam yang mana keuntungan dari setiap usaha yang dikembangkan akan dialokasikan untuk keberlangsungan dakwah baik itu dari kegiatan panahan, ataupun kajian.",
            "Program Tahfidz ini merupakan merupakan program hafalan juz 'amma dan kemudian setelah menyelesaikan juz 'amma bertahap ke juz 29, dst. Karena setiap anggota LDK harus hafal setidaknya setengahnya dari juz 'amma. Sasaran program ini hanya untuk anggota LDK, belum ditujukan untuk mahasiswa umum.",
            "Mentoring Agama Islam atau sering disebut MAI ini merupakan program dari Univ langsung atas kehendak rektorat, namun dijalankan oleh LDK sebagai petugas penyelenggara. Program ini berkaitan erat dengan mahasiswa yang mengampu mata kuliah agama, karena hasil dari penilaian MAI ini akan disetorkan kepada dosen agamanya masing-masing.",
            "Uniku Islamic Competition atau sering disebut UIC ini merupakan program puncak LDK karena UIC ini diselenggarakan setiap tahun sebagai rasa syukur milad LDK ini, berbagai perlombaan islami dan bahkan tak jarang tamu atau tokoh tingkat nasional hadir ketika UIC ini berlangsung."
    )
    private val divisiImages = intArrayOf(
            R.drawable.ldk,
            R.drawable.qurani,
            R.drawable.syida,
            R.drawable.kaderisasi,
            R.drawable.kemuslimahan,
            R.drawable.jurnalistik,
            R.drawable.pei,
            R.drawable.tahfidz,
            R.drawable.mai,
            R.drawable.uic
    )
    private val picture = intArrayOf(R.drawable.tedi,R.drawable.abdl1,R.drawable.reda)
    private val bphNames = arrayOf(
            "Koordinator ada di setiap list divisi",
            "Riki Aripani",
            "Ibnu Saepuloh",
            "Muhammad Miftah Miftahhudin",
            "Nadya Suhartika",
            "Andriansyah",
            "Rifki Muhammad Firmansyah",
            "Karena program ini dikelola oleh Divisi Al-Qur'an, maka koordinatornya adalah koord. Divisi Al-Qur'an, yaitu Azmi Abdurrahman",
            "Program ini dikelola oleh Divisi Kaderisasi, maka Koordinatornya yang bertanggung jawab atas program ini yaitu Fery Fathurrahman",
            "Program puncak di LDK ini dikelola oleh Divisi Syi'ar dan Dakwah, namun karena vitalnya program ini maka secara teknis Koordinator Divisi Syi'ar dan Dakwah sebagai pelaksana, namun pada dasarnya program ini menjadi tanggung jawab penuh BPH dan seluruh pengurus LDK"
    )
    private val sekreNames = arrayOf(
            "Sekretaris divisi hanya ada disetiap list divisi",
            "Lilis Nurhasanah",
            "Mila Dwi Ningrum",
            "Linda",
            "Nova",
            "Resa Khalimatussa'diah",
            "Atih Rohaetih",
            "Yang menjadi sekretatris program ini menyesuaikan dengan divisi pengelolanya Divisi Al-Qur'an, maka yang menjadi sekretaris di program ini yaitu Lilis.",
            "Program ini sejatinya program univ, maka dalam hal kesekretariatan ada sangkut pautnya dengan pihak universitas, namun secara teknis sekretarisnya yaitu Linda selaku sekretasi Divisi yang mengelola program ini.",
            "Sekretaris dalam program ini menyesuaikan dengan struktur kepanitian yang telah disepakati."
    )
    private val bendaharaNames = arrayOf(
            "Bendahara divisi hanya akan ditampilkan di list setiap divisinya",
            "Widya Restu Fauziah",
            "Tita Samiati",
            "Pitri Rosmiati",
            "Memey Ridayanti",
            "Alvina Damayanti",
            "Elsi Solihah",
            "Bendahara program ini yaitu yang menjadi bendahara di divisi penyelenggaranya juga, karena yang penyelenggara program ini ialah divisi Al-Qur'an, maka Widya yang menjadi bendahara dalam program ini.",
            "Yang menjadi bendahara di program ini menyesuaikan dengan struktur kepanitian yang telah disepakati.",
            "Program ini merupakan program terbesar di setiap tahunnya, maka yang menjadi bendaharanya yaitu ia yang telah disepakati dalam struktur kepanitiaan dan berkolaborasi dengan bendahara umum LDK, yaitu Fofi Faujiah."
    )

    @JvmStatic
    val listData: ArrayList<Divisi>
        get() {
            val list = ArrayList<Divisi>()
            for (position in divisiNames.indices) {
                val divisi = Divisi()
                divisi.name = divisiNames[position]
                divisi.detail = divisiDetails[position]
                divisi.photo = divisiImages[position]
                divisi.bph = bphNames[position]
                divisi.sekretaris = sekreNames[position]
                divisi.bendahara = bendaharaNames[position]
                list.add(divisi)
            }
            return list
        }
    val listDev: ArrayList<Divisi>
        get() {
            val list = ArrayList<Divisi>()
            for (position in dev.indices) {
                val divisi = Divisi()
                divisi.dev = dev[position]
                divisi.nim = nim[position]
                divisi.picture = picture[position]
                list.add(divisi)
            }
            return list
        }
}