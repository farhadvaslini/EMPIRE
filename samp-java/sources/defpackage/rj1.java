package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rj1 {
    public static final rj1 b = new rj1(new sj1(new LocaleList(new Locale[0])));
    public final sj1 a;

    public rj1(sj1 sj1Var) {
        this.a = sj1Var;
    }

    public static rj1 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new rj1(new sj1(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rj1) {
            return this.a.equals(((rj1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
