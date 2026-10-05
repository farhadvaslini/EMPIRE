package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lu implements ku {
    public static final Map b;
    public final Class a;

    static {
        List listL = vr.L(cs0.class, ns0.class, rs0.class, ss0.class, ts0.class, us0.class, vs0.class, ws0.class, xs0.class, ys0.class, ds0.class, es0.class, fs0.class, gs0.class, hs0.class, is0.class, js0.class, ks0.class, ls0.class, ms0.class, os0.class, ps0.class, qs0.class);
        ArrayList arrayList = new ArrayList(rx.d0(listL, 10));
        int i = 0;
        for (Object obj : listL) {
            int i2 = i + 1;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            arrayList.add(new r32((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = om1.a0(arrayList);
    }

    public lu(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.ku
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String strT;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strT2 = vr.t(cls.getName());
            return strT2 == null ? cls.getCanonicalName() : strT2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strT = vr.t(componentType.getName())) != null) {
            strConcat = strT.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strZ;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strZ2 = vr.Z(cls.getName());
                return strZ2 == null ? cls.getSimpleName() : strZ2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strZ = vr.Z(componentType.getName())) != null) {
                strConcat = strZ.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return y93.C0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iN0 = y93.n0(simpleName, '$', 0, 6);
            return iN0 == -1 ? simpleName : simpleName.substring(iN0 + 1, simpleName.length());
        }
        return y93.C0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lu) && uq.u(this).equals(uq.u((lu) obj));
    }

    public final int hashCode() {
        return uq.u(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
