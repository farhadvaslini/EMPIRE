package defpackage;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pt2(int i, int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i;
        Collection collectionD0;
        int i2 = this.f;
        lv2 lv2Var = null;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                ((qt2) obj3).a(jo3.y(7), (nv0) obj);
                return dm3.a;
            case 1:
                ((gb2) obj).a();
                ((pk2) obj3).f = ((gy1) obj2).a;
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                f80.r((vy2) obj3, (nv0) obj, jo3.y(9));
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                n82 n82Var = (n82) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mg3.b(n82Var.b, null, ((fy) nv0Var.j(hy.a)).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262138);
                } else {
                    nv0Var.U();
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                p03.e((tn1) obj3, (nv0) obj, jo3.y(1));
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                oh3 oh3Var = (oh3) obj3;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mg3.b(g12.f0(oh3Var, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                } else {
                    nv0Var2.U();
                }
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                qp2 qp2Var = (qp2) obj3;
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mg3.b(qp2Var.f, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var3, 0, 0, 262142);
                } else {
                    nv0Var3.U();
                }
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                qf2 qf2Var = (qf2) obj3;
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int iOrdinal = qf2Var.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.launcher_radar_position_top_left;
                    } else {
                        if (iOrdinal != 1) {
                            c.k();
                            return null;
                        }
                        i = R.string.launcher_radar_position_bottom_left;
                    }
                    mg3.b(oz2.N(R.string.launcher_description_radar_position, new Object[]{oz2.M(i, nv0Var4)}, nv0Var4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var4, 0, 0, 262142);
                } else {
                    nv0Var4.U();
                }
                return dm3.a;
            case 8:
                e43 e43Var = (e43) obj3;
                Set set = (Set) obj;
                synchronized (e43Var.a) {
                    try {
                        js1 js1Var = e43Var.d;
                        if (js1Var != null) {
                            Object[] objArr = js1Var.b;
                            long[] jArr = js1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j = jArr[i3];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 < i4) {
                                                if ((255 & j) >= 128 || !set.contains(objArr[(i3 << 3) + i5])) {
                                                    j >>= 8;
                                                    i5++;
                                                } else {
                                                    lv2Var = e43Var.f;
                                                }
                                            } else if (i4 == 8) {
                                            }
                                        }
                                    } else if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                        } else if (qx.m0(set, e43Var.b)) {
                            lv2Var = e43Var.f;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (lv2Var != null) {
                    lv2Var.l(dm3.a);
                }
                return dm3.a;
            case vr.g /* 9 */:
                p73 p73Var = (p73) obj3;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = p73Var.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        collectionD0 = collection;
                    } else if (obj4 instanceof Set) {
                        collectionD0 = vr.L(obj4, collection);
                    } else {
                        if (!(obj4 instanceof List)) {
                            e20.b("Unexpected notification");
                            c.d();
                            return null;
                        }
                        collectionD0 = qx.D0((Collection) obj4, vr.K(collection));
                    }
                    while (!atomicReference.compareAndSet(obj4, collectionD0)) {
                        if (atomicReference.get() != obj4) {
                        }
                        break;
                    }
                    if (p73Var.c()) {
                        p73Var.a.h(new it1(24, p73Var));
                    }
                    return dm3.a;
                }
                break;
            case vr.h /* 10 */:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iP0 = y93.p0(charSequence, (char[]) obj3, iIntValue5, false);
                if (iP0 < 0) {
                    return null;
                }
                return new r32(Integer.valueOf(iP0), 1);
            case 11:
                nv0 nv0Var5 = (nv0) obj;
                ((Integer) obj2).intValue();
                nv0Var5.a0(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                nv0Var5.p(false);
                return strValueOf;
            case vr.i /* 12 */:
                nv0 nv0Var6 = (nv0) obj;
                ((Integer) obj2).intValue();
                nv0Var6.a0(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                nv0Var6.p(false);
                return string;
            case 13:
                ((Integer) obj2).getClass();
                ((tg3) obj3).a(jo3.y(1), (nv0) obj);
                return dm3.a;
            case 14:
                ((fi1) obj3).h(obj);
                return dm3.a;
            case jo3.g /* 15 */:
                return new i41(((long) ((tm) obj3).a(0, (int) (((p41) obj).a >> 32), (bb1) obj2)) << 32);
            case 16:
                return new i41(((long) ((um) obj3).a(0, (int) (((p41) obj).a & 4294967295L))) & 4294967295L);
            default:
                return new i41(((vm) obj3).a(0L, ((p41) obj).a, (bb1) obj2));
        }
    }

    public /* synthetic */ pt2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
