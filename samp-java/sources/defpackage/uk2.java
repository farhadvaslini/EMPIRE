package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uk2 implements Serializable {
    public final Pattern f;

    public uk2(int i, String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.f = patternCompile;
    }

    public final sm1 a(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.f.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new sm1(matcherRegion, str);
        }
        return null;
    }

    public final sm1 b(String str) {
        str.getClass();
        Matcher matcher = this.f.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new sm1(matcher, str);
        }
        return null;
    }

    public final boolean c(CharSequence charSequence) {
        charSequence.getClass();
        return this.f.matcher(charSequence).matches();
    }

    public final String toString() {
        String string = this.f.toString();
        string.getClass();
        return string;
    }

    public uk2(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.f = patternCompile;
    }
}
