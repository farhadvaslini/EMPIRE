package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ml implements p40, z50, Serializable {
    public final p40 f;

    public ml(p40 p40Var) {
        this.f = p40Var;
    }

    public z50 d() {
        p40 p40Var = this.f;
        if (p40Var instanceof z50) {
            return (z50) p40Var;
        }
        return null;
    }

    public p40 m(p40 p40Var, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement n() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e80 e80Var = (e80) getClass().getAnnotation(e80.class);
        String str = null;
        if (e80Var == null || e80Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? e80Var.l()[iIntValue] : -1;
        pi piVar = vm1.Z;
        pi piVar2 = vm1.a0;
        if (piVar2 == null) {
            try {
                pi piVar3 = new pi(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 11);
                vm1.a0 = piVar3;
                piVar2 = piVar3;
            } catch (Exception unused2) {
                vm1.a0 = piVar;
                piVar2 = piVar;
            }
        }
        if (piVar2 != piVar && (method = (Method) piVar2.g) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) piVar2.h) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) piVar2.i;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = e80Var.c();
        } else {
            strC = str + '/' + e80Var.c();
        }
        return new StackTraceElement(strC, e80Var.m(), e80Var.f(), i);
    }

    public abstract Object o(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.p40
    public final void t(Object obj) {
        ?? r2 = this;
        while (true) {
            ml mlVar = (ml) r2;
            p40 p40Var = mlVar.f;
            p40Var.getClass();
            try {
                obj = mlVar.o(obj);
                if (obj == y50.f) {
                    return;
                }
            } catch (Throwable th) {
                obj = new qn2(th);
            }
            mlVar.p();
            if (!(p40Var instanceof ml)) {
                p40Var.t(obj);
                return;
            }
            r2 = p40Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objN = n();
        if (objN == null) {
            objN = getClass().getName();
        }
        sb.append(objN);
        return sb.toString();
    }

    public void p() {
    }
}
