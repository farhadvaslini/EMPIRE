package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t53 implements v53 {
    public final List a = ni0.f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t53) && this.a.equals(((t53) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(2131623985) * 31);
    }

    public final String toString() {
        return "Message(resId=2131623985, args=" + this.a + ")";
    }
}
