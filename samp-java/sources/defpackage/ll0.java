package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ll0 {
    public static final /* synthetic */ int c = 0;
    public final o53 a = o53.f();
    public boolean b;

    static {
        new ll0(0);
    }

    public ll0(int i) {
        a();
        a();
    }

    public static void b(nx nxVar, mu3 mu3Var, int i, Object obj) throws IOException {
        if (mu3Var == mu3.i) {
            nxVar.B(i, 3);
            ((f0) obj).b(nxVar);
            nxVar.B(i, 4);
        }
        nxVar.B(i, mu3Var.g);
        switch (mu3Var.ordinal()) {
            case 0:
                nxVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                nxVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nxVar.F(((Long) obj).longValue());
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nxVar.F(((Long) obj).longValue());
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nxVar.w(((Integer) obj).intValue());
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nxVar.u(((Long) obj).longValue());
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nxVar.s(((Integer) obj).intValue());
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nxVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof jq)) {
                    nxVar.A((String) obj);
                } else {
                    nxVar.q((jq) obj);
                }
                break;
            case vr.g /* 9 */:
                ((f0) obj).b(nxVar);
                break;
            case vr.h /* 10 */:
                f0 f0Var = (f0) obj;
                nxVar.D(((wv0) f0Var).a(null));
                f0Var.b(nxVar);
                break;
            case 11:
                if (!(obj instanceof jq)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    nxVar.D(length);
                    nxVar.n(bArr, 0, length);
                } else {
                    nxVar.q((jq) obj);
                }
                break;
            case vr.i /* 12 */:
                nxVar.D(((Integer) obj).intValue());
                break;
            case 13:
                nxVar.w(((Integer) obj).intValue());
                break;
            case 14:
                nxVar.s(((Integer) obj).intValue());
                break;
            case jo3.g /* 15 */:
                nxVar.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                nxVar.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                nxVar.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        o53 o53Var = this.a;
        int size = o53Var.f.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = o53Var.c(i);
            if (entryC.getValue() instanceof wv0) {
                wv0 wv0Var = (wv0) entryC.getValue();
                wv0Var.getClass();
                be2 be2Var = be2.c;
                be2Var.getClass();
                be2Var.a(wv0Var.getClass()).c(wv0Var);
                wv0Var.h();
            }
        }
        if (!o53Var.h) {
            if (o53Var.f.size() > 0) {
                o53Var.c(0).getKey().getClass();
                qn1.b();
                return;
            } else {
                Iterator it = o53Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    qn1.b();
                    return;
                }
            }
        }
        if (!o53Var.h) {
            o53Var.g = o53Var.g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o53Var.g);
            o53Var.j = o53Var.j.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o53Var.j);
            o53Var.h = true;
        }
        this.b = true;
    }

    public final Object clone() {
        ll0 ll0Var = new ll0();
        o53 o53Var = this.a;
        if (o53Var.f.size() > 0) {
            Map.Entry entryC = o53Var.c(0);
            if (entryC.getKey() != null) {
                qn1.b();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = o53Var.d().iterator();
        if (!it.hasNext()) {
            return ll0Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            qn1.b();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ll0) {
            return this.a.equals(((ll0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ll0() {
    }
}
