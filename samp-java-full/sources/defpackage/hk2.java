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
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        af afVar;
        long jH;
        int i;
        int i2;
        int i3;
        String string;
        qg3 qg3VarD;
        qg3 qg3VarD2;
        og3 og3Var;
        if (Build.VERSION.SDK_INT >= 34) {
            xc1 xc1Var = new xc1(22, this);
            ye1 ye1Var = this.c;
            int iU = 3;
            if (ye1Var != null && (afVar = ye1Var.j) != null) {
                qg3 qg3VarD3 = ye1Var.d();
                if (afVar.equals((qg3VarD3 == null || (og3Var = qg3VarD3.a.a) == null) ? null : og3Var.a)) {
                    boolean zS = i9.s(handwritingGesture);
                    sf3 sf3Var = this.d;
                    if (zS) {
                        SelectGesture selectGestureM = i9.m(handwritingGesture);
                        long jD = pq.D(ye1Var, w22.H(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() == 1 ? 1 : 0);
                        if (yg3.c(jD)) {
                            iU = lq.u(nx0.m(selectGestureM), xc1Var);
                        } else {
                            xc1Var.h(new nz2((int) (jD >> 32), (int) (jD & 4294967295L)));
                            if (sf3Var != null) {
                                sf3Var.h(true);
                            }
                            iU = 1;
                        }
                    } else if (nx0.B(handwritingGesture)) {
                        DeleteGesture deleteGestureK = nx0.k(handwritingGesture);
                        int i4 = deleteGestureK.getGranularity() != 1 ? 0 : 1;
                        long jD2 = pq.D(ye1Var, w22.H(deleteGestureK.getDeletionArea()), i4);
                        if (yg3.c(jD2)) {
                            iU = lq.u(nx0.m(deleteGestureK), xc1Var);
                        } else {
                            lq.P(jD2, afVar, i4 == 1, xc1Var);
                            iU = 1;
                        }
                    } else if (nx0.C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureP = nx0.p(handwritingGesture);
                        long jG = pq.g(ye1Var, w22.H(selectRangeGestureP.getSelectionStartArea()), w22.H(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() == 1 ? 1 : 0);
                        if (yg3.c(jG)) {
                            iU = lq.u(nx0.m(selectRangeGestureP), xc1Var);
                        } else {
                            xc1Var.h(new nz2((int) (jG >> 32), (int) (jG & 4294967295L)));
                            if (sf3Var != null) {
                                sf3Var.h(true);
                            }
                            iU = 1;
                        }
                    } else if (nx0.D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureL = nx0.l(handwritingGesture);
                        int i5 = deleteRangeGestureL.getGranularity() != 1 ? 0 : 1;
                        long jG2 = pq.g(ye1Var, w22.H(deleteRangeGestureL.getDeletionStartArea()), w22.H(deleteRangeGestureL.getDeletionEndArea()), i5);
                        if (yg3.c(jG2)) {
                            iU = lq.u(nx0.m(deleteRangeGestureL), xc1Var);
                        } else {
                            lq.P(jG2, afVar, i5 == 1, xc1Var);
                            iU = 1;
                        }
                    } else {
                        boolean z = nx0.z(handwritingGesture);
                        oq3 oq3Var = this.e;
                        if (z) {
                            JoinOrSplitGesture joinOrSplitGestureN = nx0.n(handwritingGesture);
                            if (oq3Var == null) {
                                iU = lq.u(nx0.x(joinOrSplitGestureN), xc1Var);
                            } else {
                                int iF = pq.f(ye1Var, pq.i(joinOrSplitGestureN.getJoinOrSplitPoint()), oq3Var);
                                if (iF == -1 || ((qg3VarD2 = ye1Var.d()) != null && pq.h(qg3VarD2.a, iF))) {
                                    iU = lq.u(nx0.m(joinOrSplitGestureN), xc1Var);
                                } else {
                                    int iCharCount = iF;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(afVar, iCharCount);
                                        if (!pq.K(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iF < afVar.g.length()) {
                                        int iCodePointAt = Character.codePointAt(afVar, iF);
                                        if (!pq.K(iCodePointAt)) {
                                            break;
                                        } else {
                                            iF += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jF = d32.f(iCharCount, iF);
                                    if (yg3.c(jF)) {
                                        int i6 = (int) (jF >> 32);
                                        xc1Var.h(new ox0(new eh0[]{new nz2(i6, i6), new dz(1, " ")}));
                                    } else {
                                        lq.P(jF, afVar, false, xc1Var);
                                    }
                                    iU = 1;
                                }
                            }
                        } else if (i9.y(handwritingGesture)) {
                            InsertGesture insertGestureL = i9.l(handwritingGesture);
                            if (oq3Var == null) {
                                iU = lq.u(nx0.x(insertGestureL), xc1Var);
                            } else {
                                int iF2 = pq.f(ye1Var, pq.i(insertGestureL.getInsertionPoint()), oq3Var);
                                if (iF2 == -1 || ((qg3VarD = ye1Var.d()) != null && pq.h(qg3VarD.a, iF2))) {
                                    iU = lq.u(nx0.m(insertGestureL), xc1Var);
                                } else {
                                    xc1Var.h(new ox0(new eh0[]{new nz2(iF2, iF2), new dz(1, insertGestureL.getTextToInsert())}));
                                    iU = 1;
                                }
                            }
                        } else if (nx0.t(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureO = nx0.o(handwritingGesture);
                            qg3 qg3VarD4 = ye1Var.d();
                            pg3 pg3Var = qg3VarD4 != null ? qg3VarD4.a : null;
                            long jI = pq.i(removeSpaceGestureO.getStartPoint());
                            long jI2 = pq.i(removeSpaceGestureO.getEndPoint());
                            ab1 ab1VarC = ye1Var.c();
                            if (pg3Var != null) {
                                br1 br1Var = pg3Var.b;
                                if (ab1VarC == null) {
                                    jH = yg3.b;
                                } else {
                                    long jV = ab1VarC.V(jI);
                                    long jV2 = ab1VarC.V(jI2);
                                    int iB = pq.B(br1Var, jV, oq3Var);
                                    int iB2 = pq.B(br1Var, jV2, oq3Var);
                                    if (iB != -1) {
                                        if (iB2 != -1) {
                                            iB = Math.min(iB, iB2);
                                        }
                                        iB2 = iB;
                                    } else if (iB2 == -1) {
                                        jH = yg3.b;
                                    }
                                    float fB = (br1Var.b(iB2) + br1Var.f(iB2)) / 2.0f;
                                    int i7 = (int) (jV >> 32);
                                    int i8 = (int) (jV2 >> 32);
                                    jH = br1Var.h(new jk2(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), fB - 0.1f, Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), fB + 0.1f), 0, m22.x);
                                }
                                if (yg3.c(jH)) {
                                    iU = lq.u(nx0.m(removeSpaceGestureO), xc1Var);
                                } else {
                                    String str = afVar.subSequence(yg3.f(jH), yg3.e(jH)).g;
                                    Pattern patternCompile = Pattern.compile("\\s+");
                                    patternCompile.getClass();
                                    str.getClass();
                                    Matcher matcher = patternCompile.matcher(str);
                                    matcher.getClass();
                                    sm1 sm1VarB = n32.b(matcher, 0, str);
                                    if (sm1VarB == null) {
                                        string = str.toString();
                                        i2 = -1;
                                        i = -1;
                                    } else {
                                        int length = str.length();
                                        StringBuilder sb = new StringBuilder(length);
                                        int i9 = 0;
                                        i = -1;
                                        while (true) {
                                            sb.append((CharSequence) str, i9, sm1VarB.b().f);
                                            if (i == -1) {
                                                i = sm1VarB.b().f;
                                            }
                                            i2 = sm1VarB.b().g + 1;
                                            sb.append((CharSequence) "");
                                            i3 = sm1VarB.b().g + 1;
                                            sm1VarB = sm1VarB.c();
                                            if (i3 >= length || sm1VarB == null) {
                                                break;
                                            } else {
                                                i9 = i3;
                                            }
                                        }
                                        if (i3 < length) {
                                            sb.append((CharSequence) str, i3, length);
                                        }
                                        string = sb.toString();
                                    }
                                    if (i == -1 || i2 == -1) {
                                        iU = lq.u(nx0.m(removeSpaceGestureO), xc1Var);
                                    } else {
                                        int i10 = (int) (jH >> 32);
                                        iU = 1;
                                        xc1Var.h(new ox0(new eh0[]{new nz2(i10 + i, i10 + i2), new dz(1, string.substring(i, string.length() - (yg3.d(jH) - i2)))}));
                                    }
                                }
                            }
                        } else {
                            iU = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new au0(iU, 5, intConsumer));
            } else {
                intConsumer.accept(iU);
            }
        }
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
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ue1 ue1Var;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                ue1Var = ((ze1) this.a.g).m;
                synchronized (ue1Var.c) {
                    try {
                        ue1Var.f = z2;
                        ue1Var.g = z3;
                        ue1Var.h = z5;
                        ue1Var.i = z;
                        if (z6) {
                            ue1Var.e = true;
                            if (ue1Var.j != null) {
                                ue1Var.a();
                            }
                        }
                        ue1Var.d = z7;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        ue1Var = ((ze1) this.a.g).m;
        synchronized (ue1Var.c) {
        }
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
