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
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static final boolean C(jk2 jk2Var, jk2 jk2Var2, jk2 jk2Var3, int i) {
        boolean zD = D(i, jk2Var3, jk2Var);
        float f = jk2Var3.b;
        float f2 = jk2Var3.d;
        float f3 = jk2Var3.a;
        float f4 = jk2Var3.c;
        float f5 = jk2Var.d;
        float f6 = jk2Var.b;
        float f7 = jk2Var.c;
        float f8 = jk2Var.a;
        if (!zD && D(i, jk2Var2, jk2Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            c.q("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
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
            i2 = R.string.launcher_language_chinese;
        } else if (str.equals("ru")) {
            i = -710067855;
            i2 = R.string.launcher_language_russian;
        } else {
            i = -710065711;
            i2 = R.string.launcher_language_english;
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
            g(oz2.M(R.string.launcher_settings_about_title, nv0Var), "about", cs0Var, gq.N(1970241876, new y03(str2, (Drawable) objO3, jcVar, an3Var, cs0Var2), nv0Var), nv0Var, ((i2 << 6) & 896) | 3120);
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
            g(oz2.M(R.string.launcher_settings_debug_title, nv0Var), "debug", cs0Var, gq.N(-656846351, new q03(cs0Var2, cs0Var5, cs0Var3, cs0Var4, 0), nv0Var), nv0Var, ((i2 << 6) & 896) | 3120);
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
                                mg3.b(oz2.N(R.string.launcher_label_font_size, new Object[]{Integer.valueOf(vm1.M(z32Var2.g()))}, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
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
                                String strN = oz2.N(R.string.launcher_font_size_value, new Object[]{8}, nv0Var3);
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
                                mg3.b(oz2.N(R.string.launcher_font_size_value, new Object[]{16}, nv0Var3), null, ((fy) nv0Var3.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(r93Var)).l, nv0Var3, 0, 0, 131066);
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
                                mg3.b(oz2.N(R.string.launcher_label_font_size, new Object[]{Integer.valueOf(vm1.M(z32Var2.g()))}, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
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
                                String strN = oz2.N(R.string.launcher_font_size_value, new Object[]{8}, nv0Var3);
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
                                mg3.b(oz2.N(R.string.launcher_font_size_value, new Object[]{16}, nv0Var3), null, ((fy) nv0Var3.j(r93Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(r93Var)).l, nv0Var3, 0, 0, 131066);
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
            i2 = R.string.launcher_value_theme_system;
        } else if (iOrdinal == 1) {
            i = 1275005889;
            i2 = R.string.launcher_value_theme_light;
        } else if (iOrdinal == 2) {
            i = 1275008384;
            i2 = R.string.launcher_value_theme_dark;
        } else {
            if (iOrdinal != 3) {
                throw by1.d(nv0Var, 1275002273, false);
            }
            i = 1275010947;
            i2 = R.string.launcher_value_theme_dynamic;
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
            g(oz2.M(R.string.launcher_settings_general_title, nv0Var), "general", cs0Var, gq.N(141176349, new ss0() { // from class: c13
                @Override // defpackage.ss0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    nv0 nv0Var2 = (nv0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ry) obj).getClass();
                    if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        g12.s(R.string.launcher_settings_section_client, 0, nv0Var2);
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
                        g12.s(R.string.launcher_settings_section_appearance, 0, nv0Var2);
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
    */
    public static final void i(final cs0 cs0Var, final boolean z, final boolean z2, final qf2 qf2Var, final boolean z3, int i, int i2, final ns0 ns0Var, final ns0 ns0Var2, ns0 ns0Var3, final ns0 ns0Var4, ns0 ns0Var5, ns0 ns0Var6, nv0 nv0Var, final int i3) {
        qf2 qf2Var2;
        final ns0 ns0Var7;
        nv0 nv0Var2;
        final ns0 ns0Var8;
        final ns0 ns0Var9;
        zj zjVar;
        int i4;
        Object objO;
        final int i5 = i;
        final int i6 = i2;
        cs0Var.getClass();
        qf2Var.getClass();
        ns0Var.getClass();
        ns0Var2.getClass();
        ns0Var3.getClass();
        ns0Var4.getClass();
        ns0Var5.getClass();
        ns0Var6.getClass();
        nv0Var.b0(523429392);
        int i7 = i3 | (nv0Var.h(cs0Var) ? 4 : 2) | (nv0Var.g(z) ? 32 : 16) | (nv0Var.g(z2) ? 256 : 128) | (nv0Var.d(qf2Var.ordinal()) ? 2048 : 1024) | (nv0Var.g(z3) ? 16384 : 8192) | (nv0Var.d(i5) ? 131072 : 65536) | (nv0Var.d(i6) ? 1048576 : 524288) | (nv0Var.h(ns0Var) ? 8388608 : 4194304) | (nv0Var.h(ns0Var2) ? 67108864 : 33554432) | (nv0Var.h(ns0Var3) ? 536870912 : 268435456);
        int i8 = (nv0Var.h(ns0Var4) ? (char) 4 : (char) 2) | (nv0Var.h(ns0Var5) ? ' ' : (char) 16) | (nv0Var.h(ns0Var6) ? (char) 256 : (char) 128);
        if (nv0Var.R(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            Object objO2 = nv0Var.O();
            zj zjVar2 = c20.a;
            if (objO2 == zjVar2) {
                objO2 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO2);
            }
            final os1 os1Var = (os1) objO2;
            Object objO3 = nv0Var.O();
            if (objO3 == zjVar2) {
                objO3 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO3);
            }
            final os1 os1Var2 = (os1) objO3;
            Object objO4 = nv0Var.O();
            if (objO4 == zjVar2) {
                objO4 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO4);
            }
            final os1 os1Var3 = (os1) objO4;
            String strM = oz2.M(R.string.launcher_settings_ingame_title, nv0Var);
            ss0 ss0Var = new ss0() { // from class: a13
                @Override // defpackage.ss0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    nv0 nv0Var3 = (nv0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ry) obj).getClass();
                    if (nv0Var3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        g12.s(R.string.launcher_settings_section_input, 0, nv0Var3);
                        final ns0 ns0Var10 = ns0Var;
                        final boolean z4 = z;
                        final ns0 ns0Var11 = ns0Var4;
                        final boolean z5 = z3;
                        final ns0 ns0Var12 = ns0Var2;
                        final boolean z6 = z2;
                        final os1 os1Var4 = os1Var3;
                        final qf2 qf2Var3 = qf2Var;
                        gv3.p(gq.N(-1336119611, new ss0() { // from class: g13
                            @Override // defpackage.ss0
                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                nv0 nv0Var4 = (nv0) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((ry) obj4).getClass();
                                if (nv0Var4.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    long j = wx.f;
                                    ei1 ei1VarU = vr.u(j, nv0Var4);
                                    ns0 ns0Var13 = ns0Var10;
                                    boolean zF = nv0Var4.f(ns0Var13);
                                    boolean z7 = z4;
                                    boolean zG = zF | nv0Var4.g(z7);
                                    Object objO5 = nv0Var4.O();
                                    zj zjVar3 = c20.a;
                                    if (zG || objO5 == zjVar3) {
                                        objO5 = new et(7, ns0Var13, z7);
                                        nv0Var4.j0(objO5);
                                    }
                                    yp1 yp1Var = yp1.a;
                                    vp.g(r51.u0, rn.y(yp1Var, false, null, (cs0) objO5, 15), r51.v0, r51.w0, gq.N(-1649042238, new s03(4, ns0Var13, z7), nv0Var4), ei1VarU, nv0Var4, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var4, 6, 6);
                                    ei1 ei1VarU2 = vr.u(j, nv0Var4);
                                    ns0 ns0Var14 = ns0Var11;
                                    boolean zF2 = nv0Var4.f(ns0Var14);
                                    boolean z8 = z5;
                                    boolean zG2 = zF2 | nv0Var4.g(z8);
                                    Object objO6 = nv0Var4.O();
                                    if (zG2 || objO6 == zjVar3) {
                                        objO6 = new et(8, ns0Var14, z8);
                                        nv0Var4.j0(objO6);
                                    }
                                    vp.g(r51.x0, rn.y(yp1Var, false, null, (cs0) objO6, 15), r51.y0, r51.z0, gq.N(-886461141, new s03(5, ns0Var14, z8), nv0Var4), ei1VarU2, nv0Var4, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var4, 6, 6);
                                    ei1 ei1VarU3 = vr.u(j, nv0Var4);
                                    ns0 ns0Var15 = ns0Var12;
                                    boolean zF3 = nv0Var4.f(ns0Var15);
                                    boolean z9 = z6;
                                    boolean zG3 = zF3 | nv0Var4.g(z9);
                                    Object objO7 = nv0Var4.O();
                                    if (zG3 || objO7 == zjVar3) {
                                        objO7 = new et(9, ns0Var15, z9);
                                        nv0Var4.j0(objO7);
                                    }
                                    vp.g(r51.A0, rn.y(yp1Var, false, null, (cs0) objO7, 15), r51.B0, r51.C0, gq.N(2015572746, new s03(6, ns0Var15, z9), nv0Var4), ei1VarU3, nv0Var4, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var4, 6, 6);
                                    ei1 ei1VarU4 = vr.u(j, nv0Var4);
                                    Object objO8 = nv0Var4.O();
                                    if (objO8 == zjVar3) {
                                        objO8 = new d03(os1Var4, 24);
                                        nv0Var4.j0(objO8);
                                    }
                                    vp.g(r51.D0, gv3.x(3, (cs0) objO8, yp1Var, false), gq.N(-426972885, new pt2(7, qf2Var3), nv0Var4), r51.E0, r51.F0, ei1VarU4, nv0Var4, 224262, 388);
                                } else {
                                    nv0Var4.U();
                                }
                                return dm3.a;
                            }
                        }, nv0Var3), nv0Var3, 6);
                        g12.s(R.string.launcher_settings_section_display, 0, nv0Var3);
                        final os1 os1Var5 = os1Var2;
                        final int i9 = i6;
                        final os1 os1Var6 = os1Var;
                        final int i10 = i5;
                        gv3.p(gq.N(-2041899012, new ss0() { // from class: h13
                            @Override // defpackage.ss0
                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                nv0 nv0Var4 = (nv0) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((ry) obj4).getClass();
                                byte b2 = 0;
                                if (nv0Var4.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    long j = wx.f;
                                    ei1 ei1VarU = vr.u(j, nv0Var4);
                                    Object objO5 = nv0Var4.O();
                                    zj zjVar3 = c20.a;
                                    if (objO5 == zjVar3) {
                                        objO5 = new d03(os1Var5, 9);
                                        nv0Var4.j0(objO5);
                                    }
                                    yp1 yp1Var = yp1.a;
                                    vp.g(gq.N(-441896098, new t03(i9, b2, b2), nv0Var4), gv3.x(3, (cs0) objO5, yp1Var, false), r51.G0, r51.H0, r51.I0, ei1VarU, nv0Var4, 224262, 388);
                                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var4, 6, 6);
                                    ei1 ei1VarU2 = vr.u(j, nv0Var4);
                                    Object objO6 = nv0Var4.O();
                                    if (objO6 == zjVar3) {
                                        objO6 = new d03(os1Var6, 10);
                                        nv0Var4.j0(objO6);
                                    }
                                    vp.g(r51.J0, gv3.x(3, (cs0) objO6, yp1Var, false), gq.N(1223130276, new t03(i10, 1, b2), nv0Var4), r51.K0, r51.L0, ei1VarU2, nv0Var4, 224262, 388);
                                } else {
                                    nv0Var4.U();
                                }
                                return dm3.a;
                            }
                        }, nv0Var3), nv0Var3, 6);
                    } else {
                        nv0Var3.U();
                    }
                    return dm3.a;
                }
            };
            i6 = i6;
            i5 = i5;
            nv0Var2 = nv0Var;
            g(strM, "ingame", cs0Var, gq.N(-879062508, ss0Var, nv0Var), nv0Var2, ((i7 << 6) & 896) | 3120);
            int i9 = 14;
            if (((Boolean) os1Var2.getValue()).booleanValue()) {
                nv0Var2.a0(-1534739458);
                boolean z4 = (i8 & 896) == 256;
                Object objO5 = nv0Var2.O();
                if (z4) {
                    zjVar = zjVar2;
                } else {
                    zjVar = zjVar2;
                    if (objO5 != zjVar) {
                        ns0Var9 = ns0Var6;
                        i4 = 1;
                    }
                    ns0 ns0Var10 = (ns0) objO5;
                    objO = nv0Var2.O();
                    if (objO == zjVar) {
                        objO = new d03(os1Var2, i9);
                        nv0Var2.j0(objO);
                    }
                    e(i6, ((i7 >> 18) & 14) | 384, (cs0) objO, ns0Var10, nv0Var2);
                    nv0Var2.p(false);
                }
                ns0Var9 = ns0Var6;
                i4 = 1;
                objO5 = new u03(ns0Var9, os1Var2, i4);
                nv0Var2.j0(objO5);
                ns0 ns0Var102 = (ns0) objO5;
                objO = nv0Var2.O();
                if (objO == zjVar) {
                }
                e(i6, ((i7 >> 18) & 14) | 384, (cs0) objO, ns0Var102, nv0Var2);
                nv0Var2.p(false);
            } else {
                ns0Var9 = ns0Var6;
                zjVar = zjVar2;
                i4 = 1;
                nv0Var2.a0(-1534535726);
                nv0Var2.p(false);
            }
            if (((Boolean) os1Var.getValue()).booleanValue()) {
                nv0Var2.a0(-1534504633);
                Object objO6 = nv0Var2.O();
                if (objO6 == zjVar) {
                    objO6 = new d03(os1Var, 15);
                    nv0Var2.j0(objO6);
                }
                cs0 cs0Var2 = (cs0) objO6;
                int i10 = (i8 & 112) == 32 ? i4 : 0;
                Object objO7 = nv0Var2.O();
                if (i10 != 0 || objO7 == zjVar) {
                    ns0Var8 = ns0Var5;
                    objO7 = new u03(ns0Var8, os1Var, 2);
                    nv0Var2.j0(objO7);
                } else {
                    ns0Var8 = ns0Var5;
                }
                f(i5, ((i7 >> 15) & 14) | 48, cs0Var2, (ns0) objO7, nv0Var2);
                nv0Var2.p(false);
            } else {
                ns0Var8 = ns0Var5;
                nv0Var2.a0(-1534309550);
                nv0Var2.p(false);
            }
            if (((Boolean) os1Var3.getValue()).booleanValue()) {
                nv0Var2.a0(-1534266088);
                if ((i7 & 1879048192) != 536870912) {
                    i4 = 0;
                }
                Object objO8 = nv0Var2.O();
                if (i4 != 0 || objO8 == zjVar) {
                    ns0Var7 = ns0Var3;
                    objO8 = new u03(ns0Var7, os1Var3, 3);
                    nv0Var2.j0(objO8);
                } else {
                    ns0Var7 = ns0Var3;
                }
                ns0 ns0Var11 = (ns0) objO8;
                Object objO9 = nv0Var2.O();
                if (objO9 == zjVar) {
                    objO9 = new d03(os1Var3, 16);
                    nv0Var2.j0(objO9);
                }
                qf2Var2 = qf2Var;
                o(qf2Var2, ns0Var11, (cs0) objO9, nv0Var2, ((i7 >> 9) & 14) | 384);
                nv0Var2.p(false);
            } else {
                qf2Var2 = qf2Var;
                ns0Var7 = ns0Var3;
                nv0Var2.a0(-1533995086);
                nv0Var2.p(false);
            }
        } else {
            qf2Var2 = qf2Var;
            ns0Var7 = ns0Var3;
            nv0Var2 = nv0Var;
            ns0Var8 = ns0Var5;
            ns0Var9 = ns0Var6;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            final qf2 qf2Var3 = qf2Var2;
            xj2VarT.d = new rs0(z, z2, qf2Var3, z3, i5, i6, ns0Var, ns0Var2, ns0Var7, ns0Var4, ns0Var8, ns0Var9, i3) { // from class: b13
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ qf2 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ int k;
                public final /* synthetic */ int l;
                public final /* synthetic */ ns0 m;
                public final /* synthetic */ ns0 n;
                public final /* synthetic */ ns0 o;
                public final /* synthetic */ ns0 p;
                public final /* synthetic */ ns0 q;
                public final /* synthetic */ ns0 r;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    g12.i(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
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
            g(oz2.M(R.string.launcher_settings_notifications_title, nv0Var), "notifications", cs0Var, gq.N(924839451, new ua2(ns0Var3, z3, ns0Var4, z4, cs0Var3), nv0Var), nv0Var2, ((i2 << 6) & 896) | 3120);
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
    */
    public static final void m(final String str, final ns0 ns0Var, final bq1 bq1Var, boolean z, boolean z2, gh3 gh3Var, rs0 rs0Var, rs0 rs0Var2, rs0 rs0Var3, rs0 rs0Var4, rs0 rs0Var5, boolean z3, nr3 nr3Var, o71 o71Var, n71 n71Var, boolean z4, int i, int i2, z13 z13Var, se3 se3Var, nv0 nv0Var, final int i3, final int i4, final int i5) {
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        final rs0 rs0Var6;
        int i9;
        rs0 rs0Var7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        final rs0 rs0Var8;
        final rs0 rs0Var9;
        final rs0 rs0Var10;
        final o71 o71Var2;
        final n71 n71Var2;
        final boolean z7;
        final int i24;
        final int i25;
        final z13 z13Var2;
        final se3 se3Var2;
        final boolean z8;
        final rs0 rs0Var11;
        final boolean z9;
        final gh3 gh3Var2;
        final boolean z10;
        final nr3 nr3Var2;
        xj2 xj2VarT;
        gh3 gh3Var3;
        o71 o71Var3;
        n71 n71Var3;
        boolean z11;
        int i26;
        rs0 rs0Var12;
        rs0 rs0Var13;
        z13 z13Var3;
        rs0 rs0Var14;
        boolean z12;
        nr3 nr3Var3;
        int i27;
        boolean z13;
        rs0 rs0Var15;
        boolean z14;
        se3 se3VarI;
        int i28;
        qr1 qr1Var;
        long j;
        nv0Var.b0(1901501544);
        if ((i3 & 6) == 0) {
            i6 = (nv0Var.f(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        int i29 = i5 & 8;
        if (i29 != 0) {
            i6 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                z5 = z;
                i6 |= nv0Var.g(z5) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    z6 = z2;
                    i6 |= nv0Var.g(z6) ? 16384 : 8192;
                }
                if ((i3 & 196608) == 0) {
                    i6 |= 65536;
                }
                i8 = i5 & 64;
                if (i8 != 0) {
                    i6 |= 1572864;
                    rs0Var6 = rs0Var;
                } else {
                    rs0Var6 = rs0Var;
                    if ((i3 & 1572864) == 0) {
                        i6 |= nv0Var.h(rs0Var6) ? 1048576 : 524288;
                    }
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                    rs0Var7 = rs0Var2;
                } else {
                    rs0Var7 = rs0Var2;
                    if ((i3 & 12582912) == 0) {
                        i6 |= nv0Var.h(rs0Var7) ? 8388608 : 4194304;
                    }
                }
                i10 = i5 & 256;
                int i30 = 33554432;
                if (i10 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i6 |= nv0Var.h(rs0Var3) ? 67108864 : 33554432;
                }
                i11 = i5 & 512;
                if (i11 == 0) {
                    if ((i3 & 805306368) == 0) {
                        i12 = i11;
                        i6 |= nv0Var.h(rs0Var4) ? 536870912 : 268435456;
                    }
                    int i31 = i4 | 54;
                    i13 = i5 & 4096;
                    if (i13 == 0) {
                        i14 = i13;
                        i15 = i4 | 438;
                    } else {
                        i14 = i13;
                        if ((i4 & 384) == 0) {
                            i31 |= nv0Var.h(rs0Var5) ? 256 : 128;
                        }
                        i15 = i31;
                    }
                    i16 = i5 & 8192;
                    if (i16 == 0) {
                        i17 = i15 | 3072;
                    } else {
                        i17 = i15 | (nv0Var.g(z3) ? 2048 : 1024);
                    }
                    i18 = i5 & 16384;
                    if (i18 == 0) {
                        i19 = i17 | 24576;
                    } else {
                        i19 = i17 | (nv0Var.f(nr3Var) ? 16384 : 8192);
                    }
                    i20 = i5 & 32768;
                    if (i20 == 0) {
                        i19 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i19 |= nv0Var.f(o71Var) ? 131072 : 65536;
                    }
                    i21 = i5 & 65536;
                    if (i21 == 0) {
                        i22 = i19 | 1572864;
                    } else {
                        i22 = i19 | (nv0Var.f(n71Var) ? 1048576 : 524288);
                    }
                    i23 = i5 & 131072;
                    if (i23 == 0) {
                        i22 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        i22 |= nv0Var.g(z4) ? 8388608 : 4194304;
                    }
                    if ((i4 & 100663296) == 0) {
                        if ((i5 & 262144) == 0 && nv0Var.d(i)) {
                            i30 = 67108864;
                        }
                        i22 |= i30;
                    }
                    if (nv0Var.R(i6 & 1, ((i6 & 306783379) != 306783378 && ((i22 | 805306368) & 306783379) == 306783378 && ((22 | (((i5 & 4194304) == 0 || !nv0Var.f(se3Var)) ? (char) 128 : (char) 256)) & 147) == 146) ? false : true)) {
                        nv0Var.U();
                        rs0Var8 = rs0Var3;
                        rs0Var9 = rs0Var4;
                        rs0Var10 = rs0Var5;
                        o71Var2 = o71Var;
                        n71Var2 = n71Var;
                        z7 = z4;
                        i24 = i;
                        i25 = i2;
                        z13Var2 = z13Var;
                        se3Var2 = se3Var;
                        z8 = z6;
                        rs0Var11 = rs0Var7;
                        z9 = z5;
                        gh3Var2 = gh3Var;
                        z10 = z3;
                        nr3Var2 = nr3Var;
                    } else {
                        nv0Var.W();
                        if ((i3 & 1) == 0 || nv0Var.A()) {
                            if (i29 != 0) {
                                z5 = true;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            }
                            gh3Var3 = (gh3) nv0Var.j(mg3.a);
                            if (i8 != 0) {
                                rs0Var6 = null;
                            }
                            if (i9 != 0) {
                                rs0Var7 = null;
                            }
                            rs0 rs0Var16 = i10 != 0 ? null : rs0Var3;
                            rs0 rs0Var17 = i12 != 0 ? null : rs0Var4;
                            rs0 rs0Var18 = i14 == 0 ? rs0Var5 : null;
                            boolean z15 = i16 != 0 ? false : z3;
                            nr3 nr3Var4 = i18 != 0 ? m22.B : nr3Var;
                            o71Var3 = i20 != 0 ? o71.c : o71Var;
                            n71Var3 = i21 != 0 ? n71.c : n71Var;
                            z11 = i23 != 0 ? false : z4;
                            i26 = (i5 & 262144) != 0 ? z11 ? 1 : Integer.MAX_VALUE : i;
                            z13 z13VarA = g23.a(rn.v0, nv0Var);
                            if ((i5 & 4194304) != 0) {
                                rs0Var12 = rs0Var18;
                                rs0Var13 = rs0Var16;
                                z13Var3 = z13VarA;
                                rs0Var14 = rs0Var7;
                                z12 = z5;
                                nr3Var3 = nr3Var4;
                                i27 = 1;
                                z13 = z6;
                                rs0Var15 = rs0Var17;
                                z14 = z15;
                                se3VarI = f5.i(6, nv0Var);
                                gh3Var3 = gh3Var3;
                            } else {
                                rs0Var12 = rs0Var18;
                                rs0Var13 = rs0Var16;
                                z13Var3 = z13VarA;
                                rs0Var14 = rs0Var7;
                                z12 = z5;
                                nr3Var3 = nr3Var4;
                                i27 = 1;
                                z13 = z6;
                                rs0Var15 = rs0Var17;
                                z14 = z15;
                                se3VarI = se3Var;
                            }
                        } else {
                            nv0Var.U();
                            gh3Var3 = gh3Var;
                            rs0Var13 = rs0Var3;
                            rs0Var15 = rs0Var4;
                            rs0Var12 = rs0Var5;
                            z14 = z3;
                            nr3Var3 = nr3Var;
                            o71Var3 = o71Var;
                            n71Var3 = n71Var;
                            z11 = z4;
                            i26 = i;
                            i27 = i2;
                            z13Var3 = z13Var;
                            se3VarI = se3Var;
                            rs0Var14 = rs0Var7;
                            z12 = z5;
                            z13 = z6;
                        }
                        nv0Var.q();
                        nv0Var.a0(1310051731);
                        Object objO = nv0Var.O();
                        if (objO == c20.a) {
                            objO = nc2.e(nv0Var);
                        }
                        qr1 qr1Var2 = (qr1) objO;
                        boolean z16 = false;
                        nv0Var.p(false);
                        nv0Var.a0(1981927842);
                        long jB = gh3Var3.b();
                        if (jB != 16) {
                            i28 = i27;
                            qr1Var = qr1Var2;
                        } else {
                            boolean zBooleanValue = ((Boolean) pq.o(qr1Var2, nv0Var, 0).getValue()).booleanValue();
                            if (z12) {
                                i28 = i27;
                                qr1Var = qr1Var2;
                                j = z14 ? se3VarI.d : zBooleanValue ? se3VarI.a : se3VarI.b;
                            } else {
                                i28 = i27;
                                qr1Var = qr1Var2;
                                j = se3VarI.c;
                            }
                            jB = j;
                            z16 = false;
                        }
                        nv0Var.p(z16);
                        int i32 = i28;
                        vr.c(bh3.a.a(se3VarI.k), gq.N(1874034984, new f12(bq1Var, rs0Var6, z14, se3VarI, str, ns0Var, z12, z13, gh3Var3.d(new gh3(jB, 0L, null, 0L, 0L, 0, 0L, 16777214)), o71Var3, n71Var3, z11, i26, i32, nr3Var3, qr1Var, rs0Var14, rs0Var13, rs0Var15, rs0Var12, z13Var3), nv0Var), nv0Var, 56);
                        gh3Var2 = gh3Var3;
                        z9 = z12;
                        z8 = z13;
                        o71Var2 = o71Var3;
                        n71Var2 = n71Var3;
                        z7 = z11;
                        i24 = i26;
                        i25 = i32;
                        nr3Var2 = nr3Var3;
                        rs0Var9 = rs0Var15;
                        rs0Var10 = rs0Var12;
                        z13Var2 = z13Var3;
                        z10 = z14;
                        se3Var2 = se3VarI;
                        rs0Var11 = rs0Var14;
                        rs0Var8 = rs0Var13;
                    }
                    xj2VarT = nv0Var.t();
                    if (xj2VarT == null) {
                        xj2VarT.d = new rs0() { // from class: c12
                            @Override // defpackage.rs0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iY = jo3.y(i3 | 1);
                                int iY2 = jo3.y(i4);
                                g12.m(str, ns0Var, bq1Var, z9, z8, gh3Var2, rs0Var6, rs0Var11, rs0Var8, rs0Var9, rs0Var10, z10, nr3Var2, o71Var2, n71Var2, z7, i24, i25, z13Var2, se3Var2, (nv0) obj, iY, iY2, i5);
                                return dm3.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i6 |= 805306368;
                i12 = i11;
                int i312 = i4 | 54;
                i13 = i5 & 4096;
                if (i13 == 0) {
                }
                i16 = i5 & 8192;
                if (i16 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 == 0) {
                }
                i20 = i5 & 32768;
                if (i20 == 0) {
                }
                i21 = i5 & 65536;
                if (i21 == 0) {
                }
                i23 = i5 & 131072;
                if (i23 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if (nv0Var.R(i6 & 1, ((i6 & 306783379) != 306783378 && ((i22 | 805306368) & 306783379) == 306783378 && ((22 | (((i5 & 4194304) == 0 || !nv0Var.f(se3Var)) ? (char) 128 : (char) 256)) & 147) == 146) ? false : true)) {
                }
                xj2VarT = nv0Var.t();
                if (xj2VarT == null) {
                }
            }
            z6 = z2;
            if ((i3 & 196608) == 0) {
            }
            i8 = i5 & 64;
            if (i8 != 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            i10 = i5 & 256;
            int i302 = 33554432;
            if (i10 != 0) {
            }
            i11 = i5 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            int i3122 = i4 | 54;
            i13 = i5 & 4096;
            if (i13 == 0) {
            }
            i16 = i5 & 8192;
            if (i16 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 == 0) {
            }
            i20 = i5 & 32768;
            if (i20 == 0) {
            }
            i21 = i5 & 65536;
            if (i21 == 0) {
            }
            i23 = i5 & 131072;
            if (i23 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if (nv0Var.R(i6 & 1, ((i6 & 306783379) != 306783378 && ((i22 | 805306368) & 306783379) == 306783378 && ((22 | (((i5 & 4194304) == 0 || !nv0Var.f(se3Var)) ? (char) 128 : (char) 256)) & 147) == 146) ? false : true)) {
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
            }
        }
        z5 = z;
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        z6 = z2;
        if ((i3 & 196608) == 0) {
        }
        i8 = i5 & 64;
        if (i8 != 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        i10 = i5 & 256;
        int i3022 = 33554432;
        if (i10 != 0) {
        }
        i11 = i5 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        int i31222 = i4 | 54;
        i13 = i5 & 4096;
        if (i13 == 0) {
        }
        i16 = i5 & 8192;
        if (i16 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 == 0) {
        }
        i20 = i5 & 32768;
        if (i20 == 0) {
        }
        i21 = i5 & 65536;
        if (i21 == 0) {
        }
        i23 = i5 & 131072;
        if (i23 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if (nv0Var.R(i6 & 1, ((i6 & 306783379) != 306783378 && ((i22 | 805306368) & 306783379) == 306783378 && ((22 | (((i5 & 4194304) == 0 || !nv0Var.f(se3Var)) ? (char) 128 : (char) 256)) & 147) == 146) ? false : true)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
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
    */
    public static final void n(final rs0 rs0Var, ss0 ss0Var, rs0 rs0Var2, final rs0 rs0Var3, final rs0 rs0Var4, rs0 rs0Var5, final rs0 rs0Var6, final boolean z, final ef3 ef3Var, final bf3 bf3Var, final ns0 ns0Var, final d00 d00Var, rs0 rs0Var7, x12 x12Var, nv0 nv0Var, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        rs0 rs0Var8;
        ss0 ss0Var2;
        rs0 rs0Var9;
        final rs0 rs0Var10;
        nv0 nv0Var2;
        int i5;
        vm vmVar;
        zj zjVar;
        vm vmVar2;
        yp1 yp1Var;
        float f;
        nv0 nv0Var3;
        vm vmVar3;
        bb1 bb1Var;
        boolean z3;
        float f2;
        rs0 rs0Var11;
        vm vmVar4;
        rs0 rs0Var12;
        ss0 ss0Var3;
        int iC;
        rs0 rs0Var13;
        rs0 rs0Var14;
        boolean z4;
        Object obj;
        boolean z5;
        Object objO;
        int i6;
        int iC2;
        rs0 rs0Var15 = rs0Var5;
        x12 x12Var2 = x12Var;
        vm vmVar5 = f5.k;
        vm vmVar6 = f5.g;
        nv0Var.b0(753699262);
        int i7 = i & 6;
        yp1 yp1Var2 = yp1.a;
        if (i7 == 0) {
            i3 = i | (nv0Var.f(yp1Var2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var.h(ss0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= nv0Var.h(rs0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var.h(rs0Var3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= nv0Var.h(rs0Var4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= nv0Var.h(rs0Var15) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= nv0Var.h(rs0Var6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            z2 = z;
            i3 |= nv0Var.g(z2) ? 67108864 : 33554432;
        } else {
            z2 = z;
        }
        if ((i & 805306368) == 0) {
            i3 |= nv0Var.f(ef3Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? nv0Var.f(bf3Var) : nv0Var.h(bf3Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= nv0Var.h(d00Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= nv0Var.h(rs0Var7) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= nv0Var.f(x12Var2) ? 16384 : 8192;
        }
        int i8 = i4;
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            float f3 = ((jd0) nv0Var.j(w41.c)).f;
            if (Float.isNaN(f3)) {
                f3 = 0.0f;
            }
            float f4 = (f3 - cl3.t0) / 2.0f;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            int i9 = i8 & 14;
            boolean zC = ((i3 & 234881024) == 67108864) | ((i8 & 112) == 32) | ((i3 & 1879048192) == 536870912) | (i9 == 4 || ((i8 & 8) != 0 && nv0Var.f(bf3Var))) | ((i8 & 57344) == 16384) | nv0Var.c(f4);
            Object objO2 = nv0Var.O();
            zj zjVar2 = c20.a;
            if (zC || objO2 == zjVar2) {
                i5 = i9;
                vmVar = vmVar5;
                zjVar = zjVar2;
                boolean z6 = z2;
                vmVar2 = vmVar6;
                yp1Var = yp1Var2;
                nv0 nv0Var4 = nv0Var;
                f = f4;
                j12 j12Var = new j12(ns0Var, z6, ef3Var, bf3Var, x12Var2, f);
                nv0Var4.j0(j12Var);
                objO2 = j12Var;
                nv0Var3 = nv0Var4;
            } else {
                i5 = i9;
                vmVar = vmVar5;
                zjVar = zjVar2;
                nv0Var3 = nv0Var;
                f = f4;
                vmVar2 = vmVar6;
                yp1Var = yp1Var2;
            }
            j12 j12Var2 = (j12) objO2;
            bb1 bb1Var2 = (bb1) nv0Var3.j(s20.n);
            int iC3 = lq.C(nv0Var3);
            n52 n52VarL = nv0Var3.l();
            bq1 bq1VarM = lr.M(nv0Var3, yp1Var);
            w10.c.getClass();
            nv0Var3.d0();
            float f5 = f;
            boolean z7 = nv0Var3.S;
            x91 x91Var = tb1.Y;
            if (z7) {
                nv0Var3.k(x91Var);
            } else {
                nv0Var3.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var3, j12Var2);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var3, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var3.S) {
                vmVar3 = vmVar2;
            } else {
                vmVar3 = vmVar2;
                if (!s51.n(nv0Var3.O(), Integer.valueOf(iC3))) {
                }
                z00 z00Var4 = f5.C;
                y02.F(z00Var4, nv0Var3, bq1VarM);
                d00Var.f(nv0Var3, Integer.valueOf((i8 >> 6) & 14));
                ep1 ep1Var = ep1.a;
                if (rs0Var3 == null) {
                    nv0Var3.a0(2145628269);
                    bq1 bq1VarD = r51.u(yp1Var, "Leading").d(ep1Var);
                    cn1 cn1VarD = eo.d(vmVar, false);
                    int iC4 = lq.C(nv0Var3);
                    bb1Var = bb1Var2;
                    n52 n52VarL2 = nv0Var3.l();
                    bq1 bq1VarM2 = lr.M(nv0Var3, bq1VarD);
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(z00Var, nv0Var3, cn1VarD);
                    y02.F(z00Var2, nv0Var3, n52VarL2);
                    if (nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC4))) {
                        nc2.q(iC4, nv0Var3, iC4, z00Var3);
                    }
                    y02.F(z00Var4, nv0Var3, bq1VarM2);
                    rs0Var3.f(nv0Var3, Integer.valueOf((i3 >> 12) & 14));
                    nv0Var3.p(true);
                    z3 = false;
                    nv0Var3.p(false);
                } else {
                    bb1Var = bb1Var2;
                    z3 = false;
                    nv0Var3.a0(2145874285);
                    nv0Var3.p(false);
                }
                if (rs0Var4 == null) {
                    nv0Var3.a0(2145917003);
                    bq1 bq1VarD2 = r51.u(yp1Var, "Trailing").d(ep1Var);
                    cn1 cn1VarD2 = eo.d(vmVar, z3);
                    int iC5 = lq.C(nv0Var3);
                    n52 n52VarL3 = nv0Var3.l();
                    bq1 bq1VarM3 = lr.M(nv0Var3, bq1VarD2);
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(z00Var, nv0Var3, cn1VarD2);
                    y02.F(z00Var2, nv0Var3, n52VarL3);
                    if (nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC5))) {
                        nc2.q(iC5, nv0Var3, iC5, z00Var3);
                    }
                    y02.F(z00Var4, nv0Var3, bq1VarM3);
                    rs0Var4.f(nv0Var3, Integer.valueOf((i3 >> 15) & 14));
                    nv0Var3.p(true);
                    nv0Var3.p(false);
                } else {
                    nv0Var3.a0(2146164941);
                    nv0Var3.p(z3);
                }
                x12Var2 = x12Var;
                bb1 bb1Var3 = bb1Var;
                float fX = f80.x(x12Var2, bb1Var3);
                float fW = f80.w(x12Var2, bb1Var3);
                if (rs0Var3 != null) {
                    fX -= f5;
                    if (fX < 0.0f) {
                        fX = 0.0f;
                    }
                }
                float f6 = fX;
                if (rs0Var4 == null) {
                    float f7 = fW - f5;
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    }
                    f2 = f7;
                } else {
                    f2 = fW;
                }
                if (rs0Var5 == null) {
                    nv0Var3.a0(2146868920);
                    bq1 bq1VarN = f80.N(j43.r(j43.g(r51.u(yp1Var, "Prefix"), 24.0f, 0.0f, 2)), f6, 0.0f, 2.0f, 0.0f, 10);
                    vmVar4 = vmVar3;
                    cn1 cn1VarD3 = eo.d(vmVar4, false);
                    int iC6 = lq.C(nv0Var3);
                    n52 n52VarL4 = nv0Var3.l();
                    bq1 bq1VarM4 = lr.M(nv0Var3, bq1VarN);
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(z00Var, nv0Var3, cn1VarD3);
                    y02.F(z00Var2, nv0Var3, n52VarL4);
                    if (nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC6))) {
                        nc2.q(iC6, nv0Var3, iC6, z00Var3);
                    }
                    y02.F(z00Var4, nv0Var3, bq1VarM4);
                    rs0 rs0Var16 = rs0Var5;
                    rs0Var16.f(nv0Var3, Integer.valueOf((i3 >> 18) & 14));
                    nv0Var3.p(true);
                    nv0Var3.p(false);
                    rs0Var11 = rs0Var16;
                } else {
                    rs0Var11 = rs0Var5;
                    vmVar4 = vmVar3;
                    nv0Var3.a0(2147196621);
                    nv0Var3.p(false);
                }
                if (rs0Var6 == null) {
                    nv0Var3.a0(2147239866);
                    bq1 bq1VarN2 = f80.N(j43.r(j43.g(r51.u(yp1Var, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f2, 0.0f, 10);
                    cn1 cn1VarD4 = eo.d(vmVar4, false);
                    int iC7 = lq.C(nv0Var3);
                    n52 n52VarL5 = nv0Var3.l();
                    bq1 bq1VarM5 = lr.M(nv0Var3, bq1VarN2);
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(z00Var, nv0Var3, cn1VarD4);
                    y02.F(z00Var2, nv0Var3, n52VarL5);
                    if (nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC7))) {
                        nc2.q(iC7, nv0Var3, iC7, z00Var3);
                    }
                    y02.F(z00Var4, nv0Var3, bq1VarM5);
                    rs0 rs0Var17 = rs0Var6;
                    rs0Var17.f(nv0Var3, Integer.valueOf((i3 >> 21) & 14));
                    nv0Var3.p(true);
                    nv0Var3.p(false);
                    rs0Var12 = rs0Var17;
                } else {
                    rs0Var12 = rs0Var6;
                    nv0Var3.a0(-2147401651);
                    nv0Var3.p(false);
                }
                bq1 bq1VarN3 = f80.N(j43.r(j43.g(yp1Var, 24.0f, 0.0f, 2)), rs0Var11 != null ? f6 : 0.0f, 0.0f, rs0Var12 != null ? f2 : 0.0f, 0.0f, 10);
                if (ss0Var == null) {
                    nv0Var3.a0(-2147031666);
                    ss0 ss0Var4 = ss0Var;
                    ss0Var4.e(r51.u(yp1Var, "Hint").d(bq1VarN3), nv0Var3, Integer.valueOf((i3 >> 3) & 112));
                    nv0Var3.p(false);
                    ss0Var3 = ss0Var4;
                } else {
                    ss0Var3 = ss0Var;
                    nv0Var3.a0(-2146940371);
                    nv0Var3.p(false);
                }
                bq1 bq1VarD3 = r51.u(yp1Var, "TextField").d(bq1VarN3);
                cn1 cn1VarD5 = eo.d(vmVar4, true);
                iC = lq.C(nv0Var3);
                n52 n52VarL6 = nv0Var3.l();
                bq1 bq1VarM6 = lr.M(nv0Var3, bq1VarD3);
                nv0Var3.d0();
                if (nv0Var3.S) {
                    nv0Var3.m0();
                } else {
                    nv0Var3.k(x91Var);
                }
                y02.F(z00Var, nv0Var3, cn1VarD5);
                y02.F(z00Var2, nv0Var3, n52VarL6);
                if (!nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC))) {
                    nc2.q(iC, nv0Var3, iC, z00Var3);
                }
                y02.F(z00Var4, nv0Var3, bq1VarM6);
                rs0Var.f(nv0Var3, Integer.valueOf((i3 >> 3) & 14));
                nv0Var3.p(true);
                if (rs0Var2 == null) {
                    nv0Var3.a0(-2146287790);
                    if (i5 != 4) {
                        if ((i8 & 8) != 0) {
                            obj = bf3Var;
                            if (nv0Var3.h(obj)) {
                            }
                            objO = nv0Var3.O();
                            i6 = 5;
                            if (z5 || objO == zjVar) {
                                objO = new it1(i6, obj);
                                nv0Var3.j0(objO);
                            }
                            bq1 bq1VarD4 = r51.u(j43.r(vm1.C(yp1Var, new vw((cs0) objO, i6))), "Label").d(yp1Var);
                            cn1 cn1VarD6 = eo.d(vmVar4, false);
                            iC2 = lq.C(nv0Var3);
                            n52 n52VarL7 = nv0Var3.l();
                            bq1 bq1VarM7 = lr.M(nv0Var3, bq1VarD4);
                            nv0Var3.d0();
                            if (nv0Var3.S) {
                                nv0Var3.m0();
                            } else {
                                nv0Var3.k(x91Var);
                            }
                            y02.F(z00Var, nv0Var3, cn1VarD6);
                            y02.F(z00Var2, nv0Var3, n52VarL7);
                            if (!nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC2))) {
                                nc2.q(iC2, nv0Var3, iC2, z00Var3);
                            }
                            y02.F(z00Var4, nv0Var3, bq1VarM7);
                            rs0 rs0Var18 = rs0Var2;
                            rs0Var18.f(nv0Var3, Integer.valueOf((i3 >> 9) & 14));
                            nv0Var3.p(true);
                            nv0Var3.p(false);
                            rs0Var13 = rs0Var18;
                        } else {
                            obj = bf3Var;
                        }
                        z5 = false;
                        objO = nv0Var3.O();
                        i6 = 5;
                        if (z5) {
                            objO = new it1(i6, obj);
                            nv0Var3.j0(objO);
                            bq1 bq1VarD42 = r51.u(j43.r(vm1.C(yp1Var, new vw((cs0) objO, i6))), "Label").d(yp1Var);
                            cn1 cn1VarD62 = eo.d(vmVar4, false);
                            iC2 = lq.C(nv0Var3);
                            n52 n52VarL72 = nv0Var3.l();
                            bq1 bq1VarM72 = lr.M(nv0Var3, bq1VarD42);
                            nv0Var3.d0();
                            if (nv0Var3.S) {
                            }
                            y02.F(z00Var, nv0Var3, cn1VarD62);
                            y02.F(z00Var2, nv0Var3, n52VarL72);
                            if (!nv0Var3.S) {
                                nc2.q(iC2, nv0Var3, iC2, z00Var3);
                                y02.F(z00Var4, nv0Var3, bq1VarM72);
                                rs0 rs0Var182 = rs0Var2;
                                rs0Var182.f(nv0Var3, Integer.valueOf((i3 >> 9) & 14));
                                nv0Var3.p(true);
                                nv0Var3.p(false);
                                rs0Var13 = rs0Var182;
                            }
                        }
                    } else {
                        obj = bf3Var;
                    }
                    z5 = true;
                    objO = nv0Var3.O();
                    i6 = 5;
                    if (z5) {
                    }
                } else {
                    rs0Var13 = rs0Var2;
                    nv0Var3.a0(-2145892819);
                    nv0Var3.p(false);
                }
                if (rs0Var7 == null) {
                    nv0Var3.a0(-2145844304);
                    bq1 bq1VarI = f80.I(j43.r(j43.g(r51.u(yp1Var, "Supporting"), 16.0f, 0.0f, 2)), new b22(16.0f, 4.0f, 16.0f, 0.0f));
                    cn1 cn1VarD7 = eo.d(vmVar4, false);
                    int iC8 = lq.C(nv0Var3);
                    n52 n52VarL8 = nv0Var3.l();
                    bq1 bq1VarM8 = lr.M(nv0Var3, bq1VarI);
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(x91Var);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(z00Var, nv0Var3, cn1VarD7);
                    y02.F(z00Var2, nv0Var3, n52VarL8);
                    if (nv0Var3.S || !s51.n(nv0Var3.O(), Integer.valueOf(iC8))) {
                        nc2.q(iC8, nv0Var3, iC8, z00Var3);
                    }
                    y02.F(z00Var4, nv0Var3, bq1VarM8);
                    rs0 rs0Var19 = rs0Var7;
                    rs0Var19.f(nv0Var3, Integer.valueOf((i8 >> 9) & 14));
                    z4 = true;
                    nv0Var3.p(true);
                    nv0Var3.p(false);
                    rs0Var14 = rs0Var19;
                } else {
                    rs0Var14 = rs0Var7;
                    z4 = true;
                    nv0Var3.a0(-2145508915);
                    nv0Var3.p(false);
                }
                nv0Var3.p(z4);
                rs0Var8 = rs0Var14;
                nv0Var2 = nv0Var3;
                rs0Var9 = rs0Var13;
                rs0Var10 = rs0Var11;
                ss0Var2 = ss0Var3;
            }
            nc2.q(iC3, nv0Var3, iC3, z00Var3);
            z00 z00Var42 = f5.C;
            y02.F(z00Var42, nv0Var3, bq1VarM);
            d00Var.f(nv0Var3, Integer.valueOf((i8 >> 6) & 14));
            ep1 ep1Var2 = ep1.a;
            if (rs0Var3 == null) {
            }
            if (rs0Var4 == null) {
            }
            x12Var2 = x12Var;
            bb1 bb1Var32 = bb1Var;
            float fX2 = f80.x(x12Var2, bb1Var32);
            float fW2 = f80.w(x12Var2, bb1Var32);
            if (rs0Var3 != null) {
            }
            float f62 = fX2;
            if (rs0Var4 == null) {
            }
            if (rs0Var5 == null) {
            }
            if (rs0Var6 == null) {
            }
            bq1 bq1VarN32 = f80.N(j43.r(j43.g(yp1Var, 24.0f, 0.0f, 2)), rs0Var11 != null ? f62 : 0.0f, 0.0f, rs0Var12 != null ? f2 : 0.0f, 0.0f, 10);
            if (ss0Var == null) {
            }
            bq1 bq1VarD32 = r51.u(yp1Var, "TextField").d(bq1VarN32);
            cn1 cn1VarD52 = eo.d(vmVar4, true);
            iC = lq.C(nv0Var3);
            n52 n52VarL62 = nv0Var3.l();
            bq1 bq1VarM62 = lr.M(nv0Var3, bq1VarD32);
            nv0Var3.d0();
            if (nv0Var3.S) {
            }
            y02.F(z00Var, nv0Var3, cn1VarD52);
            y02.F(z00Var2, nv0Var3, n52VarL62);
            if (!nv0Var3.S) {
                nc2.q(iC, nv0Var3, iC, z00Var3);
                y02.F(z00Var42, nv0Var3, bq1VarM62);
                rs0Var.f(nv0Var3, Integer.valueOf((i3 >> 3) & 14));
                nv0Var3.p(true);
                if (rs0Var2 == null) {
                }
                if (rs0Var7 == null) {
                }
                nv0Var3.p(z4);
                rs0Var8 = rs0Var14;
                nv0Var2 = nv0Var3;
                rs0Var9 = rs0Var13;
                rs0Var10 = rs0Var11;
                ss0Var2 = ss0Var3;
            }
        } else {
            rs0Var8 = rs0Var7;
            ss0Var2 = ss0Var;
            rs0Var9 = rs0Var2;
            nv0 nv0Var5 = nv0Var;
            nv0Var5.U();
            nv0Var2 = nv0Var5;
            rs0Var10 = rs0Var15;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            final rs0 rs0Var20 = rs0Var9;
            final x12 x12Var3 = x12Var2;
            final ss0 ss0Var5 = ss0Var2;
            final rs0 rs0Var21 = rs0Var8;
            xj2VarT.d = new rs0() { // from class: d12
                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(i | 1);
                    int iY2 = jo3.y(i2);
                    g12.n(rs0Var, ss0Var5, rs0Var20, rs0Var3, rs0Var4, rs0Var10, rs0Var6, z, ef3Var, bf3Var, ns0Var, d00Var, rs0Var21, x12Var3, (nv0) obj2, iY, iY2);
                    return dm3.a;
                }
            };
        }
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
    */
    public static final vu2 p(tb1 tb1Var, boolean z) {
        aq1 aq1Var = tb1Var.L.f;
        ia0 ia0Var = null;
        if ((aq1Var.i & 8) != 0) {
            loop0: while (true) {
                if (aq1Var == null) {
                    break;
                }
                if ((aq1Var.h & 8) != 0) {
                    aq1 aq1VarJ = aq1Var;
                    qs1 qs1Var = null;
                    while (aq1VarJ != null) {
                        if (aq1VarJ instanceof tu2) {
                            ia0Var = aq1VarJ;
                            break loop0;
                        }
                        if ((aq1VarJ.h & 8) != 0 && (aq1VarJ instanceof ja0)) {
                            int i = 0;
                            for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                if ((aq1Var2.h & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        aq1VarJ = aq1Var2;
                                    } else {
                                        if (qs1Var == null) {
                                            qs1Var = new qs1(new aq1[16]);
                                        }
                                        if (aq1VarJ != null) {
                                            qs1Var.b(aq1VarJ);
                                            aq1VarJ = null;
                                        }
                                        qs1Var.b(aq1Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        aq1VarJ = vr.j(qs1Var);
                    }
                    if ((aq1Var.i & 8) != 0) {
                        break;
                    }
                    aq1Var = aq1Var.k;
                } else if ((aq1Var.i & 8) != 0) {
                }
            }
        }
        ia0Var.getClass();
        aq1 aq1Var3 = ((aq1) ((tu2) ia0Var)).f;
        qu2 qu2VarW = tb1Var.w();
        if (qu2VarW == null) {
            qu2VarW = new qu2();
        }
        return new vu2(aq1Var3, z, tb1Var, qu2VarW);
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
            gv3.i(oz2.M(R.string.launcher_tab_settings, nv0Var), gq.N(-333831315, new y03(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, 0), nv0Var), nv0Var, 48);
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
    */
    public static final Object x(cs2 cs2Var, float f, pe peVar, h80 h80Var, ns0 ns0Var, q40 q40Var) {
        q63 q63Var;
        float f2;
        nk2 nk2Var;
        if (q40Var instanceof q63) {
            q63Var = (q63) q40Var;
            int i = q63Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                q63Var.m = i - Integer.MIN_VALUE;
            } else {
                q63Var = new q63(q40Var);
            }
        }
        Object obj = q63Var.l;
        int i2 = q63Var.m;
        if (i2 == 0) {
            y02.Q(obj);
            nk2 nk2Var2 = new nk2();
            boolean z = ((Number) peVar.a()).floatValue() == 0.0f;
            p63 p63Var = new p63(f, nk2Var2, cs2Var, ns0Var, 0);
            q63Var.j = peVar;
            q63Var.k = nk2Var2;
            q63Var.i = f;
            q63Var.m = 1;
            Object objN = t22.n(peVar, h80Var, !z, p63Var, q63Var);
            y50 y50Var = y50.f;
            if (objN == y50Var) {
                return y50Var;
            }
            f2 = f;
            nk2Var = nk2Var2;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = q63Var.i;
            nk2Var = q63Var.k;
            peVar = q63Var.j;
            y02.Q(obj);
        }
        return new le(new Float(f2 - nk2Var.f), peVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(cs2 cs2Var, float f, float f2, pe peVar, s83 s83Var, ns0 ns0Var, q40 q40Var) {
        r63 r63Var;
        float fFloatValue;
        pe peVar2;
        nk2 nk2Var;
        float f3 = f;
        if (q40Var instanceof r63) {
            r63Var = (r63) q40Var;
            int i = r63Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                r63Var.n = i - Integer.MIN_VALUE;
            } else {
                r63Var = new r63(q40Var);
            }
        }
        r63 r63Var2 = r63Var;
        Object obj = r63Var2.m;
        int i2 = r63Var2.n;
        if (i2 == 0) {
            y02.Q(obj);
            nk2 nk2Var2 = new nk2();
            fFloatValue = ((Number) peVar.a()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) peVar.a()).floatValue() == 0.0f;
            p63 p63Var = new p63(f2, nk2Var2, cs2Var, ns0Var, 1);
            r63Var2.k = peVar;
            r63Var2.l = nk2Var2;
            r63Var2.i = f3;
            r63Var2.j = fFloatValue;
            r63Var2.n = 1;
            Object objO = t22.o(peVar, f4, s83Var, !z, p63Var, r63Var2);
            y50 y50Var = y50.f;
            if (objO == y50Var) {
                return y50Var;
            }
            peVar2 = peVar;
            nk2Var = nk2Var2;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = r63Var2.j;
            float f6 = r63Var2.i;
            nk2Var = r63Var2.l;
            peVar2 = r63Var2.k;
            y02.Q(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new le(new Float(f3 - nk2Var.f), cl3.k(peVar2, 0.0f, E(((Number) peVar2.a()).floatValue(), fFloatValue), 29));
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
