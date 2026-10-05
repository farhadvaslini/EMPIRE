package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ig2 implements mg2 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ig2(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig2)) {
            return false;
        }
        ig2 ig2Var = (ig2) obj;
        return this.a.equals(ig2Var.a) && this.b.equals(ig2Var.b) && this.c == ig2Var.c && this.d == ig2Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + nc2.b(this.c, by1.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Connected(serverAddress=", this.a, ", serverName=", this.b, ", playerCount=");
        sbN.append(this.c);
        sbN.append(", maxPlayers=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
