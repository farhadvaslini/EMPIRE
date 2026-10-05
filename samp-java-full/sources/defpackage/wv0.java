package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wv0 extends f0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, wv0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected em3 unknownFields;

    public wv0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = em3.f;
    }

    public static wv0 d(Class cls) {
        wv0 wv0Var = defaultInstanceMap.get(cls);
        if (wv0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wv0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (wv0Var != null) {
            return wv0Var;
        }
        wv0 wv0Var2 = (wv0) ((wv0) qm3.d(cls)).c(6);
        if (wv0Var2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, wv0Var2);
        return wv0Var2;
    }

    public static Object e(Method method, wv0 wv0Var, Object... objArr) {
        try {
            return method.invoke(wv0Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(wv0 wv0Var, boolean z) {
        byte bByteValue = ((Byte) wv0Var.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        be2 be2Var = be2.c;
        be2Var.getClass();
        boolean zE = be2Var.a(wv0Var.getClass()).e(wv0Var);
        if (z) {
            wv0Var.c(2);
        }
        return zE;
    }

    public static void j(Class cls, wv0 wv0Var) {
        wv0Var.h();
        defaultInstanceMap.put(cls, wv0Var);
    }

    @Override // defpackage.f0
    public final int a(qr2 qr2Var) {
        int iD;
        int iD2;
        if (g()) {
            if (qr2Var == null) {
                be2 be2Var = be2.c;
                be2Var.getClass();
                iD2 = be2Var.a(getClass()).d(this);
            } else {
                iD2 = qr2Var.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            c.q(by1.e(iD2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (qr2Var == null) {
            be2 be2Var2 = be2.c;
            be2Var2.getClass();
            iD = be2Var2.a(getClass()).d(this);
        } else {
            iD = qr2Var.d(this);
        }
        k(iD);
        return iD;
    }

    @Override // defpackage.f0
    public final void b(nx nxVar) {
        be2 be2Var = be2.c;
        be2Var.getClass();
        qr2 qr2VarA = be2Var.a(getClass());
        yl1 yl1Var = nxVar.a;
        if (yl1Var == null) {
            yl1Var = new yl1(nxVar);
        }
        qr2VarA.f(this, yl1Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        be2 be2Var = be2.c;
        be2Var.getClass();
        return be2Var.a(getClass()).g(this, (wv0) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            be2 be2Var = be2.c;
            be2Var.getClass();
            return be2Var.a(getClass()).a(this);
        }
        if (this.memoizedHashCode == 0) {
            be2 be2Var2 = be2.c;
            be2Var2.getClass();
            this.memoizedHashCode = be2Var2.a(getClass()).a(this);
        }
        return this.memoizedHashCode;
    }

    public final wv0 i() {
        return (wv0) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            c.q(by1.e(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = wo1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        wo1.c(this, sb, 0);
        return sb.toString();
    }
}
