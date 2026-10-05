package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 {
    public static final w33 b = new w33(0);
    public final /* synthetic */ ur0 a;

    public sr0(ur0 ur0Var) {
        this.a = ur0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        w33 w33Var = b;
        w33 w33Var2 = (w33) w33Var.get(classLoader);
        if (w33Var2 == null) {
            w33Var2 = new w33(0);
            w33Var.put(classLoader, w33Var2);
        }
        Class cls = (Class) w33Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        w33Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new kz(nc2.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new kz(nc2.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final void a(String str) {
        try {
            if (c(this.a.r.f.getClassLoader(), str).getConstructor(null).newInstance(null) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e) {
            throw new kz(nc2.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new kz(nc2.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new kz(nc2.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new kz(nc2.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
