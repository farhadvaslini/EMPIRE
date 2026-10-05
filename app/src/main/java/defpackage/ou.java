package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ou {
    public static final ou c = new ou();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, nu nuVar, ef1 ef1Var, Class cls) {
        ef1 ef1Var2 = (ef1) map.get(nuVar);
        if (ef1Var2 == null || ef1Var == ef1Var2) {
            if (ef1Var2 == null) {
                map.put(nuVar, ef1Var);
                return;
            }
            return;
        }
        String name = nuVar.b.getName();
        String name2 = cls.getName();
        String strValueOf = String.valueOf(ef1Var2);
        String strValueOf2 = String.valueOf(ef1Var);
        StringBuilder sbN = nc2.n("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value ");
        sbN.append(strValueOf);
        sbN.append(", new value ");
        sbN.append(strValueOf2);
        throw new IllegalArgumentException(sbN.toString());
    }

    public final mu a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            mu muVarA = (mu) map2.get(superclass);
            if (muVarA == null) {
                muVarA = a(superclass, null);
            }
            map.putAll(muVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            mu muVarA2 = (mu) map2.get(cls2);
            if (muVarA2 == null) {
                muVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : muVarA2.b.entrySet()) {
                b(map, (nu) entry.getKey(), (ef1) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            cz1 cz1Var = (cz1) method.getAnnotation(cz1.class);
            if (cz1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!of1.class.isAssignableFrom(parameterTypes[0])) {
                        c.p("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                ef1 ef1VarValue = cz1Var.value();
                if (parameterTypes.length > 1) {
                    if (!ef1.class.isAssignableFrom(parameterTypes[1])) {
                        c.p("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (ef1VarValue != ef1.ON_ANY) {
                        c.p("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    c.p("cannot have more than 2 params");
                    return null;
                }
                b(map, new nu(i, method), ef1VarValue, cls);
                z = true;
            }
        }
        mu muVar = new mu(map);
        map2.put(cls, muVar);
        this.b.put(cls, Boolean.valueOf(z));
        return muVar;
    }
}
