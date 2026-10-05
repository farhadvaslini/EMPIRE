package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sm1 {
    public final Matcher a;
    public final CharSequence b;
    public final rm1 c;
    public qm1 d;

    public sm1(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new rm1(0, this);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new qm1(this);
        }
        qm1 qm1Var = this.d;
        qm1Var.getClass();
        return qm1Var;
    }

    public final l41 b() {
        Matcher matcher = this.a;
        return y02.S(matcher.start(), matcher.end());
    }

    public final sm1 c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return n32.b(matcher2, iEnd, charSequence);
    }
}
