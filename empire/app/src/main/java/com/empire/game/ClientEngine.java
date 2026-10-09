package com.empire.game;

import android.content.Context;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Loads an authorized native game/client engine supplied by the user.
 * No proprietary GTA/SA-MP binary is bundled here.
 */
public final class ClientEngine {
    private ClientEngine() {}

    public static final class Result {
        public final boolean loaded;
        public final String message;
        Result(boolean loaded, String message) {
            this.loaded = loaded;
            this.message = message;
        }
    }

    public static Result load(Context context) {
        File dir = new File(context.getFilesDir(), "empire-data/engine/arm64-v8a");
        String[] candidates = {"libGTASA.so", "libGame.so", "libsamp.so", "libraksamp.so"};
        List<String> found = new ArrayList<>();
        for (String name : candidates) {
            File f = new File(dir, name);
            if (f.isFile() && f.length() > 0) found.add(name);
        }
        if (found.isEmpty()) {
            return new Result(false, "هسته بازی هنوز نصب نشده است.");
        }
        StringBuilder loaded = new StringBuilder();
        for (String name : found) {
            try {
                System.load(new File(dir, name).getAbsolutePath());
                if (loaded.length() > 0) loaded.append(", ");
                loaded.append(name);
            } catch (Throwable e) {
                return new Result(false, "خطا در بارگذاری " + name + ": " + e.getClass().getSimpleName());
            }
        }
        return new Result(true, "هسته native آماده است: " + loaded);
    }
}
