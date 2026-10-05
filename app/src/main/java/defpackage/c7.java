package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c7 extends ct0 implements cs0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.m = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ab  */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        ax1 ax1Var;
        int i = 31;
        boolean z = false;
        Object[] objArr = 0;
        sv2 sv2Var = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.m) {
            case 0:
                View view = (View) this.g;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    o1.f(view);
                }
                if (i2 >= 29 && (r1 = gf.a(view)) != null) {
                    break;
                }
                break;
            case 1:
                ((Runnable) this.g).run();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((tw) this.g).i();
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((tw) this.g).g();
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((tw) this.g).j();
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((tw) this.g).i();
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((tw) this.g).i();
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 8:
                mp0 mp0Var = mp0.h;
                zo0 zo0Var = (zo0) this.g;
                js1 js1Var = zo0Var.c;
                js1 js1Var2 = zo0Var.d;
                ep0 ep0Var = zo0Var.a;
                rp0 rp0VarF = ep0Var.f();
                if (rp0VarF == null) {
                    Object[] objArr4 = js1Var2.b;
                    long[] jArr = js1Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((so0) objArr4[(i3 << 3) + i5]).x0(mp0Var);
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                } else if (rp0VarF.s) {
                    if (js1Var.c(rp0VarF)) {
                        rp0VarF.v1();
                    }
                    mp0 mp0VarU1 = rp0VarF.u1();
                    if (!rp0VarF.f.s) {
                        m21.c("visitAncestors called on an unattached node");
                    }
                    aq1 aq1Var = rp0VarF.f;
                    tb1 tb1VarX = vr.X(rp0VarF);
                    int i6 = 0;
                    while (tb1VarX != null) {
                        if ((tb1VarX.L.f.i & 5120) != 0) {
                            while (aq1Var != null) {
                                int i7 = aq1Var.h;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((aq1Var instanceof so0) && js1Var2.c(aq1Var)) {
                                        if (i6 <= 1) {
                                            ((so0) aq1Var).x0(mp0VarU1);
                                        } else {
                                            ((so0) aq1Var).x0(mp0.g);
                                        }
                                        js1Var2.l(aq1Var);
                                    }
                                }
                                aq1Var = aq1Var.j;
                            }
                        }
                        tb1VarX = tb1VarX.u();
                        aq1Var = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
                    }
                    Object[] objArr5 = js1Var2.b;
                    long[] jArr2 = js1Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((so0) objArr5[(i8 << 3) + i10]).x0(mp0Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 == 8) {
                                    if (i8 != length2) {
                                        i8++;
                                    }
                                }
                            }
                        }
                    }
                }
                if (ep0Var.f() == null || ep0Var.c.u1() == mp0Var) {
                    ep0Var.c();
                }
                js1Var.b();
                js1Var2.b();
                zo0Var.e = false;
                break;
            case vr.g /* 9 */:
                break;
            case vr.h /* 10 */:
                ((sm2) this.g).g();
                break;
            case 11:
                ((sm2) this.g).j("https://sa-mp.th1nk.top/data/sources.json", false);
                break;
            case vr.i /* 12 */:
                ((sm2) this.g).i();
                break;
            case 13:
                ((sa1) this.g).q();
                break;
            case 14:
                ((sm2) this.g).f();
                break;
            case jo3.g /* 15 */:
                i93 i93Var = ((sm2) this.g).p;
                gd0 gd0Var = gd0.a;
                i93Var.getClass();
                i93Var.j(null, gd0Var);
                break;
            case 16:
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
            case 17:
                i93 i93Var3 = ((sm2) this.g).r;
                zk0 zk0Var2 = zk0.a;
                i93Var3.getClass();
                i93Var3.j(null, zk0Var2);
                break;
            case 18:
                i93 i93Var4 = ((sa1) this.g).o;
                g4 g4Var = new g4(14);
                i93Var4.getClass();
                i93Var4.j(null, g4Var);
                break;
            case 19:
                ((sa1) this.g).s();
                break;
            case 20:
                i93 i93Var5 = ((sa1) this.g).s;
                v71 v71Var = new v71();
                i93Var5.getClass();
                i93Var5.j(null, v71Var);
                break;
            case 21:
                i93 i93Var6 = ((sa1) this.g).o;
                g4 g4Var2 = new g4(15);
                i93Var6.getClass();
                i93Var6.j(null, g4Var2);
                break;
            case 22:
                ((sa1) this.g).w();
                break;
            case 23:
                ((sa1) this.g).p.i(null);
                break;
            case 24:
                sa1 sa1Var = (sa1) this.g;
                kq2 kq2Var = (kq2) sa1Var.p.getValue();
                if (kq2Var != null) {
                    cl3.t(f80.F(sa1Var), null, new ka1(sa1Var, kq2Var, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0), 3);
                }
                break;
            case 25:
                i93 i93Var7 = ((sa1) this.g).q;
                hp2 hp2Var = new hp2();
                i93Var7.getClass();
                i93Var7.j(null, hp2Var);
                break;
            case 26:
                i93 i93Var8 = ((sa1) this.g).r;
                o72 o72Var = new o72(sv2Var, objArr3 == true ? 1 : 0, z, i);
                i93Var8.getClass();
                i93Var8.j(null, o72Var);
                break;
            case 27:
                ((sm2) this.g).g();
                break;
            case 28:
                ((sm2) this.g).j("https://sa-mp.th1nk.top/data/sources.json", false);
                break;
            default:
                ((sm2) this.g).i();
                break;
        }
        return dm3.a;
    }
}
