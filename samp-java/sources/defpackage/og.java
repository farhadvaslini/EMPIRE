package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class og {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static rj1 b(Configuration configuration) {
        return rj1.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(rj1 rj1Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(rj1Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, rj1 rj1Var) {
        configuration.setLocales(LocaleList.forLanguageTags(rj1Var.a.a.toLanguageTags()));
    }
}
