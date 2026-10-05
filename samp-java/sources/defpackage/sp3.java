package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class sp3 {
    public final sj a;
    public final sj b;
    public final sj c;

    public sp3(sj sjVar, sj sjVar2, sj sjVar3) {
        this.a = sjVar;
        this.b = sjVar2;
        this.c = sjVar3;
    }

    public abstract tp3 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        sj sjVar = this.c;
        Class cls2 = (Class) sjVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        sjVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        sj sjVar = this.a;
        Method method = (Method) sjVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, sp3.class.getClassLoader()).getDeclaredMethod("read", sp3.class);
        sjVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        sj sjVar = this.b;
        Method method = (Method) sjVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, sp3.class);
        sjVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((tp3) this).e.readParcelable(tp3.class.getClassLoader());
    }

    public final up3 g() {
        String string = ((tp3) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (up3) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(up3 up3Var) {
        if (up3Var == null) {
            ((tp3) this).e.writeString(null);
            return;
        }
        try {
            ((tp3) this).e.writeString(b(up3Var.getClass()).getName());
            tp3 tp3VarA = a();
            try {
                d(up3Var.getClass()).invoke(null, up3Var, tp3VarA);
                Parcel parcel = tp3VarA.e;
                int i = tp3VarA.i;
                if (i >= 0) {
                    int i2 = tp3VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(up3Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
