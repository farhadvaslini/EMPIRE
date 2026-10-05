package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw2 extends ct0 implements ns0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw2(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.m = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        dz dzVar;
        d71 d71VarV;
        Integer numValueOf;
        int i = this.m;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                kq2 kq2Var = (kq2) obj;
                kq2Var.getClass();
                return qy2.c((qy2) obj2, kq2Var);
            case 1:
                String str = (String) obj;
                str.getClass();
                return qy2.b((qy2) obj2, str);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                kq2 kq2Var2 = (kq2) obj;
                kq2Var2.getClass();
                return qy2.c((qy2) obj2, kq2Var2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                String str2 = (String) obj;
                str2.getClass();
                return qy2.b((qy2) obj2, str2);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                String str3 = (String) obj;
                str3.getClass();
                return qy2.b((qy2) obj2, str3);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                long j = ((gy1) obj).a;
                ce3 ce3Var = (ce3) obj2;
                ce3Var.getClass();
                ge3 ge3Var = (ge3) ur.z(ce3Var, he3.a);
                if (ge3Var != null) {
                    cl3.t(ce3Var.d1(), null, new m(ce3Var, j, ge3Var, new be3(ce3Var, j), (p40) null), 3);
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((vd3) obj2).b.b((ns0) obj);
                return dm3Var;
            default:
                KeyEvent keyEvent = ((e71) obj).a;
                cf3 cf3Var = (cf3) obj2;
                xg3 xg3Var = cf3Var.f;
                boolean z = cf3Var.d;
                boolean z2 = true;
                char c = 1;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    dzVar = null;
                } else {
                    d80 d80Var = cf3Var.i;
                    d80Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        d80Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = d80Var.a;
                        if (num != null) {
                            d80Var.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        dzVar = new dz(1, new StringBuilder().appendCodePoint(numValueOf.intValue()).toString());
                    }
                }
                if (dzVar != null) {
                    if (z) {
                        cf3Var.a(vr.K(dzVar));
                        xg3Var.a = null;
                    } else {
                        z2 = false;
                    }
                } else if (ur.G(keyEvent) == 2 && (d71VarV = cf3Var.j.v(keyEvent)) != null && (!d71VarV.f || z)) {
                    mk2 mk2Var = new mk2();
                    mk2Var.f = true;
                    vf3 vf3Var = new vf3(d71VarV, cf3Var, mk2Var, c == true ? 1 : 0);
                    bg3 bg3Var = cf3Var.c;
                    gf3 gf3Var = new gf3(bg3Var, cf3Var.g, cf3Var.a.d(), xg3Var);
                    vf3Var.h(gf3Var);
                    boolean zB = yg3.b(gf3Var.f, bg3Var.b);
                    af afVar = gf3Var.g;
                    if (!zB || !s51.n(afVar, bg3Var.a)) {
                        cf3Var.k.h(bg3.a(bg3Var, afVar, gf3Var.f, 4));
                    }
                    yl3 yl3Var = cf3Var.h;
                    if (yl3Var != null) {
                        yl3Var.e = true;
                    }
                    z2 = mk2Var.f;
                }
                return Boolean.valueOf(z2);
        }
    }
}
