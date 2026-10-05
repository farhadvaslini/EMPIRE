package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class vx1 implements InputConnection {
    public final s a;
    public hk2 b;

    public vx1(hk2 hk2Var, s sVar) {
        this.a = sVar;
        this.b = hk2Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            if (hk2Var != null) {
                hk2Var.closeConnection();
                this.b = null;
            }
            this.a.h(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        hk2 hk2Var = this.b;
        if (hk2Var != null) {
            return hk2Var.setSelection(i, i2);
        }
        return false;
    }
}
