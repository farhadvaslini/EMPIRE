package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class s20 {
    public static final r93 a = new r93(new v3(26));
    public static final r93 b = new r93(new v3(26));
    public static final r93 c = new r93(new q20(0));
    public static final r93 d = new r93(new q20(1));
    public static final r93 e = new r93(new q20(2));
    public static final r93 f = new r93(new q20(3));
    public static final r93 g = new r93(new q20(4));
    public static final r93 h = new r93(new q20(5));
    public static final r93 i = new r93(new q20(6));
    public static final r93 j = new r93(new q20(8));
    public static final r93 k = new r93(new q20(7));
    public static final r93 l = new r93(new q20(9));
    public static final r93 m = new r93(new q20(10));
    public static final r93 n = new r93(new q20(11));
    public static final r93 o = new r93(new q20(12));
    public static final r93 p = new r93(new v3(26));
    public static final r93 q = new r93(new v3(26));
    public static final r93 r = new r93(new q20(13));
    public static final r93 s = new r93(new q20(14));
    public static final r93 t = new r93(new q20(15));
    public static final r93 u = new r93(new q20(16));
    public static final r93 v = new r93(new v3(27));
    public static final r93 w = new r93(new v3(26));
    public static final t20 x = new t20(new v3(28));
    public static final r93 y = new r93(new v3(29));

    public static final void a(q12 q12Var, jc jcVar, d00 d00Var, nv0 nv0Var, int i2) {
        nv0Var.b0(1925803616);
        int i3 = i2 | (nv0Var.f(q12Var) ? 4 : 2) | (nv0Var.f(jcVar) ? 32 : 16) | (nv0Var.h(d00Var) ? 256 : 128);
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            h7 h7Var = (h7) q12Var;
            he2 he2VarA = a.a(h7Var.getAccessibilityManager());
            he2 he2VarA2 = b.a(h7Var.getAutofill());
            he2 he2VarA3 = d.a(h7Var.getAutofillManager());
            he2 he2VarA4 = c.a(h7Var.getAutofillTree());
            he2 he2VarA5 = e.a(h7Var.getClipboardManager());
            he2 he2VarA6 = f.a(h7Var.getClipboard());
            he2 he2VarA7 = h.a(h7Var.getDensity());
            he2 he2VarA8 = i.a(h7Var.getFocusOwner());
            he2 he2VarA9 = j.a(h7Var.getFontLoader());
            he2VarA9.g = false;
            he2 he2VarA10 = k.a(h7Var.getFontFamilyResolver());
            he2VarA10.g = false;
            he2 he2VarA11 = l.a(h7Var.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z || objO == zjVar) {
                objO = new r6(h7Var, 5);
                nv0Var.j0(objO);
            }
            he2 he2VarC = m.c((ns0) objO);
            he2 he2VarA12 = n.a(h7Var.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objO2 = nv0Var.O();
            if (z2 || objO2 == zjVar) {
                objO2 = new r6(h7Var, 6);
                nv0Var.j0(objO2);
            }
            he2 he2VarC2 = p.c((ns0) objO2);
            boolean z3 = i4 == 4;
            Object objO3 = nv0Var.O();
            if (z3 || objO3 == zjVar) {
                objO3 = new r6(h7Var, 7);
                nv0Var.j0(objO3);
            }
            he2 he2VarC3 = q.c((ns0) objO3);
            boolean z4 = i4 == 4;
            Object objO4 = nv0Var.O();
            if (z4 || objO4 == zjVar) {
                objO4 = new r6(h7Var, 8);
                nv0Var.j0(objO4);
            }
            he2 he2VarC4 = r.c((ns0) objO4);
            he2 he2VarA13 = s.a(jcVar);
            he2 he2VarA14 = t.a(h7Var.getViewConfiguration());
            he2 he2VarA15 = u.a(h7Var.getWindowInfo());
            boolean z5 = i4 == 4;
            Object objO5 = nv0Var.O();
            if (z5 || objO5 == zjVar) {
                objO5 = new r6(h7Var, 9);
                nv0Var.j0(objO5);
            }
            vr.d(new he2[]{he2VarA, he2VarA2, he2VarA3, he2VarA4, he2VarA5, he2VarA6, he2VarA7, he2VarA8, he2VarA9, he2VarA10, he2VarA11, he2VarC, he2VarA12, he2VarC2, he2VarC3, he2VarC4, he2VarA13, he2VarA14, he2VarA15, w.c((ns0) objO5), g.a(h7Var.getGraphicsContext()), mj1.a.a(h7Var.getRetainedValuesStore()), o.a(h7Var.getLocaleList())}, d00Var, nv0Var, 8 | ((i3 >> 3) & 112));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1((Object) q12Var, (Object) jcVar, (Object) d00Var, i2, 4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
