package defpackage;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class la implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public la(mc0 mc0Var, boolean z, os1 os1Var) {
        this.f = 7;
        this.g = mc0Var;
        this.h = os1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ns0
    public final Object h(Object obj) {
        hk2 hk2Var;
        long j;
        zG = false;
        zG = false;
        zG = false;
        zG = false;
        zG = false;
        boolean zG = false;
        z = false;
        z = false;
        boolean z = false;
        switch (this.f) {
            case 0:
                b31 b31Var = (b31) this.g;
                synchronized (b31Var.c) {
                    try {
                        b31Var.e = true;
                        qs1 qs1Var = b31Var.d;
                        Object[] objArr = qs1Var.f;
                        int i = qs1Var.h;
                        for (int i2 = 0; i2 < i; i2++) {
                            vx1 vx1Var = (vx1) ((ur3) objArr[i2]).get();
                            if (vx1Var != null && (hk2Var = vx1Var.b) != null) {
                                hk2Var.closeConnection();
                                vx1Var.b = null;
                            }
                        }
                        b31Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gg3 gg3Var = ((ma) this.h).g;
                gg3Var.b.set(null);
                gg3Var.a.g();
                return dm3.a;
            case 1:
                gc gcVar = (gc) this.g;
                hc hcVar = (hc) this.h;
                synchronized (gcVar.j) {
                    gcVar.l.remove(hcVar);
                }
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Choreographer) ((ic) this.g).g).removeFrameCallback((hc) this.h);
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                KeyEvent keyEvent = ((e71) obj).a;
                os1 os1Var = (os1) this.h;
                if (!((jj3) this.g).b()) {
                    os1Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((u0) this.g).h(((ArrayList) this.h).get(((Number) obj).intValue()));
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((u0) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                KeyEvent keyEvent2 = ((e71) obj).a;
                if (((ye1) this.g).a() == hx0.g && keyEvent2.getKeyCode() == 4 && ur.G(keyEvent2) == 1) {
                    ((sf3) this.h).g(null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                KeyEvent keyEvent3 = ((e71) obj).a;
                os1 os1Var2 = (os1) this.h;
                mc0 mc0Var = (mc0) this.g;
                if (ur.G(keyEvent3) == 1) {
                    long jE = ur.E(keyEvent3);
                    int i3 = c71.O;
                    if (((c71.a(jE, c71.h) || c71.a(jE, c71.r) || c71.a(jE, c71.E)) ? 1 : 0) != 0 || c71.a(gq.h(keyEvent3.getKeyCode()), c71.q)) {
                        mc0Var.a();
                    }
                }
                Boolean bool = Boolean.FALSE;
                os1Var2.setValue(bool);
                return bool;
            case 8:
                y63 y63Var = (y63) obj;
                synchronized (a73.c) {
                    j = a73.e;
                    a73.e = 1 + j;
                }
                return new ns1(j, y63Var, (ns0) this.g, (ns0) this.h);
            case vr.g /* 9 */:
                yj0 yj0Var = (yj0) this.g;
                Object obj2 = yj0Var.b;
                jr jrVar = (jr) this.h;
                synchronized (obj2) {
                    ((ArrayList) yj0Var.c).remove(jrVar);
                }
                return dm3.a;
            case vr.h /* 10 */:
                return ((n20) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 11:
                return ((n20) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case vr.i /* 12 */:
                return ((s12) this.g).h(((ArrayList) this.h).get(((Number) obj).intValue()));
            case 13:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((rs0) this.g).f((y31) this.h, bool2);
                return dm3.a;
            case 14:
                ((String) obj).getClass();
                ((ns0) this.g).h((y31) this.h);
                return dm3.a;
            case jo3.g /* 15 */:
                return ((s12) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 16:
                return ((s12) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 17:
                return ((s12) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 18:
                return ((s12) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 19:
                return ((rh2) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 20:
                return ((s12) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 21:
                return ((s12) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 22:
                int iIntValue = ((Number) obj).intValue();
                return ((h12) this.g).f(Integer.valueOf(iIntValue), ((ArrayList) this.h).get(iIntValue));
            case 23:
                return ((cr2) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 24:
                return ((cr2) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 25:
                return ((cr2) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            case 26:
                return ((cr2) this.g).h(((List) this.h).get(((Number) obj).intValue()));
            default:
                KeyEvent keyEvent4 = ((e71) obj).a;
                bp0 bp0Var = (bp0) this.g;
                InputDevice device = keyEvent4.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent4.getSource() == 33554433) && ur.G(keyEvent4) == 2 && keyEvent4.getSource() != 257)) {
                    if (n32.c(19, keyEvent4)) {
                        zG = ((ep0) bp0Var).g(5, true);
                    } else if (n32.c(20, keyEvent4)) {
                        zG = ((ep0) bp0Var).g(6, true);
                    } else if (n32.c(21, keyEvent4)) {
                        zG = ((ep0) bp0Var).g(3, true);
                    } else if (n32.c(22, keyEvent4)) {
                        zG = ((ep0) bp0Var).g(4, true);
                    } else if (n32.c(23, keyEvent4)) {
                        t73 t73Var = ((ye1) this.h).c;
                        if (t73Var != null) {
                            ((ka0) t73Var).b();
                        }
                        zG = true;
                    }
                }
                return Boolean.valueOf(zG);
        }
    }

    public /* synthetic */ la(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
