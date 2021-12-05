package com.program.juas;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.program.juas.model.Subtropis;
import com.program.juas.model.Buah;
import com.program.juas.model.Tropis;

public class DataProvider {
    private static List<Buah> buahs = new ArrayList<>();

    private static List<Tropis> initDataTeropis(Context ctx) {
        List<Tropis> tropiss = new ArrayList<>();
       tropiss.add(new Tropis("Blimbing", "Averrhoa carambola",
                "Belimbing termasuk satu jenis buah tropis yang sudah lama dikenal dan ditanam di Indonesia.", R.drawable.tropis_blimbing1));
        tropiss.add(new Tropis("Jambu", "Psidium guajava",
                "jambu biji (Psidium guajava L) mengandung berbagai senyawa metabolit sekunder antara lain tanin, minyak atsiri, flavonoid, dan saponin.", R.drawable.tropis_jambu2));
        tropiss.add(new Tropis("jeruk Nipis", "Citrus × aurantiifolia",
                "Jeruk nipis merupakan jenis tumbuhan yang masuk kedalam suku jeruk-jerukan, tersebar di Asia Dan Amerika Tengah dikenal juga sebagai jeruk pecel.", R.drawable.tropis_jeruk3));
        tropiss.add(new Tropis("Mangga", "Mangifera indica",
                "Pohon mangga termasuk tumbuhan tingkat tinggi yang bentuk batangnya termasuk kumpulan arboreus, yaitu tumbuhan berkayu yang mempunyai tinggi batang lebih dari 5 m.", R.drawable.tropis_mangga4));
        tropiss.add(new Tropis("Nanas", "Ananas comosus",
                "Nanas adalah tumbuhan tropis dengan buah yang dapat dimakan dan tumbuhan yang paling penting secara ekonomi dalam famili Bromeliaceae.", R.drawable.tropis_nanas5));
       tropiss.add(new Tropis("Pisang", "Musa",
                "Pisang adalah nama umum yang diberikan pada tumbuhan terna berukuran besar dengan daun memanjang dan besar yang tumbuh langsung dari bagian tangkai.", R.drawable.tropis_pisang7));
        return tropiss;
    }

    private static List<Subtropis> initDataSuptropis(Context ctx) {
        List<Subtropis> subtropiss = new ArrayList<>();
        subtropiss.add(new Subtropis("Anggur", "Vitis",
                "Buah anggur yang mempunyai nama latin Vitis Vinivera ini mengandung magnesium yang tinggi, terutama terkandung pada kulitnya.", R.drawable.subtropis_anggur1));
        subtropiss.add(new Subtropis("Apel", "Malus",
                "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel.", R.drawable.subtropis_apel2));
        subtropiss.add(new Subtropis("Chery", "Prunus subg. Cerasus",
                "Ceri adalah subgenus tumbuhan dari Prunus, dengan ciri-ciri memiliki bunga corymbs kecil majemuk, dan memiliki buah yang halus dengan hanya alur lemah di satu sisi, atau tidak ada alur.", R.drawable.subtropis_chery3));
        subtropiss.add(new Subtropis("Kiwi", "Actinidia deliciosa",
                "kiwi atau Gosberi China adalah nama yang diberikan kepada buah beri yang bisa dimakan dari beberapa jenis tanaman kayu merambat dalam genus Actinidia.", R.drawable.subtropis_kiwi4));
        subtropiss.add(new Subtropis("Pir", "Pyrus",
                "Buah yang memiliki nama latin Pyrus communis merupakan tanaman buah dari genus Pyrus yang menghasilkan buah segar saat dimakan karena mengandung banyak air, dengan tekstur masir dan manis.", R.drawable.subtropis_pir5));
        subtropiss.add(new Subtropis("Plum", "Prunus domestica",
                "Prem merupakan bagian dari genus Prunus, subgenus Prunus.", R.drawable.subtropis_plum6));
        return subtropiss;
    }

    private static void initAllBuahs(Context ctx) {
        buahs.addAll(initDataTeropis(ctx));
        buahs.addAll(initDataSuptropis(ctx));
    }

    public static List<Buah> getAllBuah(Context ctx) {
        if (buahs.size() == 0) {
            initAllBuahs(ctx);
        }
        return  buahs;
    }

    public static List<Buah> getBuahsByTipe(Context ctx, String jenis) {
        List<Buah> buahsByType = new ArrayList<>();
        if (buahs.size() == 0) {
            initAllBuahs(ctx);
        }
        for (Buah h : buahs) {
            if (h.getJenis().equals(jenis)) {
                buahsByType.add(h);
            }
        }
        return buahsByType;
    }

}