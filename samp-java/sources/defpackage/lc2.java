package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lc2 extends wv0 {
    private static final lc2 DEFAULT_INSTANCE;
    private static volatile i42 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private b51 strings_ = ce2.i;

    static {
        lc2 lc2Var = new lc2();
        DEFAULT_INSTANCE = lc2Var;
        wv0.j(lc2.class, lc2Var);
    }

    public static void l(lc2 lc2Var, Iterable iterable) {
        b51 b51Var = lc2Var.strings_;
        if (!((ce2) b51Var).f) {
            ce2 ce2Var = (ce2) b51Var;
            int i = ce2Var.h;
            lc2Var.strings_ = ce2Var.c(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = lc2Var.strings_;
        Charset charset = c51.a;
        if (iterable instanceof oe1) {
            List listD = ((oe1) iterable).d();
            if (randomAccess != null) {
                qn1.b();
                return;
            }
            ((ce2) randomAccess).getClass();
            Iterator it = listD.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof jq) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                jq.c(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof dd2) {
            ((ce2) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((ce2) randomAccess).h);
        }
        ce2 ce2Var2 = (ce2) randomAccess;
        int i2 = ce2Var2.h;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (ce2Var2.h - i2) + " is null.";
                for (int i3 = ce2Var2.h - 1; i3 >= i2; i3--) {
                    ce2Var2.remove(i3);
                }
                throw new NullPointerException(str);
            }
            ce2Var2.add(obj);
        }
    }

    public static lc2 m() {
        return DEFAULT_INSTANCE;
    }

    public static kc2 o() {
        return (kc2) ((uv0) DEFAULT_INSTANCE.c(5));
    }

    @Override // defpackage.wv0
    public final Object c(int i) {
        i42 vv0Var;
        switch (nc2.z(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new yi2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new lc2();
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new kc2(DEFAULT_INSTANCE);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                i42 i42Var = PARSER;
                if (i42Var != null) {
                    return i42Var;
                }
                synchronized (lc2.class) {
                    try {
                        vv0Var = PARSER;
                        if (vv0Var == null) {
                            vv0Var = new vv0();
                            PARSER = vv0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return vv0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final b51 n() {
        return this.strings_;
    }
}
