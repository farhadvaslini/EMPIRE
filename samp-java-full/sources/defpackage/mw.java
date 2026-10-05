package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mw {
    public final String a;
    public final String b;
    public final List c;

    public mw(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw)) {
            return false;
        }
        mw mwVar = (mw) obj;
        return s51.n(this.a, mwVar.a) && s51.n(this.b, mwVar.b) && this.c.equals(mwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + by1.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("PackageRecord(id=", this.a, ", version=", this.b, ", files=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
