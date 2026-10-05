package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public interface bq1 {
    Object a(rs0 rs0Var, Object obj);

    boolean b(ns0 ns0Var);

    default bq1 d(bq1 bq1Var) {
        return bq1Var == yp1.a ? this : new cz(this, bq1Var);
    }
}
