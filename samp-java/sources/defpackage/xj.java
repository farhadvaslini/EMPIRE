package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xj extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        yj yjVarL;
        while (true) {
            try {
                s4 s4Var = yj.h;
                reentrantLock = yj.j;
                reentrantLock.lock();
                try {
                    yjVarL = m22.l();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (yjVarL == yj.i) {
                yj.i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (yjVarL != null) {
                    yjVarL.k();
                }
            }
        }
    }
}
