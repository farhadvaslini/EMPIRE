package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k extends ct0 implements ns0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.m = i4;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Object value;
        int i2 = this.m;
        p40 p40Var = null;
        int i3 = 1;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.g;
        switch (i2) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                r rVar = (r) obj2;
                sr1 sr1Var = rVar.J;
                if (!zBooleanValue) {
                    if (rVar.v != null) {
                        Object[] objArr3 = sr1Var.c;
                        long[] jArr = sr1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j & 255) < 128) {
                                            i = i6;
                                            objArr2 = objArr3;
                                            cl3.t(rVar.d1(), null, new p(rVar, (zc2) objArr3[(i5 << 3) + i8], p40Var, i4), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i6;
                                        }
                                        j >>= i;
                                        i8++;
                                        i6 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i7 == i6) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i5 != length) {
                                    i5++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        zc2 zc2Var = rVar.L;
                        if (zc2Var != null) {
                            cl3.t(rVar.d1(), null, new p(rVar, zc2Var, p40Var, 1), 3);
                        }
                    }
                    sr1Var.a();
                    rVar.L = null;
                    rVar.B1();
                } else {
                    rVar.A1();
                }
                break;
            case 1:
                vu vuVar = (vu) obj;
                vuVar.getClass();
                tw twVar = (tw) obj2;
                twVar.getClass();
                i93 i93Var = twVar.p;
                if (!(i93Var.getValue() instanceof hv)) {
                    i93Var.j(null, new hv(ev.g, vuVar.a, 4));
                    w83 w83VarT = cl3.t(f80.F(twVar), null, new fd(twVar, vuVar, p40Var, i3), 3);
                    twVar.g = w83VarT;
                    w83VarT.r(new ow(twVar, w83VarT, i3));
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((m61) obj2).s((Throwable) obj);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                String str = (String) obj;
                str.getClass();
                sa1 sa1Var = (sa1) obj2;
                sa1Var.getClass();
                cl3.t(f80.F(sa1Var), null, new qa1(sa1Var, str, p40Var, i3), 3);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                sv2 sv2Var = (sv2) obj;
                sv2Var.getClass();
                ((sa1) obj2).t(sv2Var);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                kq2 kq2Var = (kq2) obj;
                kq2Var.getClass();
                sa1 sa1Var2 = (sa1) obj2;
                sa1Var2.getClass();
                i93 i93Var2 = sa1Var2.p;
                i93Var2.getClass();
                i93Var2.j(null, kq2Var);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                sv2 sv2Var2 = (sv2) obj;
                sv2Var2.getClass();
                ((sa1) obj2).z(sv2Var2);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                kq2 kq2Var2 = (kq2) obj;
                kq2Var2.getClass();
                ((sa1) obj2).y(kq2Var2);
                break;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                sm2 sm2Var = (sm2) obj2;
                sm2Var.getClass();
                sm2Var.j(str2, true);
                break;
            case vr.g /* 9 */:
                bm2 bm2Var = (bm2) obj;
                bm2Var.getClass();
                ((sm2) obj2).k(bm2Var);
                break;
            case vr.h /* 10 */:
                File file = (File) obj;
                file.getClass();
                ((sm2) obj2).l(file);
                break;
            case 11:
                Uri uri = (Uri) obj;
                uri.getClass();
                ((sm2) obj2).h(uri);
                break;
            case vr.i /* 12 */:
                sv2 sv2Var3 = (sv2) obj;
                sv2Var3.getClass();
                ((sa1) obj2).h(sv2Var3);
                break;
            case 13:
                xy2 xy2Var = (xy2) obj;
                xy2Var.getClass();
                ((sa1) obj2).o(xy2Var);
                break;
            case 14:
                String str3 = (String) obj;
                str3.getClass();
                ((sa1) obj2).n(str3);
                break;
            case jo3.g /* 15 */:
                String str4 = (String) obj;
                str4.getClass();
                sa1 sa1Var3 = (sa1) obj2;
                sa1Var3.getClass();
                i93 i93Var3 = sa1Var3.o;
                do {
                    value = i93Var3.getValue();
                } while (!i93Var3.h(value, g4.a((g4) value, str4, null, null, 5)));
                break;
            case 16:
                String str5 = (String) obj;
                str5.getClass();
                ((sa1) obj2).p(str5);
                break;
            case 17:
                String str6 = (String) obj;
                str6.getClass();
                ((sa1) obj2).m(str6);
                break;
            case 18:
                String str7 = (String) obj;
                str7.getClass();
                sa1 sa1Var4 = (sa1) obj2;
                sa1Var4.getClass();
                cl3.t(f80.F(sa1Var4), null, new qa1(sa1Var4, str7, p40Var, i3), 3);
                break;
            case 19:
                sv2 sv2Var4 = (sv2) obj;
                sv2Var4.getClass();
                ((sa1) obj2).t(sv2Var4);
                break;
            case 20:
                kq2 kq2Var3 = (kq2) obj;
                kq2Var3.getClass();
                sa1 sa1Var5 = (sa1) obj2;
                sa1Var5.getClass();
                i93 i93Var4 = sa1Var5.p;
                i93Var4.getClass();
                i93Var4.j(null, kq2Var3);
                break;
            case 21:
                sv2 sv2Var5 = (sv2) obj;
                sv2Var5.getClass();
                ((sa1) obj2).z(sv2Var5);
                break;
            case 22:
                kq2 kq2Var4 = (kq2) obj;
                kq2Var4.getClass();
                ((sa1) obj2).y(kq2Var4);
                break;
            case 23:
                String str8 = (String) obj;
                str8.getClass();
                sm2 sm2Var2 = (sm2) obj2;
                sm2Var2.getClass();
                sm2Var2.j(str8, true);
                break;
            case 24:
                bm2 bm2Var2 = (bm2) obj;
                bm2Var2.getClass();
                ((sm2) obj2).k(bm2Var2);
                break;
            case 25:
                File file2 = (File) obj;
                file2.getClass();
                ((sm2) obj2).l(file2);
                break;
            case 26:
                Uri uri2 = (Uri) obj;
                uri2.getClass();
                ((sm2) obj2).h(uri2);
                break;
            case 27:
                sv2 sv2Var6 = (sv2) obj;
                sv2Var6.getClass();
                ((sa1) obj2).h(sv2Var6);
                break;
            case 28:
                xy2 xy2Var2 = (xy2) obj;
                xy2Var2.getClass();
                ((sa1) obj2).o(xy2Var2);
                break;
            default:
                String str9 = (String) obj;
                str9.getClass();
                ((sa1) obj2).n(str9);
                break;
        }
        return dm3Var;
    }
}
