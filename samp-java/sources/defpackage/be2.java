package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class be2 {
    public static final be2 c = new be2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final yl1 a = new yl1(0);

    public final qr2 a(Class cls) {
        tk0 tk0Var;
        qr2 qr2VarW;
        Class cls2;
        c51.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        qr2 qr2Var = (qr2) concurrentHashMap.get(cls);
        if (qr2Var != null) {
            return qr2Var;
        }
        yl1 yl1Var = this.a;
        yl1Var.getClass();
        Class cls3 = rr2.a;
        if (!wv0.class.isAssignableFrom(cls) && (cls2 = rr2.a) != null && !cls2.isAssignableFrom(cls)) {
            c.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        yi2 yi2VarA = ((xl1) yl1Var.g).a(cls);
        if ((yi2VarA.d & 2) == 2) {
            if (wv0.class.isAssignableFrom(cls)) {
                qr2VarW = new yo1(rr2.c, uk0.a, yi2VarA.a);
            } else {
                fm3 fm3Var = rr2.b;
                tk0 tk0Var2 = uk0.b;
                if (tk0Var2 == null) {
                    c.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                qr2VarW = new yo1(fm3Var, tk0Var2, yi2VarA.a);
            }
        } else if (wv0.class.isAssignableFrom(cls)) {
            sw1 sw1Var = tw1.b;
            ci1 ci1Var = di1.b;
            fm3 fm3Var2 = rr2.c;
            tk0 tk0Var3 = nc2.z(yi2VarA.a()) != 1 ? uk0.a : null;
            jm1 jm1Var = km1.b;
            if (!(yi2VarA instanceof yi2)) {
                int[] iArr = xo1.n;
                qn1.b();
                return null;
            }
            qr2VarW = xo1.w(yi2VarA, sw1Var, ci1Var, fm3Var2, tk0Var3, jm1Var);
        } else {
            sw1 sw1Var2 = tw1.a;
            ci1 ci1Var2 = di1.a;
            fm3 fm3Var3 = rr2.b;
            if (nc2.z(yi2VarA.a()) != 1) {
                tk0 tk0Var4 = uk0.b;
                if (tk0Var4 == null) {
                    c.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                tk0Var = tk0Var4;
            } else {
                tk0Var = null;
            }
            jm1 jm1Var2 = km1.a;
            if (!(yi2VarA instanceof yi2)) {
                int[] iArr2 = xo1.n;
                qn1.b();
                return null;
            }
            qr2VarW = xo1.w(yi2VarA, sw1Var2, ci1Var2, fm3Var3, tk0Var, jm1Var2);
        }
        qr2 qr2Var2 = (qr2) concurrentHashMap.putIfAbsent(cls, qr2VarW);
        return qr2Var2 != null ? qr2Var2 : qr2VarW;
    }
}
