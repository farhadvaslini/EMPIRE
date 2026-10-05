package defpackage;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class i implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i(boolean z, String str, String str2, String str3, mc0 mc0Var, t73 t73Var) {
        this.f = 15;
        this.g = mc0Var;
        this.h = t73Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) throws IllegalAccessException, InvocationTargetException {
        aj1 aj1Var;
        int i = this.f;
        int i2 = 11;
        int i3 = 3;
        int i4 = 2;
        int i5 = 0;
        p40 p40Var = null;
        int i6 = 1;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((qr1) obj3).c((yc2) obj2);
                return dm3Var;
            case 1:
                cj1 cj1Var = (cj1) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((ef1) obj) == ef1.ON_RESUME) {
                    cj1Var.getClass();
                    cj1Var.h.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(cj1Var);
                    bj1 bj1Var = cj1Var.i;
                    if (bj1Var != null) {
                        bj1Var.f.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(bj1Var);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (aj1Var = cj1Var.j) != null) {
                        aj1Var.a.setValue(Boolean.valueOf(cj1.a(accessibilityManager)));
                        aj1Var.b.setValue(Boolean.valueOf(cj1.b(accessibilityManager)));
                        p1.b(accessibilityManager, l1.e(aj1Var));
                    }
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new b31((ze1) obj3, new ja(i5, (ma) obj2));
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                rb2 rb2Var = (rb2) obj3;
                rb2Var.setPositionProvider((ub2) obj2);
                rb2Var.r();
                return new ta(0);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((tb1) obj3).g0(((bq1) obj).d((bq1) obj2));
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                lk lkVar = (lk) obj3;
                mk mkVar = (mk) obj2;
                vh3 vh3Var = lkVar.t;
                if (vh3Var != null) {
                    vh3Var.b();
                }
                lkVar.t = null;
                gz gzVar = mkVar.b;
                if (gzVar != null) {
                    gzVar.Y(dm3Var);
                }
                mkVar.b = null;
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                uk ukVar = (uk) obj3;
                c10 c10Var = (c10) obj2;
                ukVar.a(c10Var);
                return new zk(i5, ukVar, c10Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                cl3.t((x50) obj3, null, new j((mp0) obj, (jj3) obj2, p40Var, 5), 3);
                return dm3Var;
            case 8:
                h62.I((h62) obj, (i62) obj3, 0, 0, ((zm) obj2).t);
                return dm3Var;
            case vr.g /* 9 */:
                dp dpVar = (dp) obj2;
                vb1 vb1Var = (vb1) obj;
                vb1Var.c();
                qf0.N(vb1Var, (da) obj3, dpVar, 0.0f, null, 60);
                return dm3Var;
            case vr.h /* 10 */:
                vb1 vb1Var2 = (vb1) obj;
                vb1Var2.c();
                qf0.N(vb1Var2, ((v02) obj3).l, (dp) obj2, 0.0f, null, 60);
                return dm3Var;
            case 11:
                ((po) obj3).a.j((v30) obj2);
                return dm3Var;
            case vr.i /* 12 */:
                of1 of1Var = (of1) obj3;
                ((jc0) obj).getClass();
                x1 x1Var = new x1(i6, (tw) obj2);
                of1Var.getLifecycle().a(x1Var);
                return new zk(i6, of1Var, x1Var);
            case 13:
                ye1 ye1Var = (ye1) obj3;
                dp dpVar2 = (dp) obj2;
                vb1 vb1Var3 = (vb1) obj;
                vb1Var3.c();
                if (((Boolean) ye1Var.s.getValue()).booleanValue() || ((Boolean) ye1Var.t.getValue()).booleanValue()) {
                    qf0.S0(vb1Var3, dpVar2, 0L, 0L, 0.0f, null, 126);
                }
                return dm3Var;
            case 14:
                i62 i62Var = (i62) obj3;
                h62 h62Var = (h62) obj;
                h62Var.getClass();
                h62.J(h62Var, i62Var, 0L, ((if0) obj2).B, 2);
                return dm3Var;
            case jo3.g /* 15 */:
                dv2 dv2Var = (dv2) obj;
                bv2.i(dv2Var, 6);
                dv2Var.a(pu2.b, new y0(null, new ja((mc0) obj3, (t73) obj2)));
                return dm3Var;
            case 16:
                return new c4(8, new qk0((cs0) obj2, (View) obj3));
            case 17:
                ((qr1) obj3).c((s41) obj2);
                return dm3Var;
            case 18:
                ((jx0) obj3).h.removeCallbacks((a8) obj2);
                return dm3Var;
            case 19:
                f21 f21Var = (f21) obj3;
                d21 d21Var = (d21) obj2;
                f21Var.a.b(d21Var);
                f21Var.b.setValue(Boolean.TRUE);
                return new zk(i3, f21Var, d21Var);
            case 20:
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                ae1.W(ae1Var, null, new d00(-1520960316, new oy0(i4, (String) obj3), true), 3);
                ae1.W(ae1Var, null, new d00(-1723093779, new l13((d00) obj2, i6), true), 3);
                return dm3Var;
            case 21:
                List list = (List) obj3;
                ae1 ae1Var2 = (ae1) obj;
                ae1Var2.getClass();
                ae1Var2.X(list.size(), new la(i2, new n20(17), list), new jw(2, list), new d00(802480018, new sh2(list, (ns0) obj2, i4), true));
                return dm3Var;
            case 22:
                sa1 sa1Var = (sa1) obj3;
                if (sa1Var.N == ((w83) obj2)) {
                    sa1Var.N = null;
                }
                return dm3Var;
            case 23:
                ((qf0) obj).getClass();
                ((va1) obj3).t.b.h((vb1) obj2);
                return dm3Var;
            case 24:
                ns0 ns0Var = (ns0) obj2;
                qf0 qf0Var = (qf0) obj;
                qf0Var.getClass();
                ua0 ua0VarO = qf0Var.Z().o();
                qf0Var.Z().N((ua0) obj3);
                try {
                    ns0Var.h(qf0Var);
                    return dm3Var;
                } finally {
                    qf0Var.Z().N(ua0VarO);
                }
            case 25:
                le1 le1Var = (le1) obj3;
                le1Var.h.i(obj2);
                return new zk(4, le1Var, obj2);
            case 26:
                return new le1((gq2) obj3, (Map) obj, (dq2) obj2);
            case 27:
                h62 h62Var2 = (h62) obj;
                ArrayList arrayListJ = s51.j((List) obj3, (cs0) ((rg1) obj2).b);
                if (arrayListJ != null) {
                    int size = arrayListJ.size();
                    while (i5 < size) {
                        r32 r32Var = (r32) arrayListJ.get(i5);
                        i62 i62Var2 = (i62) r32Var.f;
                        cs0 cs0Var = (cs0) r32Var.g;
                        h62.E(h62Var2, i62Var2, cs0Var != null ? ((i41) cs0Var.a()).a : 0L);
                        i5++;
                    }
                }
                return dm3Var;
            case 28:
                ed edVar = (ed) obj2;
                uw0 uw0Var = (uw0) obj;
                float fG = ((s33) obj3).c.j.g();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (uw0Var.a() & 4294967295L));
                if (!Float.isNaN(fG) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) edVar.d()).floatValue();
                    uw0Var.m(vp1.d(uw0Var, fFloatValue));
                    uw0Var.s(vp1.e(uw0Var, fFloatValue));
                    uw0Var.q0(d32.g(0.5f, (fG + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return dm3Var;
            default:
                dv2 dv2Var2 = (dv2) obj;
                a71[] a71VarArr = bv2.a;
                cv2 cv2Var = zu2.u;
                a71 a71Var = bv2.a[11];
                Float fValueOf = Float.valueOf(1.0f);
                cv2Var.getClass();
                dv2Var2.a(cv2Var, fValueOf);
                bv2.d(dv2Var2, (String) obj3);
                dv2Var2.a(pu2.b, new y0(null, new lx0((cs0) obj2, 1)));
                return dm3Var;
        }
    }

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
