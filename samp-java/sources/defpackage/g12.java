package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class g12 {
    public static w01 a;
    public static w01 b;

    public static final void A(ne neVar, cs2 cs2Var, ns0 ns0Var, float f) {
        float fA;
        try {
            fA = cs2Var.a(f);
        } catch (CancellationException unused) {
            neVar.a();
            fA = 0.0f;
        }
        ns0Var.h(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            neVar.a();
        }
    }

    public static float B(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.c.q("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.c.q("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean C(defpackage.jk2 r18, defpackage.jk2 r19, defpackage.jk2 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = D(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = D(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.c.q(r4)
            return r12
        L94:
            defpackage.c.q(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.c.q(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.C(jk2, jk2, jk2, int):boolean");
    }

    public static final boolean D(int i, jk2 jk2Var, jk2 jk2Var2) {
        if (i == 3 || i == 4) {
            return jk2Var.d > jk2Var2.b && jk2Var.b < jk2Var2.d;
        }
        if (i == 5 || i == 6) {
            return jk2Var.c > jk2Var2.a && jk2Var.a < jk2Var2.c;
        }
        c.q("This function should only be used for 2-D focus search");
        return false;
    }

    public static final float E(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final void F(rp0 rp0Var, qs1 qs1Var) {
        if (!rp0Var.f.s) {
            m21.c("visitChildren called on an unattached node");
        }
        qs1 qs1Var2 = new qs1(new aq1[16]);
        aq1 aq1Var = rp0Var.f;
        aq1 aq1Var2 = aq1Var.k;
        if (aq1Var2 == null) {
            vr.h(qs1Var2, aq1Var);
        } else {
            qs1Var2.b(aq1Var2);
        }
        while (true) {
            int i = qs1Var2.h;
            if (i == 0) {
                return;
            }
            aq1 aq1VarJ = (aq1) qs1Var2.k(i - 1);
            if ((aq1VarJ.i & 1024) == 0) {
                vr.h(qs1Var2, aq1VarJ);
            } else {
                while (true) {
                    if (aq1VarJ == null) {
                        break;
                    }
                    if ((aq1VarJ.h & 1024) != 0) {
                        qs1 qs1Var3 = null;
                        while (aq1VarJ != null) {
                            if (aq1VarJ instanceof rp0) {
                                rp0 rp0Var2 = (rp0) aq1VarJ;
                                if (rp0Var2.s && !vr.X(rp0Var2).W) {
                                    if (rp0Var2.r1().a) {
                                        qs1Var.b(rp0Var2);
                                    } else {
                                        F(rp0Var2, qs1Var);
                                    }
                                }
                            } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                int i2 = 0;
                                for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                    if ((aq1Var3.h & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            aq1VarJ = aq1Var3;
                                        } else {
                                            if (qs1Var3 == null) {
                                                qs1Var3 = new qs1(new aq1[16]);
                                            }
                                            if (aq1VarJ != null) {
                                                qs1Var3.b(aq1VarJ);
                                                aq1VarJ = null;
                                            }
                                            qs1Var3.b(aq1Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            aq1VarJ = vr.j(qs1Var3);
                        }
                    } else {
                        aq1VarJ = aq1VarJ.k;
                    }
                }
            }
        }
    }

    public static final long G() {
        return Thread.currentThread().getId();
    }

    public static final rp0 H(qs1 qs1Var, jk2 jk2Var, int i) {
        jk2 jk2VarH;
        rp0 rp0Var = null;
        if (i == 3) {
            jk2VarH = jk2Var.h((jk2Var.c - jk2Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            jk2VarH = jk2Var.h(-((jk2Var.c - jk2Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            jk2VarH = jk2Var.h(0.0f, (jk2Var.d - jk2Var.b) + 1.0f);
        } else {
            if (i != 6) {
                c.q("This function should only be used for 2-D focus search");
                return null;
            }
            jk2VarH = jk2Var.h(0.0f, -((jk2Var.d - jk2Var.b) + 1.0f));
        }
        Object[] objArr = qs1Var.f;
        int i2 = qs1Var.h;
        for (int i3 = 0; i3 < i2; i3++) {
            rp0 rp0Var2 = (rp0) objArr[i3];
            if (br.H(rp0Var2)) {
                jk2 jk2VarV = br.v(rp0Var2);
                if (S(jk2VarV, jk2VarH, jk2Var, i)) {
                    rp0Var = rp0Var2;
                    jk2VarH = jk2VarV;
                }
            }
        }
        return rp0Var;
    }

    public static final boolean I(rp0 rp0Var, int i, ns0 ns0Var) {
        jk2 jk2Var;
        qs1 qs1Var = new qs1(new rp0[16]);
        F(rp0Var, qs1Var);
        int i2 = qs1Var.h;
        if (i2 <= 1) {
            rp0 rp0Var2 = (rp0) (i2 == 0 ? null : qs1Var.f[0]);
            if (rp0Var2 != null) {
                return ((Boolean) ns0Var.h(rp0Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                jk2 jk2VarV = br.v(rp0Var);
                float f = jk2VarV.a;
                float f2 = jk2VarV.b;
                jk2Var = new jk2(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    c.q("This function should only be used for 2-D focus search");
                    return false;
                }
                jk2 jk2VarV2 = br.v(rp0Var);
                float f3 = jk2VarV2.c;
                float f4 = jk2VarV2.d;
                jk2Var = new jk2(f3, f4, f3, f4);
            }
            rp0 rp0VarH = H(qs1Var, jk2Var, i);
            if (rp0VarH != null) {
                return ((Boolean) ns0Var.h(rp0VarH)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean J(int i, v1 v1Var, rp0 rp0Var, jk2 jk2Var) {
        if (Z(i, v1Var, rp0Var, jk2Var)) {
            return true;
        }
        Boolean bool = (Boolean) cl3.C(rp0Var, i, new py(((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).f(), rp0Var, jk2Var, i, v1Var, 4));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final int K(String str, Bundle bundle) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        jo3.q(str);
        throw null;
    }

    public static final w01 L() {
        w01 w01Var = b;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.PowerSettingsNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(13.0f, 3.0f);
        tx0Var.g(-2.0f);
        tx0Var.o(10.0f);
        tx0Var.g(2.0f);
        tx0Var.h(13.0f, 3.0f);
        tx0Var.c();
        tx0Var.j(17.83f, 5.17f);
        tx0Var.i(-1.42f, 1.42f);
        tx0Var.d(17.99f, 7.86f, 19.0f, 9.81f, 19.0f, 12.0f);
        tx0Var.e(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        tx0Var.l(-7.0f, -3.13f, -7.0f, -7.0f);
        tx0Var.e(0.0f, -2.19f, 1.01f, -4.14f, 2.58f, -5.42f);
        tx0Var.h(6.17f, 5.17f);
        tx0Var.d(4.23f, 6.82f, 3.0f, 9.26f, 3.0f, 12.0f);
        tx0Var.e(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        tx0Var.l(9.0f, -4.03f, 9.0f, -9.0f);
        tx0Var.e(0.0f, -2.74f, -1.23f, -5.18f, -3.17f, -6.83f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        b = w01VarB;
        return w01VarB;
    }

    public static final int M(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                c.p("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final ArrayList N(String str, Bundle bundle) {
        ArrayList arrayListE = Build.VERSION.SDK_INT >= 34 ? p1.e(bundle, str, uq.t(rk2.a(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (arrayListE != null) {
            return arrayListE;
        }
        jo3.q(str);
        throw null;
    }

    public static final kt2 O(Object obj) {
        if (obj != gv3.r) {
            return (kt2) obj;
        }
        c.q("Does not contain segment");
        return null;
    }

    public static final String P(int i, nv0 nv0Var) {
        nv0Var.j(x7.a);
        return ((Context) nv0Var.j(x7.b)).getResources().getString(i);
    }

    public static final boolean Q(af afVar) {
        int length = afVar.g.length();
        List list = afVar.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ze zeVar = (ze) list.get(i);
                if ((zeVar.a instanceof og1) && bf.b(0, length, zeVar.b, zeVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean R(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean S(jk2 jk2Var, jk2 jk2Var2, jk2 jk2Var3, int i) {
        if (!T(i, jk2Var, jk2Var3)) {
            return false;
        }
        if (T(i, jk2Var2, jk2Var3) && !C(jk2Var3, jk2Var, jk2Var2, i)) {
            return !C(jk2Var3, jk2Var2, jk2Var, i) && U(i, jk2Var3, jk2Var) < U(i, jk2Var3, jk2Var2);
        }
        return true;
    }

    public static final boolean T(int i, jk2 jk2Var, jk2 jk2Var2) {
        if (i == 3) {
            float f = jk2Var2.c;
            float f2 = jk2Var2.a;
            float f3 = jk2Var.c;
            return (f > f3 || f2 >= f3) && f2 > jk2Var.a;
        }
        if (i == 4) {
            float f4 = jk2Var2.a;
            float f5 = jk2Var2.c;
            float f6 = jk2Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < jk2Var.c;
        }
        if (i == 5) {
            float f7 = jk2Var2.d;
            float f8 = jk2Var2.b;
            float f9 = jk2Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > jk2Var.b;
        }
        if (i != 6) {
            c.q("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = jk2Var2.b;
        float f11 = jk2Var2.d;
        float f12 = jk2Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < jk2Var.d;
    }

    public static final long U(int i, jk2 jk2Var, jk2 jk2Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = jk2Var.a;
            f2 = jk2Var2.c;
        } else if (i == 4) {
            f = jk2Var2.a;
            f2 = jk2Var.c;
        } else if (i == 5) {
            f = jk2Var.b;
            f2 = jk2Var2.d;
        } else {
            if (i != 6) {
                c.q("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = jk2Var2.b;
            f2 = jk2Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = jk2Var.b;
            f3 = ((jk2Var.d - f7) / 2.0f) + f7;
            f4 = jk2Var2.b;
            f5 = jk2Var2.d;
        } else {
            if (i != 5 && i != 6) {
                c.q("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = jk2Var.a;
            f3 = ((jk2Var.c - f8) / 2.0f) + f8;
            f4 = jk2Var2.a;
            f5 = jk2Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean V(Object obj) {
        return obj == gv3.r;
    }

    public static boolean W(byte b2) {
        return b2 > -65;
    }

    public static final boolean X(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final String Y(String str, nv0 nv0Var) {
        int i;
        int i2;
        str.getClass();
        if (str.equals("zh")) {
            i = -710070479;
            i2 = 2131624240;
        } else if (str.equals("ru")) {
            i = -710067855;
            i2 = 2131624242;
        } else {
            i = -710065711;
            i2 = 2131624241;
        }
        return by1.f(nv0Var, i, i2, nv0Var, false);
    }

    public static final boolean Z(int i, v1 v1Var, rp0 rp0Var, jk2 jk2Var) {
        rp0 rp0VarH;
        qs1 qs1Var = new qs1(new rp0[16]);
        if (!rp0Var.f.s) {
            m21.c("visitChildren called on an unattached node");
        }
        qs1 qs1Var2 = new qs1(new aq1[16]);
        aq1 aq1Var = rp0Var.f;
        aq1 aq1Var2 = aq1Var.k;
        if (aq1Var2 == null) {
            vr.h(qs1Var2, aq1Var);
        } else {
            qs1Var2.b(aq1Var2);
        }
        while (true) {
            int i2 = qs1Var2.h;
            if (i2 == 0) {
                break;
            }
            aq1 aq1VarJ = (aq1) qs1Var2.k(i2 - 1);
            if ((aq1VarJ.i & 1024) == 0) {
                vr.h(qs1Var2, aq1VarJ);
            } else {
                while (true) {
                    if (aq1VarJ == null) {
                        break;
                    }
                    if ((aq1VarJ.h & 1024) != 0) {
                        qs1 qs1Var3 = null;
                        while (aq1VarJ != null) {
                            if (aq1VarJ instanceof rp0) {
                                rp0 rp0Var2 = (rp0) aq1VarJ;
                                if (rp0Var2.s) {
                                    qs1Var.b(rp0Var2);
                                }
                            } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                int i3 = 0;
                                for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                    if ((aq1Var3.h & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            aq1VarJ = aq1Var3;
                                        } else {
                                            if (qs1Var3 == null) {
                                                qs1Var3 = new qs1(new aq1[16]);
                                            }
                                            if (aq1VarJ != null) {
                                                qs1Var3.b(aq1VarJ);
                                                aq1VarJ = null;
                                            }
                                            qs1Var3.b(aq1Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            aq1VarJ = vr.j(qs1Var3);
                        }
                    } else {
                        aq1VarJ = aq1VarJ.k;
                    }
                }
            }
        }
        while (qs1Var.h != 0 && (rp0VarH = H(qs1Var, jk2Var, i)) != null) {
            if (rp0VarH.r1().a) {
                return ((Boolean) v1Var.h(rp0VarH)).booleanValue();
            }
            if (J(i, v1Var, rp0VarH, jk2Var)) {
                return true;
            }
            qs1Var.j(rp0VarH);
        }
        return false;
    }

    public static final void a(cs0 cs0Var, an3 an3Var, cs0 cs0Var2, nv0 nv0Var, int i) throws PackageManager.NameNotFoundException {
        cs0Var.getClass();
        an3Var.getClass();
        cs0Var2.getClass();
        nv0Var.b0(-1709250224);
        int i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i | (nv0Var.f(an3Var) ? 32 : 16) | (nv0Var.h(cs0Var2) ? 256 : 128);
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) nv0Var.j(x7.b);
            jc jcVar = (jc) nv0Var.j(s20.s);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                nv0Var.j0(objO);
            }
            PackageInfo packageInfo = (PackageInfo) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                String str = packageInfo.versionName;
                if (str == null) {
                    str = "?";
                }
                objO2 = str;
                nv0Var.j0(objO2);
            }
            String str2 = (String) objO2;
            Object objO3 = nv0Var.O();
            if (objO3 == zjVar) {
                objO3 = context.getApplicationInfo().loadIcon(context.getPackageManager());
                nv0Var.j0(objO3);
            }
            g(oz2.M(2131624329, nv0Var), "about", cs0Var, gq.N(1970241876, new y03(str2, (Drawable) objO3, jcVar, an3Var, cs0Var2), nv0Var), nv0Var, ((i2 << 6) & 896) | 3120);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1(cs0Var, (Object) an3Var, (zs0) cs0Var2, i, 16);
        }
    }

    public static final Object a0(String str, ArrayList arrayList, s12 s12Var) {
        str.getClass();
        ou2 ou2VarU = n32.u(str, false);
        if (ou2VarU == null) {
            c.q("Invalid semantic version");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) s12Var.h(obj);
            str2.getClass();
            ou2 ou2VarU2 = n32.u(str2, false);
            if (ou2VarU2 == null) {
                c.q("Invalid semantic version");
                return null;
            }
            if (ou2VarU2.compareTo(ou2VarU) < 0) {
                arrayList2.add(obj);
            }
        }
        return qx.B0(arrayList2, new z92(new w92(1, s12Var), s12Var));
    }

    public static final void b(qp2 qp2Var, ns0 ns0Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(748589749);
        if ((i & 6) == 0) {
            i2 = (nv0Var.d(qp2Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            rn.a(cs0Var, gq.N(261262189, new k91(cs0Var, 19), nv0Var), null, null, null, r51.e0, gq.N(1106981064, new nh2(10, ns0Var, qp2Var), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i2 >> 6) & 14) | 1769520, 16284);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(qp2Var, ns0Var, cs0Var, i, 16);
        }
    }

    public static final void c(int i, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var, nv0 nv0Var, String str) {
        int i2;
        nv0Var.b0(1782893645);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(cs0Var2) ? 2048 : 1024;
        }
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 14) == 4;
            Object objO = nv0Var.O();
            if (z || objO == c20.a) {
                objO = b32.w(str);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            rn.a(cs0Var2, gq.N(797014165, new w1(cs0Var, ns0Var, os1Var), nv0Var), null, gq.N(-1566827497, new k91(cs0Var2, 15), nv0Var), null, r51.l0, gq.N(1329860954, new l8(os1Var, 22), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i2 >> 9) & 14) | 1772592, 16276);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v4(str, (Object) ns0Var, cs0Var, (zs0) cs0Var2, i, 8);
        }
    }

    public static final void d(cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, cs0 cs0Var5, nv0 nv0Var, int i) {
        cs0Var.getClass();
        cs0Var2.getClass();
        cs0Var3.getClass();
        cs0Var4.getClass();
        cs0Var5.getClass();
        nv0Var.b0(21233525);
        int i2 = i | (nv0Var.h(cs0Var) ? 4 : 2) | (nv0Var.h(cs0Var2) ? 32 : 16) | (nv0Var.h(cs0Var3) ? 256 : 128) | (nv0Var.h(cs0Var4) ? 2048 : 1024) | (nv0Var.h(cs0Var5) ? 16384 : 8192);
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            g(oz2.M(2131624335, nv0Var), "debug", cs0Var, gq.N(-656846351, new q03(cs0Var2, cs0Var5, cs0Var3, cs0Var4, 0), nv0Var), nv0Var, ((i2 << 6) & 896) | 3120);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new x03(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, i, 2);
        }
    }

    public static final bq1 d0(String str, nv0 nv0Var) {
        nv0Var.a0(18484577);
        c33 c33Var = (c33) nv0Var.j(da1.a);
        yp1 yp1Var = yp1.a;
        if (c33Var == null) {
            nv0Var.p(false);
            return yp1Var;
        }
        he heVar = (he) nv0Var.j(da1.b);
        if (heVar == null) {
            nv0Var.p(false);
            return yp1Var;
        }
        y23 y23VarB = c33.b("settings-container-".concat(str), nv0Var);
        Object objO = nv0Var.O();
        if (objO == c20.a) {
            objO = new r03(0);
            nv0Var.j0(objO);
        }
        r03 r03Var = (r03) objO;
        ij0 ij0VarF = dj0.f(null, 3);
        ek0 ek0VarG = dj0.g(null, 3);
        vm vmVar = f5.k;
        is1 is1Var = h33.b;
        zj zjVar = d40.c;
        Object objG = is1Var.g(zjVar);
        if (objG == null) {
            objG = new is1();
            is1Var.m(zjVar, objG);
        }
        is1 is1Var2 = (is1) objG;
        Object objG2 = is1Var2.g(vmVar);
        if (objG2 == null) {
            objG2 = new mr2();
            is1Var2.m(vmVar, objG2);
        }
        x23.a.getClass();
        bq1 bq1VarT = lr.t(lr.t(yp1Var, new b33(y23VarB, heVar.a(), hd.w, c33Var, w23.b, false, h33.a, r03Var)), new a33(heVar, ij0VarF, ek0VarG, y23VarB, (mr2) objG2));
        nv0Var.p(false);
        return bq1VarT;
    }

    public static final void e(int i, int i2, cs0 cs0Var, ns0 ns0Var, nv0 nv0Var) {
        int i3;
        nv0Var.b0(-1229967737);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 14) == 4;
            Object objO = nv0Var.O();
            if (z || objO == c20.a) {
                objO = new z32(i);
                nv0Var.j0(objO);
            }
            final z32 z32Var = (z32) objO;
            rn.a(cs0Var, gq.N(-445431601, new nh2(6, ns0Var, z32Var), nv0Var), null, gq.N(-1152028207, new k91(cs0Var, 12), nv0Var), null, gq.N(-1858624813, new rs0() { // from class: d13
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    int i6 = i4;
                    dm3 dm3Var = dm3.a;
                    z32 z32Var2 = z32Var;
                    switch (i6) {
                        case 0:
                            nv0 nv0Var2 = (nv0) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!nv0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                nv0Var2.U();
                            } else {
                                mg3.b(oz2.N(2131624225, new Object[]{Integer.valueOf(vm1.M(z32Var2.g()))}, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                            }
                            break;
                        default:
                            nv0 nv0Var3 = (nv0) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                nv0Var3.U();
                            } else {
                                yp1 yp1Var = yp1.a;
                                bq1 bq1VarL = f80.L(yp1Var, 8.0f, 0.0f, 2);
                                qy qyVarA = oy.a(n92.d, f5.s, nv0Var3, 0);
                                int iHashCode = Long.hashCode(nv0Var3.T);
                                n52 n52VarL = nv0Var3.l();
                                bq1 bq1VarM = lr.M(nv0Var3, bq1VarL);
                                w10.c.getClass();
                                nv0Var3.d0();
                                boolean z2 = nv0Var3.S;
                                x91 x91Var = tb1.Y;
                                if (z2) {
                                    nv0Var3.k(x91Var);
                                } else {
                                    nv0Var3.m0();
                                }
                                z00 z00Var = f5.E;
                                y02.F(z00Var, nv0Var3, qyVarA);
                                z00 z00Var2 = f5.D;
                                y02.F(z00Var2, nv0Var3, n52VarL);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                z00 z00Var3 = f5.F;
                                y02.F(z00Var3, nv0Var3, numValueOf);
                                y02.C(nv0Var3);
                                z00 z00Var4 = f5.C;
                                y02.F(z00Var4, nv0Var3, bq1VarM);
                                bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                                dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var3, 48);
                                int iHashCode2 = Long.hashCode(nv0Var3.T);
                                n52 n52VarL2 = nv0Var3.l();
                                bq1 bq1VarM2 = lr.M(nv0Var3, bq1VarC);
                                nv0Var3.d0();
                                if (nv0Var3.S) {
                                    nv0Var3.k(x91Var);
                                } else {
                                    nv0Var3.m0();
                                }
                                y02.F(z00Var, nv0Var3, dp2VarA);
                                y02.F(z00Var2, nv0Var3, n52VarL2);
                                nc2.r(iHashCode2, nv0Var3, z00Var3, nv0Var3);
                                y02.F(z00Var4, nv0Var3, bq1VarM2);
                                String strN = oz2.N(2131624211, new Object[]{8}, nv0Var3);
                                r93 r93Var = ql3.a;
                                gh3 gh3Var = ((ol3) nv0Var3.j(r93Var)).l;
                                r93 r93Var2 = hy.a;
                                mg3.b(strN, null, ((fy) nv0Var3.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var3, 0, 0, 131066);
                                float fG = z32Var2.g();
                                ex exVar = new ex(8.0f, 16.0f);
                                jc1 jc1Var = new jc1(1.0f, true);
                                boolean zF = nv0Var3.f(z32Var2);
                                Object objO2 = nv0Var3.O();
                                if (zF || objO2 == c20.a) {
                                    objO2 = new uz2(z32Var2, 1);
                                    nv0Var3.j0(objO2);
                                }
                                br.i(fG, (ns0) objO2, exVar, jc1Var, 7, null, nv0Var3, 24576);
                                mg3.b(oz2.N(2131624211, new Object[]{16}, nv0Var3), null, ((fy) nv0Var3.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(r93Var)).l, nv0Var3, 0, 0, 131066);
                                nv0Var3.p(true);
                                nv0Var3.p(true);
                            }
                            break;
                    }
                    return dm3Var;
                }
            }, nv0Var), gq.N(-64439468, new rs0() { // from class: d13
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    int i6 = i5;
                    dm3 dm3Var = dm3.a;
                    z32 z32Var2 = z32Var;
                    switch (i6) {
                        case 0:
                            nv0 nv0Var2 = (nv0) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!nv0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                nv0Var2.U();
                            } else {
                                mg3.b(oz2.N(2131624225, new Object[]{Integer.valueOf(vm1.M(z32Var2.g()))}, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                            }
                            break;
                        default:
                            nv0 nv0Var3 = (nv0) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                nv0Var3.U();
                            } else {
                                yp1 yp1Var = yp1.a;
                                bq1 bq1VarL = f80.L(yp1Var, 8.0f, 0.0f, 2);
                                qy qyVarA = oy.a(n92.d, f5.s, nv0Var3, 0);
                                int iHashCode = Long.hashCode(nv0Var3.T);
                                n52 n52VarL = nv0Var3.l();
                                bq1 bq1VarM = lr.M(nv0Var3, bq1VarL);
                                w10.c.getClass();
                                nv0Var3.d0();
                                boolean z2 = nv0Var3.S;
                                x91 x91Var = tb1.Y;
                                if (z2) {
                                    nv0Var3.k(x91Var);
                                } else {
                                    nv0Var3.m0();
                                }
                                z00 z00Var = f5.E;
                                y02.F(z00Var, nv0Var3, qyVarA);
                                z00 z00Var2 = f5.D;
                                y02.F(z00Var2, nv0Var3, n52VarL);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                z00 z00Var3 = f5.F;
                                y02.F(z00Var3, nv0Var3, numValueOf);
                                y02.C(nv0Var3);
                                z00 z00Var4 = f5.C;
                                y02.F(z00Var4, nv0Var3, bq1VarM);
                                bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                                dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var3, 48);
                                int iHashCode2 = Long.hashCode(nv0Var3.T);
                                n52 n52VarL2 = nv0Var3.l();
                                bq1 bq1VarM2 = lr.M(nv0Var3, bq1VarC);
                                nv0Var3.d0();
                                if (nv0Var3.S) {
                                    nv0Var3.k(x91Var);
                                } else {
                                    nv0Var3.m0();
                                }
                                y02.F(z00Var, nv0Var3, dp2VarA);
                                y02.F(z00Var2, nv0Var3, n52VarL2);
                                nc2.r(iHashCode2, nv0Var3, z00Var3, nv0Var3);
                                y02.F(z00Var4, nv0Var3, bq1VarM2);
                                String strN = oz2.N(2131624211, new Object[]{8}, nv0Var3);
                                r93 r93Var = ql3.a;
                                gh3 gh3Var = ((ol3) nv0Var3.j(r93Var)).l;
                                r93 r93Var2 = hy.a;
                                mg3.b(strN, null, ((fy) nv0Var3.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var3, 0, 0, 131066);
                                float fG = z32Var2.g();
                                ex exVar = new ex(8.0f, 16.0f);
                                jc1 jc1Var = new jc1(1.0f, true);
                                boolean zF = nv0Var3.f(z32Var2);
                                Object objO2 = nv0Var3.O();
                                if (zF || objO2 == c20.a) {
                                    objO2 = new uz2(z32Var2, 1);
                                    nv0Var3.j0(objO2);
                                }
                                br.i(fG, (ns0) objO2, exVar, jc1Var, 7, null, nv0Var3, 24576);
                                mg3.b(oz2.N(2131624211, new Object[]{16}, nv0Var3), null, ((fy) nv0Var3.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(r93Var)).l, nv0Var3, 0, 0, 131066);
                                nv0Var3.p(true);
                                nv0Var3.p(true);
                            }
                            break;
                    }
                    return dm3Var;
                }
            }, nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i3 >> 6) & 14) | 1772592, 16276);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new e13(i, ns0Var, cs0Var, i2);
        }
    }

    public static final void f(int i, int i2, cs0 cs0Var, ns0 ns0Var, nv0 nv0Var) {
        int i3;
        nv0Var.b0(-1823425734);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.h(ns0Var) ? 256 : 128;
        }
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = vr.L(30, 60, 90, 120);
                nv0Var.j0(objO);
            }
            rn.a(cs0Var, gq.N(-1439602302, new k91(cs0Var, i4), nv0Var), null, null, null, r51.N0, gq.N(485235079, new xc((List) objO, ns0Var, i), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i3 >> 3) & 14) | 1769520, 16284);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new e13(i, cs0Var, ns0Var, i2);
        }
    }

    public static final String f0(oh3 oh3Var, nv0 nv0Var) {
        int i;
        int i2;
        oh3Var.getClass();
        int iOrdinal = oh3Var.ordinal();
        if (iOrdinal == 0) {
            i = 1275003330;
            i2 = 2131624364;
        } else if (iOrdinal == 1) {
            i = 1275005889;
            i2 = 2131624363;
        } else if (iOrdinal == 2) {
            i = 1275008384;
            i2 = 2131624361;
        } else {
            if (iOrdinal != 3) {
                throw by1.d(nv0Var, 1275002273, false);
            }
            i = 1275010947;
            i2 = 2131624362;
        }
        return by1.f(nv0Var, i, i2, nv0Var, false);
    }

    public static final void g(String str, String str2, cs0 cs0Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        str.getClass();
        cs0Var.getClass();
        nv0Var.b0(-1812829027);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        int i3 = 0;
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            w22.c(d0(str2, nv0Var), gq.N(-1734557855, new w1(str2, str, cs0Var, 18), nv0Var), null, null, null, 0, 0L, 0L, null, gq.N(-1951055700, new l13(d00Var, i3), nv0Var), nv0Var, 805306416, 508);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v4(str, (Object) str2, cs0Var, (zs0) d00Var, i, 9);
        }
    }

    public static final Boolean g0(int i, v1 v1Var, rp0 rp0Var, jk2 jk2Var) {
        int iOrdinal = rp0Var.u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                rp0 rp0VarZ = br.z(rp0Var);
                if (rp0VarZ == null) {
                    c.q("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = rp0VarZ.u1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolG0 = g0(i, v1Var, rp0VarZ, jk2Var);
                        if (!s51.n(boolG0, Boolean.FALSE)) {
                            return boolG0;
                        }
                        if (jk2Var == null) {
                            if (rp0VarZ.u1() != mp0.g) {
                                c.q("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            rp0 rp0VarS = br.s(rp0VarZ);
                            if (rp0VarS == null) {
                                c.q("ActiveParent must have a focusedChild");
                                return null;
                            }
                            jk2Var = br.v(rp0VarS);
                        }
                        return Boolean.valueOf(J(i, v1Var, rp0Var, jk2Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            c.k();
                            return null;
                        }
                        c.q("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (jk2Var == null) {
                    jk2Var = br.v(rp0VarZ);
                }
                return Boolean.valueOf(J(i, v1Var, rp0Var, jk2Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return rp0Var.r1().a ? (Boolean) v1Var.h(rp0Var) : jk2Var == null ? Boolean.valueOf(I(rp0Var, i, v1Var)) : Boolean.valueOf(Z(i, v1Var, rp0Var, jk2Var));
                }
                c.k();
                return null;
            }
        }
        return Boolean.valueOf(I(rp0Var, i, v1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [nv0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [nv0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    public static final void h(final cs0 cs0Var, final String str, final qp2 qp2Var, final String str2, final String str3, final oh3 oh3Var, final boolean z, final boolean z2, final ns0 ns0Var, final ns0 ns0Var2, final ns0 ns0Var3, final rs0 rs0Var, final ns0 ns0Var4, final ns0 ns0Var5, final ns0 ns0Var6, final cs0 cs0Var2, final cs0 cs0Var3, final cs0 cs0Var4, final cs0 cs0Var5, nv0 nv0Var, final int i) {
        ?? r4;
        int i2;
        zj zjVar;
        ?? r8;
        boolean z3;
        boolean z4;
        final ns0 ns0Var7;
        final cs0 cs0Var6;
        cs0Var.getClass();
        str.getClass();
        qp2Var.getClass();
        str2.getClass();
        str3.getClass();
        oh3Var.getClass();
        ns0Var.getClass();
        ns0Var2.getClass();
        ns0Var3.getClass();
        rs0Var.getClass();
        ns0Var4.getClass();
        ns0Var5.getClass();
        ns0Var6.getClass();
        cs0Var2.getClass();
        cs0Var3.getClass();
        cs0Var4.getClass();
        cs0Var5.getClass();
        nv0Var.b0(1411691801);
        int i3 = i | (nv0Var.h(cs0Var) ? 4 : 2) | (nv0Var.f(str) ? 32 : 16) | (nv0Var.d(qp2Var.ordinal()) ? 256 : 128) | (nv0Var.f(str2) ? 2048 : 1024) | (nv0Var.f(str3) ? 16384 : 8192) | (nv0Var.d(oh3Var.ordinal()) ? 131072 : 65536) | (nv0Var.g(z) ? 1048576 : 524288) | (nv0Var.g(z2) ? 8388608 : 4194304) | (nv0Var.h(ns0Var) ? 67108864 : 33554432) | (nv0Var.h(ns0Var2) ? 536870912 : 268435456);
        int i4 = (nv0Var.h(ns0Var3) ? (char) 4 : (char) 2) | (nv0Var.h(rs0Var) ? ' ' : (char) 16) | (nv0Var.h(ns0Var4) ? (char) 256 : (char) 128) | (nv0Var.h(ns0Var5) ? (char) 2048 : (char) 1024) | (nv0Var.h(ns0Var6) ? (char) 16384 : (char) 8192) | (nv0Var.h(cs0Var2) ? (char) 0 : (char) 0) | (nv0Var.h(cs0Var3) ? (char) 0 : (char) 0) | (nv0Var.h(cs0Var4) ? (char) 0 : (char) 0) | (nv0Var.h(cs0Var5) ? (char) 0 : (char) 0);
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && (38347923 & i4) == 38347922) ? false : true)) {
            Object objO = nv0Var.O();
            zj zjVar2 = c20.a;
            if (objO == zjVar2) {
                objO = b32.w(Boolean.FALSE);
                nv0Var.j0(objO);
            }
            final os1 os1Var = (os1) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar2) {
                objO2 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO2);
            }
            final os1 os1Var2 = (os1) objO2;
            Object objO3 = nv0Var.O();
            if (objO3 == zjVar2) {
                objO3 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO3);
            }
            final os1 os1Var3 = (os1) objO3;
            Object objO4 = nv0Var.O();
            if (objO4 == zjVar2) {
                objO4 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO4);
            }
            final os1 os1Var4 = (os1) objO4;
            Object objO5 = nv0Var.O();
            if (objO5 == zjVar2) {
                objO5 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO5);
            }
            final os1 os1Var5 = (os1) objO5;
            Object objO6 = nv0Var.O();
            if (objO6 == zjVar2) {
                objO6 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO6);
            }
            final os1 os1Var6 = (os1) objO6;
            Context context = (Context) nv0Var.j(x7.b);
            ?? r42 = nv0Var;
            g(oz2.M(2131624336, nv0Var), "general", cs0Var, gq.N(141176349, new ss0() { // from class: c13
                @Override // defpackage.ss0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    nv0 nv0Var2 = (nv0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ry) obj).getClass();
                    if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        g12.s(2131624340, 0, nv0Var2);
                        final os1 os1Var7 = os1Var;
                        final String str4 = str;
                        final os1 os1Var8 = os1Var3;
                        final String str5 = str2;
                        final os1 os1Var9 = os1Var2;
                        final qp2 qp2Var2 = qp2Var;
                        final os1 os1Var10 = os1Var6;
                        gv3.p(gq.N(-1347552754, new ss0() { // from class: j13
                            @Override // defpackage.ss0
                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                nv0 nv0Var3 = (nv0) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((ry) obj4).getClass();
                                byte b2 = 0;
                                if (nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    long j = wx.f;
                                    ei1 ei1VarU = vr.u(j, nv0Var3);
                                    Object objO7 = nv0Var3.O();
                                    zj zjVar3 = c20.a;
                                    if (objO7 == zjVar3) {
                                        objO7 = new d03(os1Var7, 20);
                                        nv0Var3.j0(objO7);
                                    }
                                    yp1 yp1Var = yp1.a;
                                    vp.g(r51.A, gv3.x(3, (cs0) objO7, yp1Var, false), gq.N(-363283059, new z71(str4, 14, b2), nv0Var3), r51.B, r51.C, ei1VarU, nv0Var3, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var3, 6, 6);
                                    ei1 ei1VarU2 = vr.u(j, nv0Var3);
                                    Object objO8 = nv0Var3.O();
                                    if (objO8 == zjVar3) {
                                        objO8 = new d03(os1Var8, 21);
                                        nv0Var3.j0(objO8);
                                    }
                                    vp.g(r51.D, gv3.x(3, (cs0) objO8, yp1Var, false), gq.N(501123766, new z71(str5, 15, b2), nv0Var3), r51.E, r51.F, ei1VarU2, nv0Var3, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var3, 6, 6);
                                    ei1 ei1VarU3 = vr.u(j, nv0Var3);
                                    Object objO9 = nv0Var3.O();
                                    if (objO9 == zjVar3) {
                                        objO9 = new d03(os1Var9, 22);
                                        nv0Var3.j0(objO9);
                                    }
                                    vp.g(r51.G, gv3.x(3, (cs0) objO9, yp1Var, false), gq.N(-1152813739, new pt2(6, qp2Var2), nv0Var3), r51.H, r51.I, ei1VarU3, nv0Var3, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var3, 6, 6);
                                    ei1 ei1VarU4 = vr.u(j, nv0Var3);
                                    Object objO10 = nv0Var3.O();
                                    if (objO10 == zjVar3) {
                                        objO10 = new d03(os1Var10, 23);
                                        nv0Var3.j0(objO10);
                                    }
                                    vp.g(r51.J, gv3.x(3, (cs0) objO10, yp1Var, false), r51.K, r51.L, r51.M, ei1VarU4, nv0Var3, 224262, 388);
                                } else {
                                    nv0Var3.U();
                                }
                                return dm3.a;
                            }
                        }, nv0Var2), nv0Var2, 6);
                        g12.s(2131624339, 0, nv0Var2);
                        final ns0 ns0Var8 = ns0Var5;
                        final boolean z5 = z;
                        final ns0 ns0Var9 = ns0Var6;
                        final boolean z6 = z2;
                        final os1 os1Var11 = os1Var4;
                        final String str6 = str3;
                        final os1 os1Var12 = os1Var5;
                        final oh3 oh3Var2 = oh3Var;
                        gv3.p(gq.N(315975173, new ss0() { // from class: k13
                            @Override // defpackage.ss0
                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                nv0 nv0Var3 = (nv0) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((ry) obj4).getClass();
                                byte b2 = 0;
                                if (nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    long j = wx.f;
                                    ei1 ei1VarU = vr.u(j, nv0Var3);
                                    Object objO7 = nv0Var3.O();
                                    zj zjVar3 = c20.a;
                                    if (objO7 == zjVar3) {
                                        objO7 = new d03(os1Var11, 6);
                                        nv0Var3.j0(objO7);
                                    }
                                    yp1 yp1Var = yp1.a;
                                    vp.g(r51.N, gv3.x(3, (cs0) objO7, yp1Var, false), gq.N(1306346948, new z71(str6, 13, b2), nv0Var3), r51.O, r51.P, ei1VarU, nv0Var3, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var3, 6, 6);
                                    ei1 ei1VarU2 = vr.u(j, nv0Var3);
                                    Object objO8 = nv0Var3.O();
                                    if (objO8 == zjVar3) {
                                        objO8 = new d03(os1Var12, 7);
                                        nv0Var3.j0(objO8);
                                    }
                                    vp.g(r51.Q, gv3.x(3, (cs0) objO8, yp1Var, false), gq.N(-1222349651, new pt2(5, oh3Var2), nv0Var3), r51.R, r51.S, ei1VarU2, nv0Var3, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var3, 6, 6);
                                    ei1 ei1VarU3 = vr.u(j, nv0Var3);
                                    ns0 ns0Var10 = ns0Var8;
                                    boolean zF = nv0Var3.f(ns0Var10);
                                    boolean z7 = z5;
                                    boolean zG = zF | nv0Var3.g(z7);
                                    Object objO9 = nv0Var3.O();
                                    if (zG || objO9 == zjVar3) {
                                        objO9 = new et(3, ns0Var10, z7);
                                        nv0Var3.j0(objO9);
                                    }
                                    vp.g(r51.T, rn.y(yp1Var, false, null, (cs0) objO9, 15), r51.U, r51.V, gq.N(1202548042, new s03(0, ns0Var10, z7), nv0Var3), ei1VarU3, nv0Var3, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var3, 6, 6);
                                    ei1 ei1VarU4 = vr.u(j, nv0Var3);
                                    ns0 ns0Var11 = ns0Var9;
                                    boolean zF2 = nv0Var3.f(ns0Var11);
                                    boolean z8 = z6;
                                    boolean zG2 = zF2 | nv0Var3.g(z8);
                                    Object objO10 = nv0Var3.O();
                                    if (zG2 || objO10 == zjVar3) {
                                        objO10 = new et(4, ns0Var11, z8);
                                        nv0Var3.j0(objO10);
                                    }
                                    vp.g(r51.W, rn.y(yp1Var, false, null, (cs0) objO10, 15), r51.X, r51.Y, gq.N(906505257, new s03(1, ns0Var11, z8), nv0Var3), ei1VarU4, nv0Var3, 224262, 388);
                                } else {
                                    nv0Var3.U();
                                }
                                return dm3.a;
                            }
                        }, nv0Var2), nv0Var2, 6);
                    } else {
                        nv0Var2.U();
                    }
                    return dm3.a;
                }
            }, r42), r42, ((i3 << 6) & 896) | 3120);
            if (((Boolean) os1Var.getValue()).booleanValue()) {
                r42.a0(-602225884);
                i2 = i4;
                boolean z5 = ((3670016 & i2) == 1048576) | ((i3 & 234881024) == 67108864);
                Object objO7 = r42.O();
                zjVar = zjVar2;
                if (z5 || objO7 == zjVar) {
                    final int i5 = 1;
                    objO7 = new ns0() { // from class: z03
                        @Override // defpackage.ns0
                        public final Object h(Object obj) {
                            int i6 = i5;
                            dm3 dm3Var = dm3.a;
                            os1 os1Var7 = os1Var;
                            cs0 cs0Var7 = cs0Var3;
                            ns0 ns0Var8 = ns0Var;
                            String str4 = (String) obj;
                            switch (i6) {
                                case 0:
                                    str4.getClass();
                                    ns0Var8.h(str4);
                                    cs0Var7.a();
                                    os1Var7.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    str4.getClass();
                                    ns0Var8.h(str4);
                                    cs0Var7.a();
                                    os1Var7.setValue(Boolean.FALSE);
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    r42.j0(objO7);
                }
                ns0 ns0Var8 = (ns0) objO7;
                Object objO8 = r42.O();
                if (objO8 == zjVar) {
                    objO8 = new d03(os1Var, 8);
                    r42.j0(objO8);
                }
                k(str, ns0Var8, (cs0) objO8, r42, ((i3 >> 3) & 14) | 384);
                r8 = 0;
                r42.p(false);
            } else {
                i2 = i4;
                zjVar = zjVar2;
                r8 = 0;
                r42.a0(-602005815);
                r42.p(false);
            }
            if (((Boolean) os1Var2.getValue()).booleanValue()) {
                r42.a0(-601960896);
                ?? r1 = (i3 & 1879048192) == 536870912 ? 1 : r8;
                Object objO9 = r42.O();
                if (r1 != 0 || objO9 == zjVar) {
                    objO9 = new u03(ns0Var2, os1Var2, r8);
                    r42.j0(objO9);
                }
                ns0 ns0Var9 = (ns0) objO9;
                Object objO10 = r42.O();
                if (objO10 == zjVar) {
                    objO10 = new d03(os1Var2, 11);
                    r42.j0(objO10);
                }
                b(qp2Var, ns0Var9, (cs0) objO10, r42, ((i3 >> 6) & 14) | 384);
                r42.p(false);
            } else {
                r42.a0(-601675479);
                r42.p(r8);
            }
            if (((Boolean) os1Var3.getValue()).booleanValue()) {
                r42.a0(-601620330);
                int i6 = i2 & 14;
                int i7 = i2 & 29360128;
                boolean z6 = (i6 == 4) | (i7 == 8388608);
                Object objO11 = r42.O();
                if (z6 || objO11 == zjVar) {
                    ns0Var7 = ns0Var3;
                    cs0Var6 = cs0Var4;
                    final int i8 = 0;
                    objO11 = new ns0() { // from class: z03
                        @Override // defpackage.ns0
                        public final Object h(Object obj) {
                            int i62 = i8;
                            dm3 dm3Var = dm3.a;
                            os1 os1Var7 = os1Var3;
                            cs0 cs0Var7 = cs0Var6;
                            ns0 ns0Var82 = ns0Var7;
                            String str4 = (String) obj;
                            switch (i62) {
                                case 0:
                                    str4.getClass();
                                    ns0Var82.h(str4);
                                    cs0Var7.a();
                                    os1Var7.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    str4.getClass();
                                    ns0Var82.h(str4);
                                    cs0Var7.a();
                                    os1Var7.setValue(Boolean.FALSE);
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    r42.j0(objO11);
                } else {
                    ns0Var7 = ns0Var3;
                    cs0Var6 = cs0Var4;
                }
                ns0 ns0Var10 = (ns0) objO11;
                boolean z7 = (i6 == 4) | (i7 == 8388608);
                Object objO12 = r42.O();
                if (z7 || objO12 == zjVar) {
                    objO12 = new ok(ns0Var7, cs0Var6, os1Var3, 21);
                    r42.j0(objO12);
                }
                cs0 cs0Var7 = (cs0) objO12;
                Object objO13 = r42.O();
                if (objO13 == zjVar) {
                    objO13 = new d03(os1Var3, 12);
                    r42.j0(objO13);
                }
                z3 = true;
                c(((i3 >> 9) & 14) | 3072, cs0Var7, (cs0) objO13, ns0Var10, r42, str2);
                r42.p(false);
            } else {
                z3 = true;
                r42.a0(-601110039);
                r42.p(false);
            }
            if (((Boolean) os1Var4.getValue()).booleanValue()) {
                r42.a0(-601072002);
                boolean zH = ((i2 & 112) == 32 ? z3 : false) | r42.h(context);
                Object objO14 = r42.O();
                if (zH || objO14 == zjVar) {
                    objO14 = new v1(rs0Var, context, os1Var4, 24);
                    r42.j0(objO14);
                }
                ns0 ns0Var11 = (ns0) objO14;
                Object objO15 = r42.O();
                if (objO15 == zjVar) {
                    objO15 = new d03(os1Var4, 13);
                    r42.j0(objO15);
                }
                j(str3, ns0Var11, (cs0) objO15, r42, ((i3 >> 12) & 14) | 384);
                r42.p(false);
            } else {
                r42.a0(-600815415);
                r42.p(false);
            }
            if (((Boolean) os1Var5.getValue()).booleanValue()) {
                r42.a0(-600782307);
                boolean z8 = (i2 & 896) == 256 ? z3 : false;
                Object objO16 = r42.O();
                if (z8 || objO16 == zjVar) {
                    objO16 = new u03(ns0Var4, os1Var5, 4);
                    r42.j0(objO16);
                }
                ns0 ns0Var12 = (ns0) objO16;
                Object objO17 = r42.O();
                if (objO17 == zjVar) {
                    objO17 = new d03(os1Var5, 18);
                    r42.j0(objO17);
                }
                w(oh3Var, ns0Var12, (cs0) objO17, r42, ((i3 >> 15) & 14) | 384);
                z4 = false;
                r42.p(false);
            } else {
                z4 = false;
                r42.a0(-600586263);
                r42.p(false);
            }
            if (((Boolean) os1Var6.getValue()).booleanValue()) {
                r42.a0(-600534431);
                Object objO18 = r42.O();
                if (objO18 == zjVar) {
                    objO18 = new d03(os1Var6, 19);
                    r42.j0(objO18);
                }
                rn.a((cs0) objO18, gq.N(-2105395125, new w1(cs0Var2, cs0Var5, os1Var6), r42), null, gq.N(-2079249331, new l8(os1Var6, 23), r42), null, r51.b0, r51.c0, null, 0L, 0L, 0L, 0L, null, nv0Var, 1772598, 16276);
                nv0 nv0Var2 = nv0Var;
                nv0Var2.p(false);
                r4 = nv0Var2;
            } else {
                r42.a0(-599727191);
                r42.p(z4);
                r4 = r42;
            }
        } else {
            nv0 nv0Var3 = nv0Var;
            nv0Var3.U();
            r4 = nv0Var3;
        }
        xj2 xj2VarT = r4.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(str, qp2Var, str2, str3, oh3Var, z, z2, ns0Var, ns0Var2, ns0Var3, rs0Var, ns0Var4, ns0Var5, ns0Var6, cs0Var2, cs0Var3, cs0Var4, cs0Var5, i) { // from class: n13
                public final /* synthetic */ String g;
                public final /* synthetic */ qp2 h;
                public final /* synthetic */ String i;
                public final /* synthetic */ String j;
                public final /* synthetic */ oh3 k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ ns0 n;
                public final /* synthetic */ ns0 o;
                public final /* synthetic */ ns0 p;
                public final /* synthetic */ rs0 q;
                public final /* synthetic */ ns0 r;
                public final /* synthetic */ ns0 s;
                public final /* synthetic */ ns0 t;
                public final /* synthetic */ cs0 u;
                public final /* synthetic */ cs0 v;
                public final /* synthetic */ cs0 w;
                public final /* synthetic */ cs0 x;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    g12.h(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final vq3 h0(lu luVar, cr3 cr3Var, i21 i21Var, e60 e60Var, nv0 nv0Var) {
        zq3 defaultViewModelProviderFactory = i21Var;
        if (i21Var == null) {
            defaultViewModelProviderFactory = cr3Var instanceof rx0 ? ((rx0) cr3Var).getDefaultViewModelProviderFactory() : z90.b;
        }
        defaultViewModelProviderFactory.getClass();
        e60Var.getClass();
        pl plVar = new pl(cr3Var.getViewModelStore(), defaultViewModelProviderFactory, e60Var);
        String strB = luVar.b();
        if (strB != null) {
            return plVar.y(luVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        c.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final defpackage.cs0 r22, final boolean r23, final boolean r24, final defpackage.qf2 r25, final boolean r26, int r27, int r28, final defpackage.ns0 r29, final defpackage.ns0 r30, defpackage.ns0 r31, final defpackage.ns0 r32, defpackage.ns0 r33, defpackage.ns0 r34, defpackage.nv0 r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.i(cs0, boolean, boolean, qf2, boolean, int, int, ns0, ns0, ns0, ns0, ns0, ns0, nv0, int):void");
    }

    public static final void j(String str, ns0 ns0Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-2055548667);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            rn.a(cs0Var, gq.N(1143421373, new k91(cs0Var, 17), nv0Var), null, null, null, r51.p0, gq.N(-318507752, new nh2(8, ns0Var, str), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i2 >> 6) & 14) | 1769520, 16284);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new f13(str, ns0Var, cs0Var, i, 1);
        }
    }

    public static final void k(String str, ns0 ns0Var, cs0 cs0Var, nv0 nv0Var, int i) {
        Object obj;
        int i2;
        nv0Var.b0(1558570671);
        if ((i & 6) == 0) {
            obj = str;
            i2 = (nv0Var.f(obj) ? 4 : 2) | i;
        } else {
            obj = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objO = nv0Var.O();
            if (z || objO == c20.a) {
                objO = b32.w(obj);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            rn.a(cs0Var, gq.N(462573415, new zh2(ns0Var, os1Var, i3), nv0Var), null, gq.N(-122198235, new k91(cs0Var, 13), nv0Var), null, r51.h0, gq.N(-999355710, new l8(os1Var, 21), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i2 >> 6) & 14) | 1772592, 16276);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new f13(str, ns0Var, cs0Var, i, 0);
        }
    }

    public static final void l(cs0 cs0Var, boolean z, boolean z2, ns0 ns0Var, ns0 ns0Var2, cs0 cs0Var2, nv0 nv0Var, int i) {
        boolean z3;
        boolean z4;
        ns0 ns0Var3;
        ns0 ns0Var4;
        cs0 cs0Var3;
        nv0 nv0Var2;
        cs0 cs0Var4;
        cs0Var.getClass();
        ns0Var.getClass();
        ns0Var2.getClass();
        cs0Var2.getClass();
        nv0Var.b0(-493725929);
        int i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i | (nv0Var.g(z) ? 32 : 16) | (nv0Var.g(z2) ? 256 : 128) | (nv0Var.h(ns0Var) ? 2048 : 1024) | (nv0Var.h(ns0Var2) ? 16384 : 8192) | (nv0Var.h(cs0Var2) ? 131072 : 65536);
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            z3 = z;
            z4 = z2;
            ns0Var3 = ns0Var;
            ns0Var4 = ns0Var2;
            cs0Var3 = cs0Var2;
            nv0Var2 = nv0Var;
            g(oz2.M(2131624338, nv0Var), "notifications", cs0Var, gq.N(924839451, new ua2(ns0Var3, z3, ns0Var4, z4, cs0Var3), nv0Var), nv0Var2, ((i2 << 6) & 896) | 3120);
            cs0Var4 = cs0Var;
        } else {
            z3 = z;
            z4 = z2;
            ns0Var3 = ns0Var;
            ns0Var4 = ns0Var2;
            cs0Var3 = cs0Var2;
            nv0Var2 = nv0Var;
            cs0Var4 = cs0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new pv(cs0Var4, z3, z4, ns0Var3, ns0Var4, cs0Var3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final java.lang.String r40, final defpackage.ns0 r41, final defpackage.bq1 r42, boolean r43, boolean r44, defpackage.gh3 r45, defpackage.rs0 r46, defpackage.rs0 r47, defpackage.rs0 r48, defpackage.rs0 r49, defpackage.rs0 r50, boolean r51, defpackage.nr3 r52, defpackage.o71 r53, defpackage.n71 r54, boolean r55, int r56, int r57, defpackage.z13 r58, defpackage.se3 r59, defpackage.nv0 r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.m(java.lang.String, ns0, bq1, boolean, boolean, gh3, rs0, rs0, rs0, rs0, rs0, boolean, nr3, o71, n71, boolean, int, int, z13, se3, nv0, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0660  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final defpackage.rs0 r43, defpackage.ss0 r44, defpackage.rs0 r45, final defpackage.rs0 r46, final defpackage.rs0 r47, defpackage.rs0 r48, final defpackage.rs0 r49, final boolean r50, final defpackage.ef3 r51, final defpackage.bf3 r52, final defpackage.ns0 r53, final defpackage.d00 r54, defpackage.rs0 r55, defpackage.x12 r56, defpackage.nv0 r57, final int r58, final int r59) {
        /*
            Method dump skipped, instruction units count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.n(rs0, ss0, rs0, rs0, rs0, rs0, rs0, boolean, ef3, bf3, ns0, d00, rs0, x12, nv0, int, int):void");
    }

    public static final void o(qf2 qf2Var, ns0 ns0Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(973576490);
        if ((i & 6) == 0) {
            i2 = (nv0Var.d(qf2Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            rn.a(cs0Var, gq.N(-8081950, new k91(cs0Var, 18), nv0Var), null, null, null, r51.t0, gq.N(-1129039683, new nh2(9, ns0Var, qf2Var), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i2 >> 6) & 14) | 1769520, 16284);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(qf2Var, ns0Var, cs0Var, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.vu2 p(defpackage.tb1 r8, boolean r9) {
        /*
            ax1 r0 = r8.L
            aq1 r0 = r0.f
            int r1 = r0.i
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.h
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof defpackage.tu2
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.h
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof defpackage.ja0
            if (r4 == 0) goto L56
            r4 = r1
            ja0 r4 = (defpackage.ja0) r4
            aq1 r4 = r4.u
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.h
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            qs1 r3 = new qs1
            r6 = 16
            aq1[] r6 = new defpackage.aq1[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.b(r1)
            r1 = r2
        L4d:
            r3.b(r4)
        L50:
            aq1 r4 = r4.k
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            aq1 r1 = defpackage.vr.j(r3)
            goto L15
        L5b:
            int r1 = r0.i
            r1 = r1 & 8
            if (r1 == 0) goto L64
            aq1 r0 = r0.k
            goto Lb
        L64:
            r2.getClass()
            tu2 r2 = (defpackage.tu2) r2
            aq1 r2 = (defpackage.aq1) r2
            aq1 r0 = r2.f
            qu2 r1 = r8.w()
            if (r1 != 0) goto L78
            qu2 r1 = new qu2
            r1.<init>()
        L78:
            vu2 r2 = new vu2
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.p(tb1, boolean):vu2");
    }

    public static final void q(cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, cs0 cs0Var5, nv0 nv0Var, int i) {
        cs0Var.getClass();
        cs0Var2.getClass();
        cs0Var3.getClass();
        cs0Var4.getClass();
        cs0Var5.getClass();
        nv0Var.b0(832186359);
        int i2 = i | (nv0Var.h(cs0Var) ? 4 : 2) | (nv0Var.h(cs0Var2) ? 32 : 16) | (nv0Var.h(cs0Var3) ? 256 : 128) | (nv0Var.h(cs0Var4) ? 2048 : 1024) | (nv0Var.h(cs0Var5) ? 16384 : 8192);
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            gv3.i(oz2.M(2131624347, nv0Var), gq.N(-333831315, new y03(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, 0), nv0Var), nv0Var, 48);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new x03(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, i, 1);
        }
    }

    public static final void r(cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, cs0 cs0Var5, nv0 nv0Var, int i) {
        cs0 cs0Var6;
        cs0 cs0Var7;
        cs0 cs0Var8;
        cs0 cs0Var9;
        cs0 cs0Var10;
        nv0 nv0Var2;
        cs0Var.getClass();
        cs0Var2.getClass();
        cs0Var3.getClass();
        cs0Var4.getClass();
        cs0Var5.getClass();
        nv0Var.b0(1490396574);
        int i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i | (nv0Var.h(cs0Var2) ? 32 : 16) | (nv0Var.h(cs0Var3) ? 256 : 128) | (nv0Var.h(cs0Var4) ? 2048 : 1024) | (nv0Var.h(cs0Var5) ? 16384 : 8192);
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            nv0Var2 = nv0Var;
            q(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, nv0Var2, i2 & 65534);
            cs0Var6 = cs0Var;
            cs0Var7 = cs0Var2;
            cs0Var8 = cs0Var3;
            cs0Var9 = cs0Var4;
            cs0Var10 = cs0Var5;
        } else {
            cs0Var6 = cs0Var;
            cs0Var7 = cs0Var2;
            cs0Var8 = cs0Var3;
            cs0Var9 = cs0Var4;
            cs0Var10 = cs0Var5;
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new x03(cs0Var6, cs0Var7, cs0Var8, cs0Var9, cs0Var10, i, 0);
        }
    }

    public static final void s(int i, int i2, nv0 nv0Var) {
        nv0Var.b0(1700456232);
        int i3 = (nv0Var.d(i) ? 4 : 2) | i2;
        if (nv0Var.R(i3 & 1, (i3 & 3) != 2)) {
            mg3.b(oz2.M(i, nv0Var), f80.L(yp1.a, 4.0f, 0.0f, 2), ((fy) nv0Var.j(hy.a)).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).i, nv0Var, 48, 0, 131064);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new t03(i, i2);
        }
    }

    public static final void t(String str, int i, nv0 nv0Var, int i2) {
        nv0Var.b0(-1197944677);
        int i3 = (nv0Var.d(i) ? 32 : 16) | i2;
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            u(str, oz2.M(i, nv0Var), nv0Var, 6);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new h8(i, i2, str);
        }
    }

    public static final void u(String str, String str2, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-363583609);
        if ((i & 6) == 0) {
            i2 = i | (nv0Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (nv0Var.f(str2) ? 32 : 16);
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            c33 c33Var = (c33) nv0Var.j(da1.a);
            he heVar = (he) nv0Var.j(da1.b);
            bq1 bq1VarT = yp1.a;
            if (c33Var == null || heVar == null) {
                nv0Var.a0(388976731);
                nv0Var.p(false);
            } else {
                nv0Var.a0(388529649);
                y23 y23VarB = c33.b("settings-title-".concat(str), nv0Var);
                Object objO = nv0Var.O();
                if (objO == c20.a) {
                    objO = new r03(1);
                    nv0Var.j0(objO);
                }
                x23.a.getClass();
                bq1VarT = lr.t(bq1VarT, new b33(y23VarB, heVar.a(), hd.x, c33Var, w23.b, true, h33.a, (r03) objO));
                nv0Var.p(false);
            }
            mg3.b(str2, bq1VarT, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, (i3 >> 3) & 14, 0, 262140);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gn2(str, str2, i);
        }
    }

    public static final void v(boolean z, sl2 sl2Var, sf3 sf3Var, nv0 nv0Var, int i) {
        int i2;
        qg3 qg3VarD;
        nv0Var.b0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (nv0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.d(sl2Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(sf3Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | nv0Var.f(sf3Var);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zF || objO == zjVar) {
                objO = new pf3(sf3Var, z);
                nv0Var.j0(objO);
            }
            qe3 qe3Var = (qe3) objO;
            boolean zH = (i3 == 4) | nv0Var.h(sf3Var);
            Object objO2 = nv0Var.O();
            if (zH || objO2 == zjVar) {
                objO2 = new tf3(sf3Var, z);
                nv0Var.j0(objO2);
            }
            jy1 jy1Var = (jy1) objO2;
            boolean zG = yg3.g(sf3Var.n().b);
            int i4 = (int) (z ? sf3Var.n().b >> 32 : sf3Var.n().b & 4294967295L);
            ye1 ye1Var = sf3Var.d;
            float fH = 0.0f;
            if (ye1Var != null && (qg3VarD = ye1Var.d()) != null) {
                pg3 pg3Var = qg3VarD.a;
                if (i4 >= 0) {
                    og3 og3Var = pg3Var.a;
                    br1 br1Var = pg3Var.b;
                    if (og3Var.a.g.length() != 0) {
                        int iMin = Math.min(br1Var.d(i4), Math.min(br1Var.b - 1, br1Var.f - 1));
                        if (i4 <= br1Var.c(iMin, false)) {
                            br1Var.m(iMin);
                            ArrayList arrayList = br1Var.h;
                            t32 t32Var = (t32) arrayList.get(lr.B(iMin, arrayList));
                            fH = t32Var.a.d.h(iMin - t32Var.d);
                        }
                    }
                }
            }
            float f = fH;
            boolean zH2 = nv0Var.h(qe3Var);
            Object objO3 = nv0Var.O();
            if (zH2 || objO3 == zjVar) {
                objO3 = new v8(11, qe3Var);
                nv0Var.j0(objO3);
            }
            gv3.n(jy1Var, z, sl2Var, zG, 0L, f, ob3.a(yp1.a, qe3Var, (PointerInputEventHandler) objO3), nv0Var, (i2 << 3) & 1008);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new lb(z, sl2Var, sf3Var, i);
        }
    }

    public static final void w(oh3 oh3Var, ns0 ns0Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(1988968033);
        if ((i & 6) == 0) {
            i2 = (nv0Var.d(oh3Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            rn.a(cs0Var, gq.N(892970777, new k91(cs0Var, 14), nv0Var), null, null, null, r51.r0, gq.N(-568958348, new nh2(7, ns0Var, oh3Var), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i2 >> 6) & 14) | 1769520, 16284);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(oh3Var, ns0Var, cs0Var, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.cs2 r9, float r10, defpackage.pe r11, defpackage.h80 r12, defpackage.ns0 r13, defpackage.q40 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.q63
            if (r0 == 0) goto L13
            r0 = r14
            q63 r0 = (defpackage.q63) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            q63 r0 = new q63
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.l
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            float r10 = r0.i
            nk2 r9 = r0.k
            pe r11 = r0.j
            defpackage.y02.Q(r14)
            goto L69
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            r9 = 0
            return r9
        L32:
            defpackage.y02.Q(r14)
            nk2 r5 = new nk2
            r5.<init>()
            java.lang.Object r14 = r11.a()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4b
            r14 = r2
            goto L4c
        L4b:
            r14 = 0
        L4c:
            r14 = r14 ^ r2
            p63 r3 = new p63
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.j = r11
            r0.k = r5
            r0.i = r4
            r0.m = r2
            java.lang.Object r9 = defpackage.t22.n(r11, r12, r14, r3, r0)
            y50 r10 = defpackage.y50.f
            if (r9 != r10) goto L67
            return r10
        L67:
            r10 = r4
            r9 = r5
        L69:
            le r12 = new le
            float r9 = r9.f
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.x(cs2, float, pe, h80, ns0, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(defpackage.cs2 r16, float r17, float r18, defpackage.pe r19, defpackage.s83 r20, defpackage.ns0 r21, defpackage.q40 r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.r63
            if (r2 == 0) goto L18
            r2 = r1
            r63 r2 = (defpackage.r63) r2
            int r3 = r2.n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.n = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            r63 r2 = new r63
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.m
            int r2 = r8.n
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            float r0 = r8.j
            float r2 = r8.i
            nk2 r3 = r8.l
            pe r4 = r8.k
            defpackage.y02.Q(r1)
            r1 = r0
            r0 = r2
            goto L8f
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r0)
            r0 = 0
            return r0
        L3d:
            defpackage.y02.Q(r1)
            nk2 r12 = new nk2
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L64
            r2 = r3
            goto L65
        L64:
            r2 = 0
        L65:
            r6 = r2 ^ 1
            p63 r10 = new p63
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.k = r2
            r8.l = r12
            r8.i = r0
            r8.j = r1
            r8.n = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = defpackage.t22.o(r3, r4, r5, r6, r7, r8)
            y50 r3 = defpackage.y50.f
            if (r2 != r3) goto L8c
            return r3
        L8c:
            r4 = r19
            r3 = r12
        L8f:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = E(r2, r1)
            le r2 = new le
            float r3 = r3.f
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            pe r0 = defpackage.cl3.k(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.y(cs2, float, float, pe, s83, ns0, q40):java.lang.Object");
    }

    public static void z(m53 m53Var, List list, l20 l20Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = m53Var.c((iv0) list.get(i));
            int iN = m53Var.N(m53Var.b, m53Var.r(iC));
            Object obj = iN < m53Var.g(m53Var.b, m53Var.r(iC + 1)) ? m53Var.c[m53Var.h(iN)] : c20.a;
            xj2 xj2Var = obj instanceof xj2 ? (xj2) obj : null;
            if (xj2Var != null) {
                xj2Var.a = l20Var;
            }
        }
    }

    public abstract void b0(boolean z);

    public abstract void c0(boolean z);

    public abstract void e0();
}
