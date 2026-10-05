package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bt {
    public static final AtomicLong e = new AtomicLong(0);
    public final String a;
    public final long b;
    public final long c;
    public final long d = e.incrementAndGet();

    public bt(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt)) {
            return false;
        }
        bt btVar = (bt) obj;
        return this.a.equals(btVar.a) && wx.c(this.b, btVar.b) && this.c == btVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = wx.h;
        return Long.hashCode(this.c) + nc2.c(this.b, iHashCode, 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("ChatMessage(text=", this.a, ", color=", wx.i(this.b), ", timestamp=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
