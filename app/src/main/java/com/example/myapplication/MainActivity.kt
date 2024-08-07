package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .verticalScroll(scrollState)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "QUIZ Afif", style = TextStyle(fontWeight = FontWeight.Bold,fontSize = 20.sp))
        Text(text = "MK Mobile Programming TI21K1", style = TextStyle())

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Nim", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
            Column(modifier = Modifier.weight(0.1f)) {
                Text(text = ":", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
            Column(modifier = Modifier.weight(2f)) {
                Text(text = "20211085", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
        }
        Row {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Nama", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
            Column(modifier = Modifier.weight(0.1f)) {
                Text(text = ":", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
            Column(modifier = Modifier.weight(2f)) {
                Text(text = "Muhamad Afif", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
        }
        Row {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Kelas", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
            Column(modifier = Modifier.weight(0.1f)) {
                Text(text = ":", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
            Column(modifier = Modifier.weight(2f)) {
                Text(text = "TI21K1", style = TextStyle(color = Color.Black, fontSize = 16.sp))
            }
        }
        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
        QuestionRow(number = "1.", question = "Android telah berkembang pesat sejak pertama kali diperkenalkan. Berikut adalah beberapa tonggak penting dalam perkembangannya:\n" +
                "\n" +
                "2008: Android 1.0 (Alpha) \nAndroid 1.0 dirilis, dengan fitur dasar seperti web browser, email, dan Google Maps.\n\n" +
                "2009: Android 1.5 (Cupcake) \nAndroid 1.5 Cupcake memperkenalkan keyboard virtual dan dukungan untuk widget pihak ketiga.\n\n" +
                "2010:Android 2.2 (Froyo) \nAndroid 2.2 Froyo meningkatkan kinerja dan menambahkan fitur hotspot Wi-Fi.\n\n" +
                "2011:Android 3.0 (Honeycomb) \nAndroid 3.0 Honeycomb, dirancang khusus untuk tablet, memperkenalkan antarmuka pengguna baru.\n\n" +
                "2012:Android 4.0 (Ice Cream Sandwich) \nAndroid 4.1 Jelly Bean meningkatkan performa dan responsivitas dengan Project Butter.\n\n" +
                "2013: Android 4.4 (KitKat)\nAndroid 4.4 KitKat memperkenalkan desain yang lebih ringan dan fitur seperti OK Google.\n\n" +
                "2014:Android 5.0 (Lollipop) \nAndroid 5.0 Lollipop memperkenalkan Material Design, yang mengubah antarmuka pengguna secara signifikan.\n\n" +
                "2015:Android 6.0 (Marshmallow)\nAndroid 6.0 Marshmallow menambahkan izin aplikasi yang lebih baik dan Google Now on Tap.\n\n" +
                "2016:Android 7.0 (Nougat) \nAndroid 7.0 Nougat memperkenalkan mode layar terbagi dan notifikasi yang ditingkatkan.\n\n" +
                "2017:Android 8.0 (Oreo) \nAndroid 8.0 Oreo meningkatkan kinerja dan menambahkan fitur seperti Picture-in-Picture dan autofill.\n\n" +
                "2018: Android 9.0 (Pie)\nAndroid 9.0 Pie memperkenalkan navigasi berbasis gestur dan Digital Wellbeing.\n\n" +
                "2019:Android 10 \nAndroid 10 memperkenalkan mode gelap di seluruh sistem dan navigasi gestur yang lebih baik.\n\n" +
                "2020:Android 11\nAndroid 11 menambahkan kontrol media baru, riwayat notifikasi, dan izin satu kali.\n\n" +
                "2021:Android 12\nAndroid 12 memperkenalkan desain Material You, yang memungkinkan penyesuaian warna yang lebih mendalam.\n")
        QuestionRow(number = "2.", question = "SDK Android menyediakan berbagai alat yang membantu pengembangan aplikasi, antara lain:\n" +
                "\n" +
                "Android Studio:\nIDE resmi untuk pengembangan Android, dilengkapi dengan fitur seperti editor kode, emulator, dan alat debugging.\n\n" +
                "Emulator Android:\nMemungkinkan pengujian aplikasi di berbagai perangkat virtual.\n\n" +
                "ADB (Android Debug Bridge):\nAlat command-line untuk berinteraksi dengan perangkat Android.\n\n" +
                "Lint: Alat untuk menganalisis kode dan mendeteksi masalah potensial.\n\n" +
                "AVD Manager:\nMengelola perangkat virtual untuk pengujian aplikasi.\n\n" +
                "Gradle:\nSistem build otomatis yang digunakan untuk mengompilasi dan mendistribusikan aplikasi.\n\n" +
                "ProGuard:\nAlat untuk mengecilkan, mengoptimalkan, dan melindungi kode Java.\n\n" +
                "Layout Editor:\nAlat visual untuk merancang antarmuka pengguna.\n\n" +
                "APK Analyzer:\nMembantu memeriksa konten APK dan mengidentifikasi masalah ukuran.\n\n" +
                "Firebase:\nPlatform yang menyediakan berbagai layanan untuk pengembangan aplikasi, seperti analitik, autentikasi, dan penyimpanan.\n")
        QuestionRow(number = "3.", question = "dp (Density-independent Pixels):\nUntuk ukuran elemen layout dan UI yang tidak berhubungan dengan teks. Digunakan untuk menentukan ukuran layout dan elemen UI seperti margin, padding, dan ukuran elemen lainnya.\n\n" +
                "sp (Scale-independent Pixels):\nDigunakan untuk menentukan ukuran teks. Biasanya digunakan untuk ukuran font.\n")
        QuestionRow(number = "4.", question = "Activity:\nKomponen dasar dalam aplikasi Android yang mewakili satu layar dengan antarmuka pengguna. Setiap aktivitas bertanggung jawab untuk memulai, menampilkan, dan mengelola interaksi pengguna di layar tertentu. Misalnya, satu aktivitas bisa menampilkan daftar item, sementara aktivitas lainnya menampilkan detail item yang dipilih. Siklus hidup aktivitas dikelola oleh sistem Android, termasuk tahapan seperti pembuatan, mulai, jalankan, berhenti, dan penghancuran.\n\n" +
                "Intent:\nMekanisme untuk berkomunikasi antar komponen aplikasi. Intent digunakan untuk memulai aktivitas, layanan, atau mengirim broadcast. Intent bisa berupa explicit (menyebutkan komponen tujuan secara langsung) atau implicit (menentukan tindakan yang diinginkan dan membiarkan sistem menentukan komponen yang bisa menangani). Intent membawa informasi seperti tindakan yang diinginkan, data yang relevan, dan kategori, yang memungkinkan fleksibilitas dalam bagaimana aplikasi berinteraksi satu sama lain.\n")
        QuestionRow(number = "5.", question = "Seorang desainer perlu memperhatikan beberapa aspek penting saat merancang aplikasi Android:\n" +
                "\n" +
                "User Experience:\nKemudahan Penggunaan: Pastikan aplikasi mudah dinavigasi dan intuitif bagi pengguna. Struktur yang jelas dan aliran pengguna yang logis sangat penting.\n" +
                "Feedback Pengguna:\nImplementasikan feedback visual (seperti perubahan warna, animasi, atau pesan) untuk memberi tahu pengguna bahwa tindakan mereka diterima.\n" +
                "Responsivitas: Pastikan aplikasi responsif dan berfungsi dengan baik di berbagai perangkat dan ukuran layar..\n\n" +
                "Aksesibilitas:\nPastikan desain dapat diakses oleh semua pengguna, termasuk mereka dengan keterbatasan fisik atau sensorik. Ini termasuk teks yang dapat diperbesar, kontras warna yang cukup, dan navigasi yang bisa diakses dengan pembaca layar.\n\n" +
                "Fungsionalitas:\nDesain harus memperhatikan kinerja aplikasi. Elemen berat seperti gambar resolusi tinggi atau animasi kompleks dapat memperlambat aplikasi.\n\n" +
                "Navigasi yang Mudah:\nPastikan navigasi aplikasi intuitif dan mudah diikuti. Gunakan elemen navigasi seperti bottom navigation, drawer, atau tab sesuai kebutuhan.\n\n" +
                "Performa:\nRancang antarmuka yang ringan dan cepat. Hindari elemen visual yang berat yang dapat memperlambat aplikasi.\n\n" +
                "Internasionalisasi:\nPertimbangkan adaptasi antarmuka untuk berbagai bahasa dan format regional. Gunakan string resources dan layout yang fleksibel.\n\n" +
                "Keamanan:\nData Security: Desain harus mempertimbangkan cara aman untuk mengumpulkan, menyimpan, dan mentransfer data pengguna.\n\n" +
                "Umpan Balik Pengguna: Berikan umpan balik yang jelas untuk interaksi pengguna, seperti animasi, perubahan warna, atau pesan konfirmasi.\n\n" +
                "Dengan memperhatikan aspek-aspek ini, desainer dapat memastikan bahwa aplikasi yang dirancang tidak hanya menarik secara visual, tetapi juga fungsional, dapat diakses, dan menyenangkan untuk digunakan.")
        }
}

@Composable
fun QuestionRow(number: String, question: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(vertical = 4.dp)) {
        Text(text = number, style = TextStyle(color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = question, style = TextStyle(color = Color.Black, fontSize = 12.sp))
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}