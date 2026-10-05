package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj1 {
    public static final ee2 a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r1 instanceof defpackage.ee2) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = (defpackage.ee2) r1;
     */
    static {
        Object qn2Var;
        try {
            ClassLoader classLoader = wq2.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof za0) {
                    break;
                } else {
                    i++;
                }
            }
            qn2Var = null;
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        ee2 r93Var = (ee2) (qn2Var instanceof qn2 ? null : qn2Var);
        if (r93Var == null) {
            r93Var = new r93(new x91(19));
        }
        a = r93Var;
    }
}
