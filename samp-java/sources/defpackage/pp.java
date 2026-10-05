package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class pp {
    public static final ws a = new ws(-1, null, null, 0);
    public static final int b = b32.E(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = b32.E(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final ai0 d = new ai0(1, "BUFFERED");
    public static final ai0 e = new ai0(1, "SHOULD_BUFFER");
    public static final ai0 f = new ai0(1, "S_RESUMING_BY_RCV");
    public static final ai0 g = new ai0(1, "RESUMING_BY_EB");
    public static final ai0 h = new ai0(1, "POISONED");
    public static final ai0 i = new ai0(1, "DONE_RCV");
    public static final ai0 j = new ai0(1, "INTERRUPTED_SEND");
    public static final ai0 k = new ai0(1, "INTERRUPTED_RCV");
    public static final ai0 l = new ai0(1, "CHANNEL_CLOSED");
    public static final ai0 m = new ai0(1, "SUSPEND");
    public static final ai0 n = new ai0(1, "SUSPEND_NO_WAITER");
    public static final ai0 o = new ai0(1, "FAILED");
    public static final ai0 p = new ai0(1, "NO_RECEIVE_RESULT");
    public static final ai0 q = new ai0(1, "CLOSE_HANDLER_CLOSED");
    public static final ai0 r = new ai0(1, "CLOSE_HANDLER_INVOKED");
    public static final ai0 s = new ai0(1, "NO_CLOSE_CAUSE");

    public static final boolean a(hr hrVar, Object obj, ss0 ss0Var) {
        ai0 ai0VarB = hrVar.B(obj, ss0Var);
        if (ai0VarB == null) {
            return false;
        }
        hrVar.D(ai0VarB);
        return true;
    }
}
