package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class qi {
    public static final List a = vr.L("zh", "en", "ru");

    public static String a() {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = language.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase.equals("zh") ? "zh" : lowerCase.equals("ru") ? "ru" : "en";
    }

    public static String b(String str) {
        str.getClass();
        return a.contains(str) ? str : a();
    }

    public static ContextWrapper c(Context context, String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(b(str));
        Locale.setDefault(localeForLanguageTag);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocales(new LocaleList(localeForLanguageTag));
        return new ContextWrapper(context.createConfigurationContext(configuration));
    }
}
