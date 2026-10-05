package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class u83 {
    public static final /* synthetic */ int a = 0;

    static {
        Object qn2Var;
        Object qn2Var2;
        Exception exc = new Exception();
        String simpleName = gv3.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            qn2Var = ml.class.getCanonicalName();
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        if (rn2.a(qn2Var) != null) {
            qn2Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            qn2Var2 = u83.class.getCanonicalName();
        } catch (Throwable th2) {
            qn2Var2 = new qn2(th2);
        }
        if (rn2.a(qn2Var2) != null) {
            qn2Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
