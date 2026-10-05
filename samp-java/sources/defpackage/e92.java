package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class e92 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public e92(String str, String str2, String str3, ai1 ai1Var) {
        ai1Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ai1Var;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e92)) {
            return false;
        }
        e92 e92Var = (e92) obj;
        return this.a.equals(e92Var.a) && this.b.equals(e92Var.b) && this.c.equals(e92Var.c) && s51.n(this.d, e92Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("PluginMenuPage(pluginId=", this.a, ", pageId=", this.b, ", title=");
        sbN.append(this.c);
        sbN.append(", controls=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
