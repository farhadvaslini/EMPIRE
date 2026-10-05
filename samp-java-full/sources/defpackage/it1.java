package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextPaint;
import android.view.inputmethod.BaseInputConnection;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class it1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ it1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() throws PendingIntent.CanceledException {
        cs0 cs0Var;
        char c;
        boolean z;
        long j;
        long j2;
        long j3 = -9187201950435737472L;
        char c2 = 7;
        boolean z2 = true;
        boolean z3 = false;
        switch (this.f) {
            case 0:
                nt1 nt1Var = (nt1) this.g;
                TextPaint textPaint = nt1Var.j;
                textPaint.setTypeface(nt1Var.i);
                textPaint.setTextSize(100.0f);
                Rect rect = new Rect();
                textPaint.getTextBounds("中", 0, 1, rect);
                float fHeight = rect.height();
                return Float.valueOf(fHeight >= 1.0f ? fHeight : 1.0f);
            case 1:
                return new cu1((String) this.g);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((gw1) this.g).d;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((kw1) this.g).p1();
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new vy1((xy1) this.g);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new jd0(lq.N(24.0f, 16.0f, ((bf3) this.g).a()));
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.valueOf(rb2.m((rb2) this.g));
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                File file = (File) ((me1) this.g).a();
                String name = file.getName();
                name.getClass();
                if (!y93.D0(name, '.', "").equals("preferences_pb")) {
                    qn1.f(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 8:
                return Float.valueOf(((ym0) this.g).a() < 1.0f ? 0.3f : 1.0f);
            case vr.g /* 9 */:
                lk2 lk2Var = (lk2) this.g;
                lk2Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    lk2Var.a();
                    Trace.endSection();
                    return dm3.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case vr.h /* 10 */:
                vk0 vk0Var = (vk0) this.g;
                return Float.valueOf(vk0Var.a / vk0Var.b);
            case 11:
                cq2 cq2Var = (cq2) this.g;
                zq2 zq2Var = cq2Var.f;
                Object obj = cq2Var.i;
                if (obj != null) {
                    return zq2Var.i(cq2Var, obj);
                }
                c.p("Value should be initialized");
                return null;
            case vr.i /* 12 */:
                uq2 uq2Var = ((jq2) this.g).h;
                if (uq2Var == null) {
                    return null;
                }
                Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                uq2Var.b(bundleU);
                if (bundleU.isEmpty()) {
                    return null;
                }
                return bundleU;
            case 13:
                return f80.E((cr3) this.g);
            case 14:
                wq2 wq2Var = (wq2) this.g;
                wq2Var.getLifecycle().a(new ik2(0, wq2Var));
                return dm3.a;
            case jo3.g /* 15 */:
                gs2 gs2Var = (gs2) this.g;
                x8 x8Var = (x8) ur.z(gs2Var, m12.a);
                gs2Var.F = x8Var;
                gs2Var.G = x8Var != null ? new w8(x8Var.a, x8Var.b, x8Var.c, x8Var.d) : null;
                return dm3.a;
            case 16:
                it2 it2Var = (it2) this.g;
                gk3 gk3Var = it2Var.e;
                it2Var.f = gk3Var != null ? ((Number) gk3Var.m.getValue()).longValue() : 0L;
                return dm3.a;
            case 17:
                return this.g;
            case 18:
                ((sz2) this.g).c();
                return dm3.a;
            case 19:
                return Float.valueOf(((x82) ((d92) this.g)).c);
            case 20:
                p13 p13Var = (p13) this.g;
                d42 d42Var = p13Var.h;
                if (((h43) d42Var.getValue()).a == 9205357640488583168L || h43.c(((h43) d42Var.getValue()).a)) {
                    return null;
                }
                return p13Var.f.b(((h43) d42Var.getValue()).a);
            case 21:
                return ((s33) this.g).b;
            case 22:
                h53 h53Var = (h53) this.g;
                if (!((Boolean) h53Var.s.getValue()).booleanValue() && (cs0Var = h53Var.g) != null) {
                    cs0Var.a();
                }
                return dm3.a;
            case 23:
                jr jrVar = ((z53) this.g).b;
                if (jrVar.r() instanceof qx1) {
                    jrVar.t(j63.f);
                }
                return Boolean.TRUE;
            case 24:
                long j4 = 128;
                p73 p73Var = (p73) this.g;
                while (true) {
                    synchronized (p73Var.g) {
                        try {
                            if (p73Var.c) {
                                c = c2;
                            } else {
                                p73Var.c = z2;
                                try {
                                    qs1 qs1Var = p73Var.f;
                                    Object[] objArr = qs1Var.f;
                                    int i = qs1Var.h;
                                    for (?? r4 = z3; r4 < i; r4++) {
                                        try {
                                            o73 o73Var = (o73) objArr[r4];
                                            js1 js1Var = o73Var.g;
                                            ns0 ns0Var = o73Var.a;
                                            Object[] objArr2 = js1Var.b;
                                            long[] jArr = js1Var.a;
                                            int length = jArr.length - 2;
                                            char c3 = c2;
                                            if (length >= 0) {
                                                ?? r14 = z3;
                                                while (true) {
                                                    long j5 = jArr[r14];
                                                    int i2 = length;
                                                    if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i3 = 8 - ((~(r14 - i2)) >>> 31);
                                                        int i4 = 0;
                                                        while (i4 < i3) {
                                                            if ((j5 & 255) < j4) {
                                                                ns0Var.h(objArr2[(r14 << 3) + i4]);
                                                            }
                                                            j5 >>= 8;
                                                            i4++;
                                                            j4 = 128;
                                                        }
                                                        if (i3 == 8) {
                                                            length = i2;
                                                            if (r14 != length) {
                                                                j4 = 128;
                                                                r14++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            js1Var.b();
                                            c2 = c3;
                                            z3 = false;
                                            j4 = 128;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z = false;
                                            p73Var.c = z;
                                            throw th;
                                        }
                                    }
                                    c = c2;
                                    p73Var.c = z3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = z3;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (!p73Var.c()) {
                        return dm3.a;
                    }
                    c2 = c;
                    z2 = true;
                    z3 = false;
                    j4 = 128;
                }
                break;
            case 25:
                hc1 hc1VarA = ((ra3) this.g).a();
                tb1 tb1Var = hc1VarA.f;
                if (hc1VarA.s != ((qs1) ((yr1) tb1Var.o()).g).h) {
                    is1 is1Var = hc1VarA.k;
                    Object[] objArr3 = is1Var.c;
                    long[] jArr2 = is1Var.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j6 = jArr2[i5];
                            if ((((~j6) << 7) & j6 & j3) != j3) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((j6 & 255) < 128) {
                                        j2 = j3;
                                        ((zb1) objArr3[(i5 << 3) + i7]).d = true;
                                    } else {
                                        j2 = j3;
                                    }
                                    j6 >>= 8;
                                    i7++;
                                    j3 = j2;
                                }
                                j = j3;
                                if (i6 == 8) {
                                }
                            } else {
                                j = j3;
                            }
                            if (i5 != length2) {
                                i5++;
                                j3 = j;
                            }
                        }
                    }
                    if (tb1Var.n != null) {
                        if (!tb1Var.M.e) {
                            tb1.W(tb1Var, false, 7);
                        }
                    } else if (!tb1Var.q()) {
                        tb1.Y(tb1Var, false, 7);
                    }
                }
                return dm3.a;
            case 26:
                rd3 rd3Var = (rd3) this.g;
                rd3Var.H = null;
                y02.w(rd3Var);
                lq.J(rd3Var);
                vr.J(rd3Var);
                return Boolean.TRUE;
            case 27:
                jo3.w(((RemoteAction) this.g).getActionIntent());
                return dm3.a;
            case 28:
                me3 me3Var = (me3) this.g;
                return me3Var.s ? t22.r(me3Var) : xd3.b;
            default:
                return new BaseInputConnection(((ig3) this.g).a, false);
        }
    }
}
