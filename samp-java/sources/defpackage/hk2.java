package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hk2 implements InputConnection {
    public final k71 a;
    public final boolean b;
    public final ye1 c;
    public final sf3 d;
    public final oq3 e;
    public int f;
    public bg3 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public hk2(bg3 bg3Var, k71 k71Var, boolean z, ye1 ye1Var, sf3 sf3Var, oq3 oq3Var) {
        this.a = k71Var;
        this.b = z;
        this.c = ye1Var;
        this.d = sf3Var;
        this.e = oq3Var;
        this.g = bg3Var;
    }

    public final void a(eh0 eh0Var) {
        this.f++;
        try {
            this.j.add(eh0Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((ze1) this.a.g).c.h(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((ze1) this.a.g).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (s51.n(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new dz(i, String.valueOf(charSequence)));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new pa0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new qa0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new lm0());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        bg3 bg3Var = this.g;
        return TextUtils.getCapsMode(bg3Var.a.g, yg3.f(bg3Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return t22.h(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (yg3.c(this.g.b)) {
            return null;
        }
        return t22.A(this.g).g;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return t22.B(this.g, i).g;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return t22.C(this.g, i).g;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new nz2(0, this.g.a.g.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        i2 = 2;
                        break;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        i2 = 3;
                        break;
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        i2 = 4;
                        break;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        i2 = 6;
                        break;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = 7;
                        break;
                    case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
                ((ze1) this.a.g).d.h(new a11(i2));
            } else {
                i2 = 1;
                ((ze1) this.a.g).d.h(new a11(i2));
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02c6  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r19, java.util.concurrent.Executor r20, java.util.function.IntConsumer r21) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk2.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        ye1 ye1Var;
        af afVar;
        og3 og3Var;
        if (Build.VERSION.SDK_INT >= 34 && (ye1Var = this.c) != null && (afVar = ye1Var.j) != null) {
            qg3 qg3VarD = ye1Var.d();
            if (afVar.equals((qg3VarD == null || (og3Var = qg3VarD.a.a) == null) ? null : og3Var.a)) {
                boolean zS = i9.s(previewableHandwritingGesture);
                int i = 1;
                hx0 hx0Var = hx0.f;
                sf3 sf3Var = this.d;
                if (zS) {
                    SelectGesture selectGestureM = i9.m(previewableHandwritingGesture);
                    if (sf3Var != null) {
                        long jD = pq.D(ye1Var, w22.H(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1);
                        ye1 ye1Var2 = sf3Var.d;
                        if (ye1Var2 != null) {
                            ye1Var2.f(jD);
                        }
                        ye1 ye1Var3 = sf3Var.d;
                        if (ye1Var3 != null) {
                            ye1Var3.e(yg3.b);
                        }
                        if (!yg3.c(jD)) {
                            sf3Var.t(false);
                            sf3Var.q(hx0Var);
                        }
                    }
                } else if (nx0.B(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureK = nx0.k(previewableHandwritingGesture);
                    if (sf3Var != null) {
                        long jD2 = pq.D(ye1Var, w22.H(deleteGestureK.getDeletionArea()), deleteGestureK.getGranularity() != 1 ? 0 : 1);
                        ye1 ye1Var4 = sf3Var.d;
                        if (ye1Var4 != null) {
                            ye1Var4.e(jD2);
                        }
                        ye1 ye1Var5 = sf3Var.d;
                        if (ye1Var5 != null) {
                            ye1Var5.f(yg3.b);
                        }
                        if (!yg3.c(jD2)) {
                            sf3Var.t(false);
                            sf3Var.q(hx0Var);
                        }
                    }
                } else if (nx0.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureP = nx0.p(previewableHandwritingGesture);
                    if (sf3Var != null) {
                        long jG = pq.g(ye1Var, w22.H(selectRangeGestureP.getSelectionStartArea()), w22.H(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() != 1 ? 0 : 1);
                        ye1 ye1Var6 = sf3Var.d;
                        if (ye1Var6 != null) {
                            ye1Var6.f(jG);
                        }
                        ye1 ye1Var7 = sf3Var.d;
                        if (ye1Var7 != null) {
                            ye1Var7.e(yg3.b);
                        }
                        if (!yg3.c(jG)) {
                            sf3Var.t(false);
                            sf3Var.q(hx0Var);
                        }
                    }
                } else if (nx0.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureL = nx0.l(previewableHandwritingGesture);
                    if (sf3Var != null) {
                        long jG2 = pq.g(ye1Var, w22.H(deleteRangeGestureL.getDeletionStartArea()), w22.H(deleteRangeGestureL.getDeletionEndArea()), deleteRangeGestureL.getGranularity() != 1 ? 0 : 1);
                        ye1 ye1Var8 = sf3Var.d;
                        if (ye1Var8 != null) {
                            ye1Var8.e(jG2);
                        }
                        ye1 ye1Var9 = sf3Var.d;
                        if (ye1Var9 != null) {
                            ye1Var9.f(yg3.b);
                        }
                        if (!yg3.c(jG2)) {
                            sf3Var.t(false);
                            sf3Var.q(hx0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new s10(i, sf3Var));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            k71 r9 = r9.a
            java.lang.Object r9 = r9.g
            ze1 r9 = (defpackage.ze1) r9
            ue1 r9 = r9.m
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            bg3 r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk2.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((ze1) this.a.g).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new lz2(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new mz2(i, String.valueOf(charSequence)));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new nz2(i, i2));
        return true;
    }
}
