package defpackage;

import android.app.ActivityOptions;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jo3 {
    public static w01 b = null;
    public static final int c = 9;
    public static final int d = 6;
    public static final int e = 10;
    public static final int f = 5;
    public static final int g = 15;
    public static final int h = 48;
    public final /* synthetic */ int a;

    public /* synthetic */ jo3(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r18, int r19, defpackage.w8 r20, defpackage.um r21, defpackage.d00 r22, defpackage.nv0 r23, defpackage.bq1 r24, defpackage.dw1 r25, defpackage.x12 r26, defpackage.m22 r27, defpackage.m22 r28, defpackage.i32 r29, defpackage.o63 r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo3.a(int, int, w8, um, d00, nv0, bq1, dw1, x12, m22, m22, i32, o63, boolean):void");
    }

    public static final void b(long j, gh3 gh3Var, rs0 rs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-684938728);
        if ((i & 6) == 0) {
            i2 = (nv0Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(gh3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(rs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            t20 t20Var = mg3.a;
            vr.d(new he2[]{nc2.f(j, t30.a), t20Var.a(((gh3) nv0Var.j(t20Var)).d(gh3Var))}, rs0Var, nv0Var, ((i2 >> 3) & 112) | 8);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ge2(j, gh3Var, rs0Var, i, 0);
        }
    }

    public static final void c(y33 y33Var, boolean z, cs0 cs0Var, z13 z13Var, bq1 bq1Var, boolean z2, nt2 nt2Var, ln lnVar, x12 x12Var, rs0 rs0Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        z13 z13Var2;
        boolean z3;
        nt2 nt2Var2;
        ln lnVar2;
        x12 x12Var2;
        rs0 rs0Var2;
        int i3;
        nt2 nt2Var3;
        ln lnVarA;
        x12 x12Var3;
        rs0 rs0VarN;
        int i4;
        nt2 nt2Var4;
        boolean z4;
        ln lnVar3;
        long j;
        long j2;
        long j3;
        nt2 nt2Var5;
        boolean z5;
        nv0Var.b0(1532041126);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(y33Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z13Var2 = z13Var;
            i2 |= nv0Var.f(z13Var2) ? 2048 : 1024;
        } else {
            z13Var2 = z13Var;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 16384 : 8192;
        }
        int i5 = 196608 | i2;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i2;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = 905969664 | i5;
        if (nv0Var.R(i6 & 1, (306783379 & i6) != 306783378)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                qt2 qt2Var = qt2.a;
                fy fyVar = (fy) nv0Var.j(hy.a);
                nt2 nt2Var6 = fyVar.m0;
                if (nt2Var6 == null) {
                    gy gyVar = w7.Z;
                    long jD = hy.d(fyVar, gyVar);
                    long jD2 = hy.d(fyVar, w7.a0);
                    gy gyVar2 = w7.X;
                    long jD3 = hy.d(fyVar, gyVar2);
                    long j4 = wx.f;
                    long jD4 = hy.d(fyVar, w7.c0);
                    long jD5 = hy.d(fyVar, gyVar2);
                    long jD6 = hy.d(fyVar, gyVar);
                    gy gyVar3 = w7.T;
                    long jD7 = hy.d(fyVar, gyVar3);
                    i3 = -33030145;
                    float f2 = w7.U;
                    long jB = wx.b(f2, jD7);
                    long jD8 = hy.d(fyVar, gyVar2);
                    float f3 = w7.V;
                    nt2Var3 = new nt2(jD, jD2, jD3, j4, jD4, jD5, jD6, jB, wx.b(f3, jD8), j4, wx.b(f2, hy.d(fyVar, gyVar3)), wx.b(f3, hy.d(fyVar, gyVar2)));
                    fyVar.m0 = nt2Var3;
                } else {
                    i3 = -33030145;
                    nt2Var3 = nt2Var6;
                }
                lnVarA = r51.a(qt2.b, z ? nt2Var3.c : !z ? nt2Var3.f : nt2Var3.l);
                x12Var3 = qt2.d;
                rs0VarN = gq.N(-643804033, new st2(z), nv0Var);
                i4 = i6 & i3;
                nt2Var4 = nt2Var3;
                z4 = true;
            } else {
                nv0Var.U();
                z4 = z2;
                lnVarA = lnVar;
                x12Var3 = x12Var;
                rs0VarN = rs0Var;
                i4 = i6 & (-33030145);
                nt2Var4 = nt2Var;
            }
            nv0Var.q();
            nv0Var.a0(-1579561419);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = nc2.e(nv0Var);
            }
            qr1 qr1Var = (qr1) objO;
            nv0Var.p(false);
            nt2Var4.getClass();
            if (z4 && z) {
                lnVar3 = lnVarA;
                j = nt2Var4.a;
            } else {
                lnVar3 = lnVarA;
                j = (!z4 || z) ? (z4 || !z) ? nt2Var4.j : nt2Var4.g : nt2Var4.d;
            }
            if (z4 && z) {
                j2 = j;
                j3 = nt2Var4.b;
            } else {
                j2 = j;
                j3 = (!z4 || z) ? (z4 || !z) ? nt2Var4.k : nt2Var4.h : nt2Var4.e;
            }
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = new a42(0);
                nv0Var.j0(objO2);
            }
            a42 a42Var = (a42) objO2;
            boolean zF = nv0Var.f(qr1Var);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == obj) {
                nt2Var5 = nt2Var4;
                z5 = z4;
                objO3 = new hd1(qr1Var, a42Var, null, 20);
                nv0Var.j0(objO3);
            } else {
                nt2Var5 = nt2Var4;
                z5 = z4;
            }
            rn.l((rs0) objO3, nv0Var, qr1Var);
            bq1 bq1VarA = j43.a(vm1.C(y33Var.a(bq1Var), new wa2(1, a42Var, z)), xp.c, xp.d);
            Object objO4 = nv0Var.O();
            if (objO4 == obj) {
                objO4 = new cr2(13);
                nv0Var.j0(objO4);
            }
            ln lnVar4 = lnVar3;
            x12 x12Var4 = x12Var3;
            rs0 rs0Var3 = rs0VarN;
            boolean z6 = z5;
            hb3.b(z, cs0Var, su2.a(bq1VarA, false, (ns0) objO4), z6, z13Var2, j2, j3, 0.0f, lnVar4, qr1Var, gq.N(-1208080836, new do1(2, d00Var, rs0VarN, x12Var3), nv0Var), nv0Var, ((i4 >> 3) & 126) | ((i4 >> 6) & 7168) | ((i4 << 3) & 57344), 384);
            z3 = z6;
            lnVar2 = lnVar4;
            nt2Var2 = nt2Var5;
            rs0Var2 = rs0Var3;
            x12Var2 = x12Var4;
        } else {
            nv0Var.U();
            z3 = z2;
            nt2Var2 = nt2Var;
            lnVar2 = lnVar;
            x12Var2 = x12Var;
            rs0Var2 = rs0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v40(y33Var, z, cs0Var, z13Var, bq1Var, z3, nt2Var2, lnVar2, x12Var2, rs0Var2, d00Var, i);
        }
    }

    public static final void d(rs0 rs0Var, d00 d00Var, x12 x12Var, nv0 nv0Var, int i) {
        nv0Var.b0(-1069265073);
        int i2 = (nv0Var.h(rs0Var) ? 4 : 2) | i | (nv0Var.h(d00Var) ? 32 : 16) | (nv0Var.f(x12Var) ? 256 : 128);
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            vm vmVar = f5.k;
            bq1 bq1VarI = f80.I(yp1.a, x12Var);
            cn1 cn1VarD = eo.d(vmVar, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarI);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            mg3.a(ql3.a(w7.W, nv0Var), gq.N(-1372614088, new do1(3, d00Var, rs0Var, uq.R(pq1.g, nv0Var)), nv0Var), nv0Var, 48);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1(rs0Var, d00Var, x12Var, i, 14);
        }
    }

    public static final void e(final bq1 bq1Var, final float f2, final d00 d00Var, nv0 nv0Var, final int i) {
        nv0Var.b0(2041406825);
        int i2 = i | 48;
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            f2 = qt2.b;
            bq1 bq1VarE = r51.E(j43.b(su2.a(bq1Var, false, new cr2(14)), 0.0f, 40.0f, 1), m51.f);
            dp2 dp2VarA = cp2.a(new jj(-f2, true, new c(i3)), f5.q, nv0Var, 48);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarE);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, dp2VarA);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new y33();
                nv0Var.j0(objO);
            }
            d00Var.e((y33) objO, nv0Var, 54);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(f2, d00Var, i) { // from class: rt2
                public final /* synthetic */ float g;
                public final /* synthetic */ d00 h;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(391);
                    jo3.e(this.f, this.g, this.h, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static xa3 f() {
        return new xa3(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.rb3 r6, defpackage.ml r7) {
        /*
            boolean r0 = r7 instanceof defpackage.fo2
            if (r0 == 0) goto L13
            r0 = r7
            fo2 r0 = (defpackage.fo2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            fo2 r0 = new fo2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rb3 r6 = r0.i
            defpackage.y02.Q(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.y02.Q(r7)
        L31:
            r0.i = r6
            r0.k = r2
            ab2 r7 = defpackage.ab2.g
            java.lang.Object r7 = r6.c(r7, r0)
            y50 r1 = defpackage.y50.f
            if (r7 != r1) goto L40
            return r1
        L40:
            za2 r7 = (defpackage.za2) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            gb2 r5 = (defpackage.gb2) r5
            boolean r5 = defpackage.w22.k(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo3.g(rb3, ml):java.lang.Object");
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int i(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, gf.b(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static t63 l() {
        return (t63) a73.b.j();
    }

    public static final e60 m(cr3 cr3Var) {
        return cr3Var instanceof rx0 ? ((rx0) cr3Var).getDefaultViewModelCreationExtras() : d60.b;
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final boolean o(vu2 vu2Var) {
        qu2 qu2VarK = vu2Var.k();
        return qu2VarK.f.c(zu2.B);
    }

    public static final boolean p(sf3 sf3Var, boolean z) {
        ab1 ab1VarC;
        ye1 ye1Var = sf3Var.d;
        if (ye1Var == null || (ab1VarC = ye1Var.c()) == null) {
            return false;
        }
        jk2 jk2VarA = d32.A(ab1VarC);
        long jL = sf3Var.l(z);
        float f2 = jk2VarA.a;
        float f3 = jk2VarA.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = jk2VarA.b;
        float f5 = jk2VarA.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public static final void q(String str) {
        str.getClass();
        throw new IllegalArgumentException(nc2.i("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final r13 r(r13 r13Var, r13 r13Var2, float f2) {
        long jN = vp.N(r13Var.a, r13Var2.a, f2);
        long j = r13Var.b;
        long j2 = r13Var2.b;
        float fN = lq.N(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f2);
        float fN2 = lq.N(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f2);
        return new r13(jN, (((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(fN2)) & 4294967295L), lq.N(r13Var.c, r13Var2.c, f2));
    }

    public static t63 s(t63 t63Var) {
        if (t63Var instanceof kk3) {
            kk3 kk3Var = (kk3) t63Var;
            if (kk3Var.t == g12.G()) {
                kk3Var.r = null;
                return t63Var;
            }
        }
        if (t63Var instanceof lk3) {
            lk3 lk3Var = (lk3) t63Var;
            if (lk3Var.i == g12.G()) {
                lk3Var.h = null;
                return t63Var;
            }
        }
        t63 t63VarG = a73.g(t63Var, null, false);
        t63VarG.j();
        return t63VarG;
    }

    public static Object t(b5 b5Var, cs0 cs0Var) {
        t63 kk3Var;
        t63 t63Var = (t63) a73.b.j();
        if (t63Var instanceof kk3) {
            kk3 kk3Var2 = (kk3) t63Var;
            if (kk3Var2.t == g12.G()) {
                ns0 ns0Var = kk3Var2.r;
                ns0 ns0Var2 = kk3Var2.s;
                try {
                    ((kk3) t63Var).r = a73.k(b5Var, ns0Var, true);
                    ((kk3) t63Var).s = ns0Var2;
                    return cs0Var.a();
                } finally {
                    kk3Var2.r = ns0Var;
                    kk3Var2.s = ns0Var2;
                }
            }
        }
        if (t63Var == null || (t63Var instanceof ns1)) {
            kk3Var = new kk3(t63Var instanceof ns1 ? (ns1) t63Var : null, b5Var, null, true, false);
        } else {
            kk3Var = t63Var.u(b5Var);
        }
        try {
            t63 t63VarJ = kk3Var.j();
            try {
                Object objA = cs0Var.a();
                t63.q(t63VarJ);
                kk3Var.c();
                return objA;
            } catch (Throwable th) {
                t63.q(t63VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            kk3Var.c();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List u(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo3.u(java.lang.String):java.util.List");
    }

    public static void v(t63 t63Var, t63 t63Var2, ns0 ns0Var) {
        if (t63Var != t63Var2) {
            t63Var2.getClass();
            t63.q(t63Var);
            t63Var2.c();
        } else if (t63Var instanceof kk3) {
            ((kk3) t63Var).r = ns0Var;
        } else if (t63Var instanceof lk3) {
            ((lk3) t63Var).h = ns0Var;
        } else {
            c.h(t63Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static void w(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            pendingIntent.send();
            return;
        }
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (i >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e2) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e2);
        }
    }

    public static String x(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    public static final int y(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void z(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo3.j(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(java.lang.String r27, int r28, byte[] r29, int r30) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo3.k(java.lang.String, int, byte[], int):int");
    }
}
