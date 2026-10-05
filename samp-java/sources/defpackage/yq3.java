package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yq3 extends ar3 {
    public static yq3 c;
    public static final ak2 d = new ak2(23);
    public final Application b;

    public yq3(Application application) {
        this.b = application;
    }

    @Override // defpackage.ar3, defpackage.zq3
    public final vq3 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.ar3, defpackage.zq3
    public final vq3 b(Class cls, lr1 lr1Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) lr1Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!vc.class.isAssignableFrom(cls)) {
            return br.q(cls);
        }
        c.p("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final vq3 d(Class cls, Application application) {
        if (!vc.class.isAssignableFrom(cls)) {
            return br.q(cls);
        }
        try {
            vq3 vq3Var = (vq3) cls.getConstructor(Application.class).newInstance(application);
            vq3Var.getClass();
            return vq3Var;
        } catch (IllegalAccessException e) {
            qn1.l("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            qn1.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            qn1.l("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            qn1.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
