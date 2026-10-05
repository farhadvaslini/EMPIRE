package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jc2 extends wv0 {
    private static final jc2 DEFAULT_INSTANCE;
    private static volatile i42 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private im1 preferences_ = im1.g;

    static {
        jc2 jc2Var = new jc2();
        DEFAULT_INSTANCE = jc2Var;
        wv0.j(jc2.class, jc2Var);
    }

    public static im1 l(jc2 jc2Var) {
        im1 im1Var = jc2Var.preferences_;
        if (!im1Var.f) {
            jc2Var.preferences_ = im1Var.b();
        }
        return jc2Var.preferences_;
    }

    public static hc2 n() {
        return (hc2) ((uv0) DEFAULT_INSTANCE.c(5));
    }

    public static jc2 o(FileInputStream fileInputStream) {
        jc2 jc2Var = DEFAULT_INSTANCE;
        jx jxVar = new jx(fileInputStream);
        sk0 sk0VarA = sk0.a();
        wv0 wv0VarI = jc2Var.i();
        try {
            be2 be2Var = be2.c;
            be2Var.getClass();
            qr2 qr2VarA = be2Var.a(wv0VarI.getClass());
            lx lxVar = (lx) jxVar.g;
            if (lxVar == null) {
                lxVar = new lx(jxVar);
            }
            qr2VarA.h(wv0VarI, lxVar, sk0VarA);
            qr2VarA.c(wv0VarI);
            if (wv0.f(wv0VarI, true)) {
                return (jc2) wv0VarI;
            }
            throw new z51(new zl3().getMessage());
        } catch (z51 e) {
            if (e.f) {
                throw new z51(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof z51) {
                throw ((z51) e2.getCause());
            }
            throw new z51(e2.getMessage(), e2);
        } catch (zl3 e3) {
            throw new z51(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof z51) {
                throw ((z51) e4.getCause());
            }
            throw e4;
        }
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
                return new yi2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", ic2.a});
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new jc2();
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new hc2(DEFAULT_INSTANCE);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                i42 i42Var = PARSER;
                if (i42Var != null) {
                    return i42Var;
                }
                synchronized (jc2.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
