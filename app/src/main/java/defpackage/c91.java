package defpackage;

import android.app.Application;
import java.util.Iterator;
import java.util.List;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c91 extends ct0 implements cs0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c91(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.m = i4;
    }

    @Override // defpackage.cs0
    public final Object a() {
        String str;
        String str2;
        Object value;
        int i = 0;
        p40 p40Var = null;
        switch (this.m) {
            case 0:
                ((sa1) this.g).q();
                break;
            case 1:
                ((sm2) this.g).f();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                i93 i93Var = ((sm2) this.g).p;
                gd0 gd0Var = gd0.a;
                i93Var.getClass();
                i93Var.j(null, gd0Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                sm2 sm2Var = (sm2) this.g;
                w83 w83Var = sm2Var.i;
                if (w83Var != null) {
                    w83Var.c(null);
                }
                sm2Var.i = null;
                sm2Var.f.a = true;
                i93 i93Var2 = sm2Var.r;
                zk0 zk0Var = zk0.a;
                i93Var2.getClass();
                i93Var2.j(null, zk0Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                i93 i93Var3 = ((sm2) this.g).r;
                zk0 zk0Var2 = zk0.a;
                i93Var3.getClass();
                i93Var3.j(null, zk0Var2);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                i93 i93Var4 = ((sa1) this.g).o;
                g4 g4Var = new g4(14);
                i93Var4.getClass();
                i93Var4.j(null, g4Var);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((sa1) this.g).s();
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                i93 i93Var5 = ((sa1) this.g).s;
                v71 v71Var = new v71();
                i93Var5.getClass();
                i93Var5.j(null, v71Var);
                break;
            case 8:
                i93 i93Var6 = ((sa1) this.g).o;
                g4 g4Var2 = new g4(15);
                i93Var6.getClass();
                i93Var6.j(null, g4Var2);
                break;
            case vr.g /* 9 */:
                ((sa1) this.g).w();
                break;
            case vr.h /* 10 */:
                ((sa1) this.g).p.i(null);
                break;
            case 11:
                sa1 sa1Var = (sa1) this.g;
                kq2 kq2Var = (kq2) sa1Var.p.getValue();
                if (kq2Var != null) {
                    cl3.t(f80.F(sa1Var), null, new ka1(sa1Var, kq2Var, p40Var, i), 3);
                }
                break;
            case vr.i /* 12 */:
                i93 i93Var7 = ((sa1) this.g).q;
                hp2 hp2Var = new hp2();
                i93Var7.getClass();
                i93Var7.j(null, hp2Var);
                break;
            case 13:
                i93 i93Var8 = ((sa1) this.g).r;
                o72 o72Var = new o72(null, null, false, 31);
                i93Var8.getClass();
                i93Var8.j(null, o72Var);
                break;
            case 14:
                sa1 sa1Var2 = (sa1) this.g;
                sa1Var2.getClass();
                cl3.t(f80.F(sa1Var2), null, new ga1(sa1Var2, p40Var, 4), 3);
                break;
            case jo3.g /* 15 */:
                sa1 sa1Var3 = (sa1) this.g;
                q92 q92Var = (q92) sa1Var3.i.getValue();
                if (q92Var != null && (str = q92Var.d) != null && (sa1Var3.g.n(str) instanceof da2)) {
                    sa1Var3.g();
                }
                break;
            case 16:
                sa1 sa1Var4 = (sa1) this.g;
                q92 q92Var2 = (q92) sa1Var4.i.getValue();
                if (q92Var2 != null && (str2 = q92Var2.d) != null) {
                    sa1Var4.g.s(str2, false);
                    sa1Var4.g();
                }
                break;
            case 17:
                sa1 sa1Var5 = (sa1) this.g;
                q92 q92Var3 = (q92) sa1Var5.i.getValue();
                if (q92Var3 != null) {
                    Iterator it = q92Var3.b.iterator();
                    while (it.hasNext()) {
                        sa1Var5.g.s((String) it.next(), false);
                    }
                    sa1Var5.g();
                }
                break;
            case 18:
                ((sa1) this.g).g();
                break;
            case 19:
                go3 go3Var = (go3) this.g;
                w83 w83Var2 = go3Var.m;
                if (w83Var2 != null) {
                    w83Var2.c(null);
                }
                go3Var.m = null;
                ij2 ij2Var = go3Var.d.c;
                if (ij2Var != null) {
                    ij2Var.d();
                }
                i93 i93Var9 = go3Var.k;
                nn3 nn3Var = nn3.a;
                i93Var9.getClass();
                i93Var9.j(null, nn3Var);
                Application application = go3Var.b;
                application.getClass();
                go3Var.i(application);
                break;
            case 20:
                ((oa2) this.g).g();
                break;
            case 21:
                oa2 oa2Var = (oa2) this.g;
                i93 i93Var10 = oa2Var.i;
                Boolean bool = Boolean.TRUE;
                i93Var10.getClass();
                i93Var10.j(null, bool);
                dx dxVarF = f80.F(oa2Var);
                j90 j90Var = ac0.a;
                cl3.t(dxVarF, x80.h, new l80(oa2Var, p40Var, 8), 2);
                break;
            case 22:
                ((oa2) this.g).g();
                break;
            case 23:
                ((oa2) this.g).g();
                break;
            case 24:
                ((vi2) this.g).h();
                break;
            case 25:
                vi2 vi2Var = (vi2) this.g;
                i93 i93Var11 = vi2Var.m;
                hb0 hb0Var = (hb0) i93Var11.getValue();
                if (hb0Var != null) {
                    i93 i93Var12 = vi2Var.k;
                    do {
                        value = i93Var12.getValue();
                    } while (!i93Var12.h(value, qx.E0((List) value, hb0Var)));
                    i93Var11.i(null);
                }
                break;
            case 26:
                ((vi2) this.g).m.i(null);
                break;
            case 27:
                vi2 vi2Var2 = (vi2) this.g;
                i93 i93Var13 = vi2Var2.F;
                boolean zBooleanValue = ((Boolean) i93Var13.getValue()).booleanValue();
                boolean z = !zBooleanValue;
                i93Var13.j(null, Boolean.valueOf(z));
                RaksampNativeBridge raksampNativeBridge = RaksampNativeBridge.INSTANCE;
                int i2 = vi2Var2.c;
                raksampNativeBridge.setAfkState(i2, z);
                if (!zBooleanValue) {
                    i93 i93Var14 = vi2Var2.E;
                    i93Var14.getClass();
                    i93Var14.j(null, 0);
                    raksampNativeBridge.setCustomKeys(i2, 0);
                }
                break;
            case 28:
                vi2 vi2Var3 = (vi2) this.g;
                int i3 = vi2Var3.c;
                i93 i93Var15 = vi2Var3.z;
                String string = y93.G0((String) i93Var15.getValue()).toString();
                if (string.length() != 0) {
                    i93Var15.j(null, "");
                    if (fa3.e0(string, "/", false)) {
                        RaksampNativeBridge.INSTANCE.sendChat(i3, string);
                    } else {
                        RaksampNativeBridge.INSTANCE.sendChat(i3, string);
                    }
                }
                break;
            default:
                vi2 vi2Var4 = (vi2) this.g;
                vi2Var4.getClass();
                RaksampNativeBridge.INSTANCE.exitVehicle(vi2Var4.c);
                break;
        }
        return dm3.a;
    }
}
