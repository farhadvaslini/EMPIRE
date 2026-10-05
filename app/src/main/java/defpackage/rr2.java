package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class rr2 {
    public static final Class a;
    public static final fm3 b;
    public static final fm3 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        be2 be2Var = be2.c;
        fm3 fm3Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            be2 be2Var2 = be2.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                fm3Var = (fm3) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = fm3Var;
        c = new fm3();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += nx.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (nx.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (nx.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += nx.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += nx.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += nx.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += nx.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += nx.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += nx.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(fm3 fm3Var, Object obj, Object obj2) {
        fm3Var.getClass();
        wv0 wv0Var = (wv0) obj;
        em3 em3Var = wv0Var.unknownFields;
        em3 em3Var2 = ((wv0) obj2).unknownFields;
        em3 em3Var3 = em3.f;
        if (!em3Var3.equals(em3Var2)) {
            if (em3Var3.equals(em3Var)) {
                int i = em3Var.a + em3Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(em3Var.b, i);
                System.arraycopy(em3Var2.b, 0, iArrCopyOf, em3Var.a, em3Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(em3Var.c, i);
                System.arraycopy(em3Var2.c, 0, objArrCopyOf, em3Var.a, em3Var2.a);
                em3Var = new em3(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                em3Var.getClass();
                if (!em3Var2.equals(em3Var3)) {
                    if (!em3Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = em3Var.a + em3Var2.a;
                    em3Var.a(i2);
                    System.arraycopy(em3Var2.b, 0, em3Var.b, em3Var.a, em3Var2.a);
                    System.arraycopy(em3Var2.c, 0, em3Var.c, em3Var.a, em3Var2.a);
                    em3Var.a = i2;
                }
            }
        }
        wv0Var.unknownFields = em3Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = nx.f;
            i3++;
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            nxVar.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                nxVar.getClass();
                nxVar.t(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = nx.f;
            i3 += 8;
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            nxVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += nx.j(((Integer) list.get(i3)).intValue());
        }
        nxVar.D(iJ);
        while (i2 < list.size()) {
            nxVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = nx.f;
            i3 += 4;
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            nxVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = nx.f;
            i3 += 8;
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            nxVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                nxVar.getClass();
                nxVar.r(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = nx.f;
            i3 += 4;
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            nxVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += nx.j(((Integer) list.get(i3)).intValue());
        }
        nxVar.D(iJ);
        while (i2 < list.size()) {
            nxVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += nx.j(((Long) list.get(i3)).longValue());
        }
        nxVar.D(iJ);
        while (i2 < list.size()) {
            nxVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = nx.f;
            i3 += 4;
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            nxVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = nx.f;
            i3 += 8;
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            nxVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                nxVar.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += nx.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            nxVar.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                nxVar.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += nx.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        nxVar.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            nxVar.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += nx.i(((Integer) list.get(i4)).intValue());
        }
        nxVar.D(i3);
        while (i2 < list.size()) {
            nxVar.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, yl1 yl1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx nxVar = (nx) yl1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nxVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nxVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += nx.j(((Long) list.get(i3)).longValue());
        }
        nxVar.D(iJ);
        while (i2 < list.size()) {
            nxVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, b51 b51Var, Object obj2, fm3 fm3Var) {
        return obj2;
    }
}
