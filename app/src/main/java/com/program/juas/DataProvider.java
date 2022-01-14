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
       tropiss.add(new Tropis(ctx.getString(R.string.Blimbing_nama), ctx.getString(R.string.Ilmiah_nama),
                ctx.getString(R.string.buah_blimbing), R.drawable.tropis_blimbing1));
        tropiss.add(new Tropis(ctx.getString(R.string.nama_buah), ctx.getString(R.string.nama_ilmiah),
                ctx.getString(R.string.deskripsi_Jambu), R.drawable.tropis_jambu2));
        tropiss.add(new Tropis(ctx.getString(R.string.nama_jeruk), ctx.getString(R.string.ilmiah_jeruk),
                ctx.getString(R.string.deskripsi_jeruk), R.drawable.tropis_jeruk3));
        tropiss.add(new Tropis(ctx.getString(R.string.nama_mangga), ctx.getString(R.string.ilmiah_mangga),
                ctx.getString(R.string.deskripsi_mangga), R.drawable.tropis_mangga4));
        tropiss.add(new Tropis(ctx.getString(R.string.nama_nanas), ctx.getString(R.string.ilmiah_nanas),
                ctx.getString(R.string.deskripsi_nanas), R.drawable.tropis_nanas5));
       tropiss.add(new Tropis(ctx.getString(R.string.nama_pisang), ctx.getString(R.string.ilmiah_nama),
                ctx.getString(R.string.deskripsi_pisang), R.drawable.tropis_pisang7));
        return tropiss;
    }

    private static List<Subtropis> initDataSuptropis(Context ctx) {
        List<Subtropis> subtropiss = new ArrayList<>();
        subtropiss.add(new Subtropis(ctx.getString(R.string.nama_anggur), ctx.getString(R.string.ilmiah_anggur),
                ctx.getString(R.string.deskripsi_anggur), R.drawable.subtropis_anggur1));
        subtropiss.add(new Subtropis(ctx.getString(R.string.nama_apel), ctx.getString(R.string.ilmiah_apel),
                ctx.getString(R.string.deskripsi_apel), R.drawable.subtropis_apel2));
        subtropiss.add(new Subtropis(ctx.getString(R.string.nama_cery), ctx.getString(R.string.ilmiah_cery),
                ctx.getString(R.string.deskripsi_cery), R.drawable.subtropis_chery3));
        subtropiss.add(new Subtropis(ctx.getString(R.string.nama_kiwi), ctx.getString(R.string.ilmiah_kiwi),
                ctx.getString(R.string.deskripsi_kiwi), R.drawable.subtropis_kiwi4));
        subtropiss.add(new Subtropis(ctx.getString(R.string.nama_pir), ctx.getString(R.string.ilmiah_pir),
                ctx.getString(R.string.deskripsi_pir), R.drawable.subtropis_pir5));
        subtropiss.add(new Subtropis(ctx.getString(R.string.nama_plum), ctx.getString(R.string.ilmiah_plum),
                ctx.getString(R.string.deskripsi_plum), R.drawable.subtropis_plum6));
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