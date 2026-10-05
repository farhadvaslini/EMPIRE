package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q92 {
    public final String a;
    public final Set b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;

    public q92(String str, Set set, Integer num, String str2, String str3, String str4) {
        this.a = str;
        this.b = set;
        this.c = num;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q92)) {
            return false;
        }
        q92 q92Var = (q92) obj;
        return this.a.equals(q92Var.a) && this.b.equals(q92Var.b) && s51.n(this.c, q92Var.c) && s51.n(this.d, q92Var.d) && s51.n(this.e, q92Var.e) && s51.n(this.f, q92Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "PluginRecoveryReport(sessionId=" + this.a + ", enabledPluginIds=" + this.b + ", signalNumber=" + this.c + ", suspectedPluginId=" + this.d + ", lastCallback=" + this.e + ", rollbackVersion=" + this.f + ")";
    }
}
