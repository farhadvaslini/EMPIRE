package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n41 {
    public int a = 0;

    public final String toString() {
        int i = this.a;
        int iHashCode = hashCode();
        ur.r(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "IntRef(element = " + i + ")@" + string;
    }
}
